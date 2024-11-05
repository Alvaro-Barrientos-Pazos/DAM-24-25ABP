/* 
    Pedir diez números enteros por teclado y mostrar la media
*/
package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0308 {

    public static void main(String[] args) {
        
        final byte N_VALUES = 10;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce números enteros: ");

        int counter = 0, n;
        String message="";

        while (counter <= N_VALUES){
            n = sc.nextInt();
            message.format(message+"%d", n);

            counter++;

            if (counter < N_VALUES) {
                message+=" + ";    
            }



        }

        System.out.println(message);
    }

}
