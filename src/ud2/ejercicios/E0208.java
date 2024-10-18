/*
Pedir los coeficientes de una ecuación de segundo grado y mostrar sus 
soluciones reales. 

    (ax² + bx + c = 0) 

    x = -b + sqr(b²-4 * a *c ) / (a*2)
    x = -b - sqr(b²-4 * a *c ) / (a*2)

*/

package ud2.ejercicios;

import java.util.Scanner;

public class E0208 {

    public static void main(String[] args) {
        
        double a, b, c;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor de a: ");
        a = sc.nextDouble();

        System.out.println("Introduce el valor de b: ");
        b = sc.nextDouble(); 

        System.out.println("Introduce el valor de c: ");
        c = sc.nextDouble(); 
        sc.close();

        double disc = b*b - 4 * (a * c);
        double sqr;

        if (disc < 0){
            System.out.println("El ejercicio no tiene solucion en números reales");
        }

        else {
            sqr = Math.sqrt(disc);
            
            double Positive = -b + sqr;
            double Negative = -b - sqr;

            Positive = Positive / (2*a);
            Negative = Negative / (2*a);
        
            System.out.println("El primer resultado es: "+Positive);
            System.out.println("El segundo resultado es: "+Negative);

        }




        
        



                
        


    }


}
