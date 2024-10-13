/* 
Dado el siguiente polinomio de segundo grado:

    y = ax2 + bx + c

Crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor correspondiente de y.
 */

package ud1.ejercicios.EP0_Ejercicios;

import java.util.Scanner;

public class EP0113 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;
        double x;
        double y;

        System.out.println("Introduce el valor de A,B,C y X");
        System.out.println("A: ");
        a = sc.nextDouble();

        System.out.println("B: ");
        b = sc.nextDouble();
        
        System.out.println("C: ");
        c = sc.nextDouble();
        
        System.out.println("X: ");
        x = sc.nextDouble();
        sc.close();

        double resultado = a*(x*x) + b*x + c;
        
        System.out.println("resultado: "+resultado);


    /*
        double raizQ = Math.sqrt( (b*b) -4*a*c );

        double rPositivo = (-b+raizQ)/ (2*a);
        double rNegativo = (-b-raizQ)/ (2*a);

        System.out.println("Los resultados son: "+rPositivo+" y "+rNegativo );
    */

        



    }
}
