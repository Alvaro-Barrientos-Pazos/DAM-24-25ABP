/*
Utiliza el operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado.
*/
package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce un número para calcular su valor absoluto");
        double n = sc.nextDouble();
        sc.close();
        
        double nAbs = n < 0 ? n*-1 : n;

        System.out.printf("El valor absolute de %.2f es %.2f",n,nAbs);
    }
}
