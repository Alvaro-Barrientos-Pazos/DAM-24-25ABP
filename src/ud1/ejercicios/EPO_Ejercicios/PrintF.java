/* 
Repite el programa anterior para convertir entre kilómetros por hora (km/h), metros por segundo (m/s) y millas por hora (mph) 
*/

package ud1.ejercicios.EPO_Ejercicios;

import java.util.Scanner;

public class PrintF {
    public static void main(String[] args) {
        

        // %s = String
        // %f = float / double
        // %d = digit / int / long / byte
        // 5\%
        // \"\"

        Scanner sc = new Scanner(System.in);

        System.out.printf("%s \"%.1f\" %d \n \t %s","Hola",13.2f,5,"Fin\n");
        System.out.println("Introduce dato: ");
        int dato = sc.nextInt();
        sc.close();

        



        //Hola "13.2" 5
        //  Fin



        
    }
}
