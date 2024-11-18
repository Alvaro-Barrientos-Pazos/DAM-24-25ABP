package pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class prueba4 {

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        try{
            numero = sc.nextInt();    
        } 
        catch (InputMismatchException e) {
            System.out.println("Solo se aceptan números enteros");
            sc.nextLine(); // Limpia el buffer
        }

        int x=0;

        if (x == 0 && 10/x > 1) {
            // Código
        }


        if (x != 0 && 10/x > 1) {
            // Código
        }

    }

}
