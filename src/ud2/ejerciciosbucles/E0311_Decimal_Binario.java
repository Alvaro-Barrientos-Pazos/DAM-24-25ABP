/* 
    Realiza un programa que convierta un número entero decimal
    en su representación binaria. Hay que tener en cuenta que 
    desconocemos cuántas cifras tiene el número que introduce 
    el usuario.
*/

package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0311_Decimal_Binario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();

        int remain = n;

        String bitString = "";

        System.out.print("Introduce el número que quieres convertir a binario: ");

        while (remain > 0) {
            bitString = remain % 2 + bitString;
            remain = remain/2;
        }

        System.out.println("El binario es:\n"+bitString);
    }

}
