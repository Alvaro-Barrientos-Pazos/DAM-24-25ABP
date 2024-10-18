/*
Solicitar dos números y mostrar cuál es el mayor o si son iguales
 
 */

package ud2.ejercicios;

import java.util.Scanner;

public class E0206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d1;
        double d2;

        String mensaje;

        System.out.println("Introduce un valor para el primer número: ");
        d1 = sc.nextDouble();

        System.out.println("Introduce un valor para el segundo número: ");
        d2 = sc.nextDouble();
        sc.close();


        if (d1 == d2) {
            mensaje = "Ambos números tienen el mismo valor";
            
        }
        else if (d1 > d2) {
            mensaje = d1+" es mayor que "+d2;
        }
        else {
            mensaje = d2+" es mayor que "+d1;
        }

        System.out.println(mensaje);

    }
}
