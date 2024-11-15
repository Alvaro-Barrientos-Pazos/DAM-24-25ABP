package ud2.practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Supermercado {

    static final String EXIT_MESSAGE = "\n - El programa ha sido finalizado -\n";
    static final char MONEDA = '€';

    public static void main(String[] args) {
        menuPrincipal();

    }

    public static void menuPrincipal() {
        
        

        Scanner sc = new Scanner(System.in);
        
        double currPrice = 0, totalPrice = 0;
        int quantity = 0, nProductos = 1;

        

        boolean isValidInput = true;
        boolean isFinished = false;

        System.out.println("\nIntroduce el precio y número de productos de la cesta:");

        do {

            do {
                
                try{
                    System.out.printf("Introduce el precio del producto #%d\n",nProductos);
                    currPrice = sc.nextDouble();
                    isValidInput = true;
                } 
                catch (InputMismatchException e) {
                    System.out.println("Solo se aceptan números positivos con un máximo de 2 decimales");
                    sc.nextLine(); // Limpia el buffer
                    isValidInput = false;
                }

                if (currPrice < 0){
                    if (currPrice == -1){
                        System.out.println("El programa ha sido finalizado");
                        sc.close();
                        return;

                    }
                }
            
            } while (isValidInput == false );

            currPrice = Math.floor(currPrice * 100.0) / 100.0;

            totalPrice += currPrice;

            do {

                try{
                    System.out.println("Introduce la cantidad de productos");
                    quantity = sc.nextInt();
                    isValidInput = true;
                } 
                catch (InputMismatchException e) {
                    System.out.println("Solo se aceptan números enteros");
                    sc.nextLine(); // Limpia el buffer
                    isValidInput = false;
                }
                
            } while (isValidInput == false);

            
            if (quantity == -1) {
                exitProgram(sc);
                return;
            }

            

            System.out.printf("%d: %.2f x %d\n",nProductos,currPrice,quantity);
            nProductos++;


        }while (isFinished == false);

        sc.close();
    }


    static void exitProgram(Scanner sc){
        System.out.println(EXIT_MESSAGE);
        sc.close();
    }
    

}
