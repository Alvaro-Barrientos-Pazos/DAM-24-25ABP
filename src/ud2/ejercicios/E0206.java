/*
Solicitar dos números y mostrar cuál es el mayor o si son iguales
 
 */

package ud2.ejercicios;

import java.util.Scanner;

public class E0206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1;
        double n2;

        String mensaje;

        System.out.println("Introduce un valor para el primer número: ");
        n1 = sc.nextDouble();

        System.out.println("Introduce un valor para el segundo número: ");
        n2 = sc.nextDouble();
        sc.close();


        if (n1 == n2) {
            mensaje = "Ambos números tienen el mismo valor";
            
        }
        else if (n1 > n2) {
            mensaje = n1+" es mayor que "+n2;
        }
        else {
            mensaje = n2+" es mayor que "+n1;
        }

        System.out.println(mensaje);

    }
}
