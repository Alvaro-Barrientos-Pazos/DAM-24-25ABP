/*
    Escribir una función a la que se le pase un número entero y devuelva el número
    de divisores primos que tiene.
*/

package ud2.funciones;

import java.util.Scanner;

public class E0407 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        System.out.println("El número de divisores primos: "+nDivisoresPrimos(sc.nextInt()));
        sc.close();


    }


    public static int nDivisoresPrimos(int n) {
        int nPrimos = 0;

        for (int i = n; i==0; i--){
            
            if (n%i == 0 && i%i == 0){
                nPrimos++;
            }
            
        }

        return nPrimos;
    }


}
