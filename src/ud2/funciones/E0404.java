/* 
    Diseñar una función que recibe como parámetros dos números enteros y
    devuelve el máximo de ambos.
*/

package ud2.funciones;

import java.util.Scanner;
import ud2.Util;

public class E0404 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a,b;

        System.out.println("Introduce el primer número enteros:");
        a = sc.nextInt();
        System.out.println("Introduce el segundo número enteros:");
        b = sc.nextInt();
        sc.close();

        System.out.printf("el mayor es: %d\n",Util.esMayor(a, b));
    }

}
