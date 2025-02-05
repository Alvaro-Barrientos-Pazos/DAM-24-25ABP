/* 
Realiza un programa que intercambie los valores de dos variables.
*/

package ud1.ejercicios.epo_ejercicios;

import java.util.Scanner;

public class EP0127 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un valor numérico para \"a\": ");
        double a = sc.nextDouble(); 

        System.out.print("Introduce un valor numérico para \"b\": ");
        double b = sc.nextDouble(); 
        sc.close();

        double t = a;
        a = b;
        b = t;

        System.out.printf("Al intercambiar los valores de las variables el resultado es: \na: %f\nb: %f",a,b);
        
    }
}
