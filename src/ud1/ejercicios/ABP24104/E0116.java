/* 
Solicita al usuario tres distancias:
- La primera, medida en milímetros.
- La segunda, medida en centímetros.
- La última, medida en metros.

Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en
centimetros).
 */
package ud1.ejercicios.ABP24104;

import java.util.Scanner;

public class E0116 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int mm;
        int cm;
        int m;


        System.out.println("Introduce tres unidades de medida para la conversión total a centímetros: ");
        System.out.println("Introduce la cantidad de milímetros");
        mm = sc.nextInt();

        System.out.println("Introduce la cantidad de centímetros");
        cm = sc.nextInt();

        System.out.println("Introduce la cantidad de metros");
        m = sc.nextInt();
        sc.close();

        int totalCm = (mm/10) + cm + (m * 100);

        System.out.println("El número total de centímetros es de: "+totalCm);

    }

}