/* 
Convertir una temperatura introducida por teclado en grados Celsius o centígrados a grados 
Farenheit, mostrando el resultado por pantalla.
    F = C * (9/5) + 32

*/

package ud1.ejercicios.EPO_Ejercicios;

import java.util.Scanner;

public class EP0121 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        byte u;
        double c;
        
        double cDestino;
        String uDestino;

        System.out.println("Introduce la unidad de medida:\n- Celsius = 0\n- Farenheit = 1");
        u = sc.nextByte();

        System.out.print("Introduce la cantidad a convertir: ");
        c = sc.nextDouble();
        sc.close();

        // Añadimos un punto a las divisiones con números literales para que no los convierta en números enteros y nos de 0 la división.
        // 5/9 = 0      
        // 5./9 = 0.5555555555555556
        cDestino = u == 0 ? (c * 9./5) + 32 : 5./9 * (c - 32) ;

        uDestino = u == 0 ? "Fº" : "Cº";

        System.out.printf("El resultado es: %f%s",cDestino,uDestino);

    }
}