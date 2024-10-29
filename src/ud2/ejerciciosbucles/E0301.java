/*
    Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo y su cuadrado. 
    El proceso se repetirá hasta que el número introducido sea 0.

*/
package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0301 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número ( 0 cierra el programa ): ");
        int input = sc.nextInt();

        while (input!=0) {

            System.out.printf("%d es %s  %d² = %d\n",
                input,
                input%2==0?"es par":"es impar",
                input,
                input*input);
            
            System.out.print("Introduce un número ( 0 cierra el programa ): ");
            input = sc.nextInt();
            
        }
        sc.close();


    }
}
