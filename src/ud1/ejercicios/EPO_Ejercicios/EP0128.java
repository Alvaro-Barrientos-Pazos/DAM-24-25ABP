/* 
Pide dos números al usuario: a y b. Deberá mostrarse true si ambos números son iguales y false en caso contrario.
*/

package ud1.ejercicios.epo_ejercicios;

import java.util.Scanner;

public class EP0128 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int d1 = sc.nextInt(); 

        System.out.print("Introduce el segundo número entero: ");
        int d2 = sc.nextInt(); 
        sc.close();

        String mensaje = d1 == d2 ? "Ambos números tienen el mismo valor" : "Los números son diferentes" ;

        System.out.println(mensaje);
        
    }
}
