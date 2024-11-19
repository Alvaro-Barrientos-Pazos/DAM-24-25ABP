package ud2.practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Supermercado {

    static final char COIN_SIGN = '€';
    static Scanner sc;

    static double totalPrice;
    

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        boolean isLooping = true;

        System.out.println("\nPrograma: Cesta de la compra  ( Para terminar el programa Introduzca un número negativo en cualquier punto del programa )");

        while (isLooping) {
            shoppingCart();
            paymentSelector();

            isLooping = isUserConfirmationInput("¿Quiere realizar iniciar una nueva cesta?:   (S)i / (N)o");
        }        

    }


    public static void shoppingCart() {
        
        double currPrice = 0, tPrice = 0;
        int quantity = 0, nProductos = 1;

        boolean isValidInput = true;
        boolean isLooping = true;
       
        do {

            currPrice = InputMisMatchDouble(String.format("Introduzca el precio del producto #%d: ",nProductos));

            earlyExit(currPrice);

            //FIX: Algunos decimales pierden precisión por lo que sumamos una pequeña cantidad para intentar compensar.
            currPrice = Math.floor(currPrice * 100.0 + 0.00001)/100.0;

            do {

                System.out.printf("Cantidad de producto #%d por %.2f%c: ", nProductos, currPrice, COIN_SIGN);
                isValidInput = true;
                
                try{
                    quantity = sc.nextInt();    
                } 
                catch (InputMismatchException e) {
                    System.out.println("Solo se aceptan números enteros");
                    sc.nextLine(); // Limpia el buffer
                    isValidInput = false;
                }
                
            } while (isValidInput == false);


            earlyExit(quantity);

            System.out.printf("Se ha registrado el producto #%d: %.2f%c x %d\n", nProductos, currPrice, COIN_SIGN, quantity);
            
            tPrice += currPrice * quantity;
            nProductos++;

            System.out.printf("El total es de: %.2f%c\n",tPrice,COIN_SIGN);
            isLooping = isUserConfirmationInput("\n¿Desea añadir nuevos productos a la cesta?:  (S)i / (N)o");

        } while (isLooping);

        totalPrice = tPrice;
        
    }


    static void paymentSelector(){

        int input = -1;
        boolean isValidInput = true;

        do {
            System.out.printf("\"El precio total es de: %.2f%c. Por favor seleccione el método de pago:\n(1) Tarjeta\n(2) Metálico\n", totalPrice, COIN_SIGN);
            isValidInput = true;

            try {
                input = sc.nextInt();
                
            }
            catch (InputMismatchException e){
                isValidInput = false;
            }

            if (input == 1){
                System.out.println("Gracias por su compra");
            }

            else if (input != 2){
                earlyExit(input);
                isValidInput = false;
            }

        } while (isValidInput == false);

        cashPayment();

    }


    static void cashPayment(){
        
        double balance = validateCashPayment();

        earlyExit(balance);

        if (balance == 0){
            System.out.println("Gracias por su compra");
        }
        else{
            changeCalculator(balance);
        }
        
    }

    static void changeCalculator(double balance){

        final int FIVE_HUNDRED = 500;
        final int TWO_HUNDRED  = 200;
        final byte HUNDRED     = 100;
        final byte FIFTY       = 50;
        final byte TWENTY      = 20;
        final byte TEN         = 10;
        final byte FIVE        = 5;
        final byte TWO         = 2;
        final byte ONE         = 1;


        System.out.printf("Sobran %.2f%c",balance,COIN_SIGN);

        int integer = (int)(balance + 0.00001);
        double decimalsBill = (totalPrice-(int)totalPrice);
        double decimals = (balance-integer);

        if ( decimals < decimalsBill ){
            integer -= 1;
            decimals += 100;
        }
        
        System.out.printf("\nBilletes de 500%c: %d", COIN_SIGN, integer / FIVE_HUNDRED);
        integer = integer%FIVE_HUNDRED;

        System.out.printf("\nBilletes de 200%c: %d", COIN_SIGN, integer / TWO_HUNDRED);
        integer = integer%TWO_HUNDRED;
        
        System.out.printf("\nBilletes de 100%c: %d", COIN_SIGN, integer / HUNDRED);
        integer = integer%HUNDRED;
        
        System.out.printf("\nBilletes de 50%c: %d", COIN_SIGN, integer / FIFTY);
        integer = integer%FIFTY;
        
        System.out.printf("\nBilletes de 20%c: %d", COIN_SIGN, integer / TWENTY);
        integer = integer%TWENTY;
        
        System.out.printf("\nBilletes de 10%c: %d", COIN_SIGN, integer / TEN);
        integer = integer%TEN;
        
        System.out.printf("\nBilletes de 5%c: %d", COIN_SIGN, integer / FIVE);
        integer = integer%FIVE;

        System.out.printf("\nMonedas de 2%c: %d", COIN_SIGN, integer / TWO);
        integer = integer%TWO;

        System.out.printf("\nMonedas de 1%c: %d", COIN_SIGN, integer / ONE);
        integer = integer%ONE;

        System.out.printf("\nMonedas de 1cent: %d\n", (int)(decimals * 100 + 0.0001));

    }

    
    static double validateCashPayment(){
        double cash = -1;
        boolean isLooping = false;

        do {
            cash = InputMisMatchDouble("Introduzca la cantidad de dinero que quiere usar para el pago: ");

            earlyExit(cash);

            if ( totalPrice > cash ){
                System.out.printf("La cantidad no es suficiente para cubrirer el coste de %.2f%c faltan %.2f%c\n",totalPrice,COIN_SIGN,totalPrice-cash,COIN_SIGN);
                isLooping = true;
            }
            else{
                isLooping = false;
            }

        }while(isLooping);
        

        return cash-totalPrice;
    }


    static boolean isUserConfirmationInput(String msg){
        boolean isValidInput = true;
        char inputChar = '\0';

        sc.nextLine();

        do {

            System.out.println(msg);
            isValidInput = true;

            try {
                inputChar = sc.nextLine().toUpperCase().charAt(0);
            }
            catch (InputMismatchException e) {
                System.out.println("Exception: "+e);
                System.out.println("Introduzca una de las letras validas");
                sc.nextLine();
                isValidInput = false;
            }

            if (inputChar != 'S' && inputChar != 'N'){
                if (inputChar == '-'){
                    earlyExit(-1);
                }
                
                System.out.println(inputChar +" no es una letra valida");
                isValidInput = false;
            }


        } while (isValidInput == false);

        return inputChar == 'S'? true:false;
    }


    static double InputMisMatchDouble(String msg_try){
      
        final String MSG_ERROR = "Solo se aceptan números positivos con un máximo de 2 decimales" ;

        boolean isValidInput = false;
        double inputValue = -1;

        do{

            System.out.print(msg_try);
            isValidInput = true;

            try{
                inputValue = sc.nextDouble();
            } 
            catch (InputMismatchException e) {
                System.out.println(MSG_ERROR);
                sc.nextLine(); // Limpia el buffer
                isValidInput = false;
            }

        } while ( isValidInput == false );

        return inputValue;

    }


    static void earlyExit(double input){
        final byte EARLY_EXIT_THRESHOLD = 0;
        final String EXIT_MESSAGE = "\n - El usuario ha decidido finalizar el programa -\n";

        if (input < EARLY_EXIT_THRESHOLD){
            System.out.println(EXIT_MESSAGE);
            sc.close();
            System.exit(0);
        }
    }


}
