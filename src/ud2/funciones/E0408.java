/*
 * Diseñar la función calculadora(), a la que se le pasan dos números reales (operandos) y qué operación se 
 * desea realizar con ellas. Las operaciones disponibles se especifican con un número y son: 
 *      sumar(1), restar(2), multiplicar(3) o dividir(4). 
 *
 *  La función devolverá el resultado de la operación mediante un número real.
*/

package ud2.funciones;

import java.util.Scanner;

public class E0408 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selecciona el operador:\n(1) sumar\n(2) restar\n(3) multiplicar\n(4) dividir");
        byte operator = -1;

        while (operator < 0 || operator > 4) {
            operator = sc.nextByte();
            if (operator < 0 || operator > 4){
                System.out.printf("%d no es una opción valida\n",operator);
            }
        }
        
        char operatorSymbol = operator>3?'%':operator>2?'*':operator>1?'-':'+';

        System.out.printf("Introduce el valor de A:   A %s B\n",operatorSymbol);
        double a = sc.nextDouble();
        
        System.out.printf("Introduce el valor de B:   %.2f %s B\n",a,operatorSymbol);
        double b = sc.nextDouble();
        sc.close();


        System.out.printf("%.2f %s %.2f = %.2f\n",a,operatorSymbol,b,calculadora(a, b, operator));
    }

    static double calculadora(double a, double b, byte operator) {
        
        switch (operator) {
            case 1:
                return a+b;
            
            case 2:
                return a-b;

            case 3:
                return a*b;
            
            case 4:
                return a/b;
            default:
                System.out.println("el operador seleccionado es invalido");
                return 0;
        }
    }

}
