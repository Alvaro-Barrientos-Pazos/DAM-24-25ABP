
/*
Escribe una aplicación que solicite al usuario un número comprendido entre 0 y
9999. La aplicación tendrá que indicar si el número introducido es capicúa
 */
package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0211 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nString;
        int sLongitud;

        boolean esCapicua = false;

        System.out.println("Introduce un número del 0 al 9999");
        nString = sc.nextLine();
        sLongitud = nString.length();


        switch (sLongitud) {
            case 1:
                esCapicua = true;
                break;
                
            case 2:
                esCapicua = nString.charAt(0) == nString.charAt(1);
                break;
            
            case 3:
                esCapicua = nString.charAt(0) == nString.charAt(2);
                break;

            case 4:
                esCapicua = nString.charAt(0) == nString.charAt(3);
                esCapicua = nString.charAt(1) == nString.charAt(2);
                break;
        }

        System.out.printf("El número %s %s\n",nString, esCapicua?"es capicúa":"no es capicúa");


    }
}
