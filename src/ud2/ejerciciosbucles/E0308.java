/* 
    Pedir diez números enteros por teclado y mostrar la media
*/
package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0308 {

    public static void main(String[] args) {
        
        final byte N_VALUES = 4;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce números enteros: ");

        int counter = 0, n = 0 ;

        while (counter < N_VALUES){
            n += sc.nextInt();
            
            counter++;

        }
        System.out.printf("La media es: %.2f",(float)(n/counter));
    }

}
