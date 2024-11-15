package ud2.practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Supermercado {

    static final String EXIT_MESSAGE = "\n - El programa ha sido finalizado -\n";
    static final char COIN_SIGN = '€';

    static final byte EARLY_EXIT_THRESHOLD = 0;

    public static void main(String[] args) {
        menuPrincipal();

    }

    public static void menuPrincipal() {
        
        

        Scanner sc = new Scanner(System.in);
        
        double currPrice = 0, totalPrice = 0;
        int quantity = 0, nProductos = 1;

        boolean isValidInput = true;
        boolean isFinished = false;

        final char EXIT_CHAR = 'N';

        System.out.println("\nPrograma: Cesta de la compra  ( Para terminar el programa introduce un número negativo en cualquier punto del programa )");

        do {

            do {
                
                try{
                    System.out.printf("Precio del producto #%d: ",nProductos);
                    currPrice = sc.nextDouble();
                    isValidInput = true;
                } 
                catch (InputMismatchException e) {
                    System.out.println("Solo se aceptan números positivos y un máximo de 2 decimales");
                    sc.nextLine(); // Limpia el buffer
                    isValidInput = false;
                }
            
            } while (isValidInput == false );


            if (checkEarlyExit((int)currPrice, sc)) {
                return;
            }

            currPrice = Math.floor(currPrice * 100.0)/100.0;
            System.out.println("currPrice: "+currPrice);

            totalPrice += currPrice;

            do {

                try{
                    System.out.printf("Cantidad de producto #%d: ",nProductos);
                    quantity = sc.nextInt();
                    isValidInput = true;
                } 
                catch (InputMismatchException e) {
                    System.out.println("Solo se aceptan números enteros");
                    sc.nextLine(); // Limpia el buffer
                    isValidInput = false;
                }
                
            } while (isValidInput == false);

            
            if (checkEarlyExit(quantity, sc)) {
                return;
            }


            System.out.printf("Se ha registrado el producto #%d: %d x %.2f%c\n",nProductos,quantity,currPrice,COIN_SIGN);
            nProductos++;

            System.out.println("¿Desea añadir nuevos productos a la cesta?:  (S)i / (N)o");
            
            try {
                if ( EXIT_CHAR == sc.nextLine().toUpperCase().charAt(0)){
                    System.out.printf("El precio total es de: %.2f%c",totalPrice,COIN_SIGN);
                    isFinished = true;
                }
            }
            catch (InputMismatchException e) {
                sc.nextLine();
            }
            
        }while (isFinished == false);

        chargeImport(sc);


        sc.close();
    }


    // Esto me parece bastante horrendo, pero es por usar un poco las funciones. 
    // Motivos por los que resulta horrendo:
    // Primero el tipo del argumento es diferente en ambos casos en los que se usa esta funcion. Lo cual fueza a usar una supercharge o un casting, opte por el menor de los males
    // Terminar el programa de esta forma fuerza a usar 2 ifs en vez de 1 por cada una de las veces que se llama la funcion checkEarlyExit()
    // Al pasar el Scanner como argumento para cerrarlo en otra funcion, estamos ofuscando el estado del objecto. No sabremos a primer vistazo si se cerro el objecto o no hasta que entremos en la siguiente funcion.
    // Si dejamos el sc.close fuera de la nueva funcion el contenido de la misma es tan escueto que es dificil justificar su inclusion para ser llamada tan solo 2 veces en todo el programa.
    // El rendimiento es peor.
    static boolean checkEarlyExit(int inputValue, Scanner sc){
        if (inputValue < EARLY_EXIT_THRESHOLD) { 
            System.out.println(EXIT_MESSAGE);
            sc.close();
            return true;
        }

        return false;
    }
    

    static void chargeImport(Scanner sc) {
        double Balance = sc.nextDouble();

        



    }


}
