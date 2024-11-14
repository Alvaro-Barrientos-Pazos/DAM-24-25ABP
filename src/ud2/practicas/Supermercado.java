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
        
        double price = 0, quantity;

        boolean isValidPrice = false;

        while (isValidPrice == false ){
            isValidPrice = false;

            try{
                System.out.println("Introduce el precio de cada producto (con un máximo de 2 decimales)");
                price = sc.nextDouble();
            } 
            catch (InputMismatchException e) {
                System.out.println("Solo se aceptan números");
                sc.nextLine(); // Limpia el buffer
                isValidPrice = true;
            }
            
        } while (isValidPrice);

        price = Math.floor(price * 100.0) / 100.0;


        System.out.println("Introduce la cantidad de productos");
        try{
            quantity = sc.nextDouble();
        } 
        catch (InputMismatchException e){
            System.out.println("Solo se aceptan números enteros");
        }

        sc.close();







    }

}
