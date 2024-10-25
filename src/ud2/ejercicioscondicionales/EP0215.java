/*
 Escribe una aplicación que solicite por consola dos números reales que corresponden a la base y la altura de un triángulo. 
 Deberá mostrarse su área, comprobando que los números introducidos por el usuario no son negativos, algo que no tendría sentido.

 */
package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0215 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Introduce las siguientes medidas para calcular el area de un triangulo ");
        System.out.print("Base en cm: ");
        double base = sc.nextDouble();

        System.out.print("Altura en cm: ");
        double altura = sc.nextDouble();


        if (base <1 || altura <1){
            System.out.println("Los números deben ser mayores que cero ");
        }
        else{
            System.out.printf("El area del triangulo es: %.2fcm2",base*altura/2.);
        }

    }
}
