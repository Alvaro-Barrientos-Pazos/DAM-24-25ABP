/* 
    Escribir una aplicación para aprender a contar, que pedirá un 
    número n y mastrará todos los números del 1 al n.
*/
package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0306 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();
        int i = 0;

        while (i<=n) {
            System.out.print(i+" ");
            i++;
        }

        sc.close();
    }

}
