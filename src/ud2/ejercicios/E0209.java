/*
Escribir una aplicación que indique cuántas cifras tiene un número entero 
introducido por teclado, que estará comprendido entre 0 y 99999.

Realiza una versión del programa anterior para que indique cuantes cifras 
tiene un número comprendido entre -99999 y 99999

 */

package ud2.ejercicios;

import java.util.Scanner;

public class E0209 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un valor entre 0 y 99999: ");
        int num = sc.nextInt();
        int resto;   
        int nDigitos;

        if (num/10000. >= 1.){
            nDigitos = 5;
        }
        else if (num/1000. >= 1.){
            nDigitos = 4;
        }
        else if (num/100. >= 1.){
            nDigitos = 3;
        }
        else if (num/10. >= 1.){
            nDigitos = 2;
        }
        else {
            nDigitos = 1;
        }

        System.out.println("El número tiene "+nDigitos+" dígito/s");
    }
}
