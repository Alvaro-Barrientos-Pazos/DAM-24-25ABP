/* 
Crea un programa en Java que convierta unidades de área entre metros cuadrados, hectáreas y pies cuadrados. El usuario deberá ingresar la cantidad de área y especificar 
las unidades de origen y destino.

    1 hectárea       = 10,000 metros cuadrados
    1 metro cuadrado = 10.7639 pies cuadrados

El programa debe realizar la conversión y mostrar el resultado al usuario.


*/

package ud1.ejercicios.EPO_Ejercicios;

import java.util.Scanner;

public class EP0132 {
    public static void main(String[] args) {

        final int    HECTAREA_M2 = 10000;   // 1ht a m2
        final double PIES_M2     = 10.7639; // 1m2 a p2

        Scanner sc = new Scanner(System.in);

        byte   uOrigen;
        double cOrigen;
        String oLetra;

        byte   uDestino;
        double cDestino;
        String dLetra;

        double m2;

        System.out.print("Introduce el valor asignado a la unidad de origen que prefieras: \nMetros Cuadrados = 0\nHectárea = 1\nPies cuadrados = 2\n");
        uOrigen = sc.nextByte();

        System.out.print("Introduce la cantidad de la unidad de origen: ");
        cOrigen = sc.nextDouble();

        System.out.print("Introduce el valor asignado a la unidad de destino que prefieras: \nMetros Cuadrados = 0\nHectárea = 1\nPies cuadrados = 2\n");
        uDestino = sc.nextByte();
        sc.close();

        m2 = uOrigen == 0 ? cOrigen : uOrigen == 1 ? cOrigen * HECTAREA_M2 : cOrigen / PIES_M2; 

        cDestino = uDestino == 0 ? m2 : uDestino == 1 ? m2 / HECTAREA_M2 : m2 * PIES_M2;

        oLetra = uOrigen == 0 ? "m2" : uOrigen == 1 ? "ht" : "p2";
        dLetra = uDestino == 0 ? "m2" : uDestino == 1 ? "ht" : "p2";

        System.out.printf("%.2f%s son %.2f%s",cOrigen,oLetra,cDestino,dLetra);

    }
}
