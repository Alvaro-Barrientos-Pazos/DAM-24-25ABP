/* 
Crea un programa que pida la base y la altura de un triángulo y muestre su área.
    Área Triángulo = (base * altura) / 2

 */
package ud1.ejercicios.EPO_Ejercicios;

import java.util.Scanner;

public class EP0112 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base;
        double altura;

        System.out.println("¿Cual es la base del triángulo?");
        base = sc.nextDouble();

        System.out.println("¿Cual es la altura del triángulo?");
        altura = sc.nextDouble();
        sc.close();

        System.out.println("El area del triángulo es de: "+ (base*altura)/2);

    }
}
