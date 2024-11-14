package ud2.practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
        menuPrincipal();

    }

    public static void menuPrincipal() {
        
        final char MONEDA = '€';

        Scanner sc = new Scanner(System.in);
        
        double currPrice = 0, totalPrice = 0;
        int input = 0, quantity = 0, nProductos = 0;

        boolean isValidInput = false;


        while (input != -1); {

            while (isValidInput == false ){
                isValidInput = false;

                try{
                    System.out.println("Introduce el precio de cada producto (con un máximo de 2 decimales)");
                    currPrice = sc.nextDouble();
                } 
                catch (InputMismatchException e) {
                    System.out.println("Solo se aceptan números positivos");
                    sc.nextLine(); // Limpia el buffer
                    isValidInput = true;
                }
                
            } while (isValidInput);

            if (currPrice == -1) {
                System.out.println("El ha sido finalizado");
                sc.close();
                return;
            }

            currPrice = Math.floor(currPrice * 100.0) / 100.0;

            totalPrice += currPrice;

            while (isValidInput == false ){
                isValidInput = false;

                try{
                    System.out.println("Introduce la cantidad de productos");
                    quantity = sc.nextInt();
                } 
                catch (InputMismatchException e) {
                    System.out.println("Solo se aceptan números enteros");
                    sc.nextLine(); // Limpia el buffer
                    isValidInput = true;
                }
                
            } while (isValidInput);

            
            if (quantity == -1) {
                System.out.println("El ha sido finalizado");
                sc.close();
                return;
            }

            nProductos++;
            System.out.printf("%d: %.2f x %d\n",nProductos,currPrice,quantity);

            sc.close();

            

        }
    }

}
