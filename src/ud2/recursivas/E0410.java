/*
    Diseña una función que calcule a^n, donde a es real y n es entero no negativo.
    Realizar una versión  iterativa y otra recursiva.
 */

package ud2.recursivas;

import java.util.Scanner;

public class E0410 {

    public static void main(String[] args) {
        
        System.out.println(potencia(2, 2));
        System.out.println(potencia(2, 4));



    }


    public static int potencia(int a, int p) {
        int result = 0;
        
        if (p == 0) {
            return potencia(a, p-1);
        }
        

        return result;
        
    }


}
