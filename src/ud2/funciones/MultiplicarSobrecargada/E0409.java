/* 
 * Repetir la actividad E0404 con una versión que calcule el máximo de tres números enteros.
*/

package ud2.funciones.MultiplicarSobrecargada;

import java.util.Scanner;
import ud2.Util;

public class E0409 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.println("Introduce el primer número entero:");
        a = sc.nextInt();
        System.out.println("Introduce el segundo número entero:");
        b = sc.nextInt();
        System.out.println("Introduce el tercer número entero:");
        c = sc.nextInt();
        sc.close();

        System.out.printf("el mayor es: %d\n",Util.esMayor(a, b, c));
    }

}