/* 
Repite el programa anterior para que, indicando dos números n y m, diga que cantidad hay que sumarle a n para que sea múltiplo de m.

Programa anterior: 
Escribe un programa que tome como entrada un número entero e indique qué cantidad hay que sumarle para que el resultado sea múltiplo de 7. Un ejemplo:

A 2 hay que sumarle 5 para que el resultado (2+5=7) sea múltiplo de 7.
A 13 hay que sumarle 1 para que el resultado (13+1=14) sea múltiplo de 7.
A 14 no hay que sumarle nada (0) para que sea múltiplo de 7



*/

package ud1.ejercicios.epo_ejercicios;

import java.util.Scanner;

public class EP0130 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        System.out.printf("Introduce el número múltiplo %d: ",n);
        int m = sc.nextInt();

        sc.close();

        int diff = n-(m%n);
        
        String mensaje = diff == n ? "%d es múltiplo de " + n : "%d necesita sumar %d ser múltiplo de " + n;
        
        System.out.printf(mensaje,m,diff);
        
    }
}
