
/*
EI DNI consta de un entero de 8 digitos seguido de una letra que se obtiene a
partir del número de la siguiente forma:
letra = número DNI módulo 23
Basándote en esta información, elige la letra a partir de la numeración de la siguiente tabla:
 */
package ud2.ejercicios2;

import java.util.Scanner;

public class EP0212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nString;
        int sLongitud;

        boolean esCapicua = false;

        System.out.println("Introduce un número del 0 al 9999");
        nString = sc.nextLine();
        sLongitud = nString.length();

    }
}
