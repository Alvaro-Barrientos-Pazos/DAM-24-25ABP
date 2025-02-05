/* 
Escribe un programa que permita convertir unidades de energía entre julios (J), calorías (cal) y kilovatios-hora (kWh). El usuario deberá ingresar la cantidad de energía, 
así como la unidad de origen y destino.

    1 cal = 4.184 J
    1 kWh = 3,600,000 J

El programa deberá realizar la conversión y mostrar el resultado.

*/

package ud1.ejercicios.epo_ejercicios;

import java.util.Scanner;

public class EP0134 {
    public static void main(String[] args) {

        final double CAL_J = 4.184;         // 1cal a J
        final int    KWH_J = 3600000;       // 1KWh a J

        Scanner sc = new Scanner(System.in);

        byte   uOrigen;
        double cOrigen;
        String oLetra;

        byte   uDestino;
        double cDestino;
        String dLetra;

        double j;

        System.out.print("Introduce el valor asignado a la unidad de origen que prefieras: \nJ = 0\ncal = 1\nKWh = 2\n");
        uOrigen = sc.nextByte();

        System.out.print("Introduce la cantidad de la unidad de origen: ");
        cOrigen = sc.nextDouble();

        System.out.print("Introduce el valor asignado a la unidad de destino que prefieras: \nJ = 0\ncal = 1\nKWh = 2\n");
        uDestino = sc.nextByte();
        sc.close();

        j = uOrigen == 0 ? cOrigen : uOrigen == 1 ? cOrigen * CAL_J : cOrigen * KWH_J; 

        cDestino = uDestino == 0 ? j : uDestino == 1 ? j / CAL_J : j / KWH_J;

        oLetra = uOrigen == 0 ? "J" : uOrigen == 1 ? "cal" : "KWh";
        dLetra = uDestino == 0 ? "J" : uDestino == 1 ? "cal" : "KWh";

        System.out.printf("%.3f%s son %.3f%s",cOrigen,oLetra,cDestino,dLetra);

    }
}
