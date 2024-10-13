/* 
Convertir una temperatura introducida por teclado en grados Farenheit a grados Celsius o centígrados, mostrando el resultado por pantalla. 
    C = 5/9 * (f-32)
*/

package ud1.ejercicios.ABP24104;

import java.util.Scanner;

public class E0122 {
    public static void main(String[] args) {
        // Convertir una temperatura introducida por teclado en grados Farenheit a grados Celsius o centígrados, mostrando el resultado por pantalla.

        Scanner sc = new Scanner(System.in);
        int f;
        int c;

        System.out.println("Introduce una temperatura en grados Farenheit para la conversión en Celsius");
        System.out.println("Introduce la cantidad de grados Farenheit: ");

        f = sc.nextInt();
        sc.close();
        c = (5/9)*(f-32);

        System.out.println("El resultado es: "+c+"Cº");
    }
}
