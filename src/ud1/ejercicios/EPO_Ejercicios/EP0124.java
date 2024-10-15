/* 
Repite el programa anterior para convertir entre litros y galones:
    1 galón (estadounidense) = 3.78541 litros
 */

package ud1.ejercicios.EPO_Ejercicios;

import java.util.Scanner;

public class EP0124 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        final double LITRO_EN_GALONES = 3.78541;                                   // Cantidad de galones en un litro
        final int    LITROS_EN_KILOS  = 1000;                                      // Cantidad de litros en un Kilolitro

        double c;                                                                  // Cantidad de la unidad de volumen
        byte u;                                                                    // Unidad de medida

        System.out.println("Introduce una unidad de volumen:\n KiloLitros = 0\n Galones = 1");
        u = sc.nextByte();

        System.out.print("Introduce una cantidad: ");
        c = sc.nextDouble();
        sc.close();

        c = u == 0 ? c*LITROS_EN_KILOS : c*LITRO_EN_GALONES;                        // Conversión a litros

        String uResultado      = u == 0 ? "gal" : "Kl";                             // Letra de la unidad a la que se va a convertir
        String uResultadoLargo = u == 0 ? "galones" : "kilo litros";                // Nombre de la completo de la unidad a la que se va a convertir
        double cResultado      = u == 0 ? c/LITRO_EN_GALONES : c/LITROS_EN_KILOS;   // Conversión de litros a la unidad opuesta a la introducida
        
        System.out.printf("El resultado en %s es: %.2f%s%n",uResultadoLargo,cResultado,uResultado);

    }
}
