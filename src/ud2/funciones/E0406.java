/*
    Diseñar una función con el siguiente prototipo:
    
        boolean esPrimo(int n)
    
    que devolverá true si n es primo y false en caso contrario.
*/

package ud2.funciones;

import java.util.Scanner;

public class E0406 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero: ");
        System.out.println("Es Primo: "+esPrimo(sc.nextInt()));
        sc.close();
    }

    static boolean esPrimo(int n){

        if (n <= 1){
            return false;
        }

        for (int i = 2; i < n; i++){
            if ( n%i == 0){
                return false;
            }
        }

        return true;
    }

}
