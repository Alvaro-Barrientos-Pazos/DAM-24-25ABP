package ud1.ejercicios;

import java.util.Scanner;

public class E0111 {
    public static void main(String[] args) {
        double IVA;
        double baseImponible;

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cual es el impuesto IVA? (Introduzca un número entero superior al 0)");
        IVA = sc.nextDouble();

        System.out.println("¿Cual es la base imponible?");
        baseImponible = sc.nextDouble();

        // por lo general para la cpu multiplicar es más rápido que dividir.
        double ImpuestoAñadido = baseImponible * (IVA*0.01); 
        double PrecioFinal = baseImponible + ImpuestoAñadido;

        System.out.println("El Impuesto añadido es de: "+ImpuestoAñadido+"€");
        System.out.println("El Precio final es de: "+PrecioFinal+"€");

    }
}
