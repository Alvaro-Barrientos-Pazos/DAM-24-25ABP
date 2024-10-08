package ud1.ejercicios;

import java.util.Scanner;

public class E0113 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double x;
        double y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor de A,B,C y X");
        System.out.println("A: ");
        a = sc.nextDouble();

        System.out.println("B: ");
        b = sc.nextDouble();
        
        System.out.println("C: ");
        c = sc.nextDouble();
        
        System.out.println("X: ");
        x = sc.nextDouble();

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
