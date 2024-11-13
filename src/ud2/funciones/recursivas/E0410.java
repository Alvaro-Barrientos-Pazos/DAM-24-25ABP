/*
    Diseña una función que calcule a^n, donde a es real y n es entero no negativo.
    Realizar una versión  iterativa y otra recursiva.
 */

package ud2.funciones.recursivas;

import java.util.Scanner;

public class E0410 {

    public static void main(String[] args) {
        
        System.out.println(potencia(2, 10));
        System.out.println(potencia(2, 8));
    }


    static int potencia(int n, int e) {

        if (e == 0) {
            return 1;
        }

        if (e > 0) {
            return n * potencia(n, e - 1);
        } 
        
        else {
            return 1 / potencia(n, -e);
        }
    }
    

}
