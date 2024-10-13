/* 
Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita una aplicación que le ayude a contabilizar el número de patas 
que tienen en total todos los animales capturados durante una jornada de trabajo. Para ello, te ha solicitado que escribas una aplicación a la que hay que proporcionar:
- El número de hormigas capturadas    (6 patas).
- El número de arañas capturadas      (8 patas).
- El número de cochinillas capturadas (14 patas).

La aplicación debe mostrar el número total de patas.
 */

package ud1.ejercicios.EP0_Ejercicios;

import java.util.Scanner;

public class EP0117 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final byte NUM_PATAS_HORMIGAS    = 6;
        final byte NUM_PATAS_ARANAS      = 8;
        final byte NUM_PATAS_COCHINILLAS = 14;

        int nPatasTotal;


        System.out.println("Introduce el número de hormigas");
        nPatasTotal = NUM_PATAS_HORMIGAS * sc.nextInt();  

        System.out.println("Introduce el número de arañas");
        // Estas dos lineas hacen exactamente lo mismo. += suma el valor al valor actual de la variable.
        // nPatasTotal = nPatasTotal + NUM_PATAS_ARANAS * sc.nextInt();
        nPatasTotal += NUM_PATAS_ARANAS * sc.nextInt(); 

        System.out.println("Introduce el número de cochinillas");
        nPatasTotal += NUM_PATAS_COCHINILLAS * sc.nextInt();
        sc.close();

        System.out.println("El número de patas total es: "+nPatasTotal);

    }
}
