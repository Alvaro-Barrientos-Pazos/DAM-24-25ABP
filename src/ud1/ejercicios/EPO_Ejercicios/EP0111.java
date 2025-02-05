/* 
Un economista te ha encargado un programa para realizar cálculos con el IVA. 
La aplicación debe solicitar la base imponible y el IVA que se debe aplicar. 
Muestra en pantalla el importe correspondiente al IVA y al total.
 */

package ud1.ejercicios.epo_ejercicios;

import java.util.Scanner;

public class EP0111 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double IVA;
        double baseImponible;

        System.out.println("¿Cual es el impuesto IVA? (Introduzca un número entero superior al 0)");
        IVA = sc.nextDouble();

        System.out.println("¿Cual es la base imponible?");
        baseImponible = sc.nextDouble();
        sc.close();

        // por lo general para la cpu multiplicar es más rápido que dividir.
        double ImpuestoAñadido = baseImponible * (IVA*0.01); 
        double PrecioFinal = baseImponible + ImpuestoAñadido;

        System.out.println("El Impuesto añadido es de: "+ImpuestoAñadido+"€");
        System.out.println("El Precio final es de: "+PrecioFinal+"€");

    }
}
