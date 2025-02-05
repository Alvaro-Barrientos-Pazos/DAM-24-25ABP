/* 
Repite el programa anterior para convertir entre kilómetros por hora (km/h), metros por segundo (m/s) y millas por hora (mph) 
    1 km/h = 0.27778 m/s
    1 mph = 1.60934 km/h


*/

package ud1.ejercicios.epo_ejercicios;

import java.util.Scanner;

public class EP0125 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        final double MS_A_KMH  = 0.27778;                                           // Cantidad de m/s en un 1km/h
        final double KMH_A_MPH = 1.60934;                                           // Cantidad de km/h en 1 mph
        final double MS_A_MPH  = KMH_A_MPH * MS_A_KMH;                              // Cantidad de m/s en 1 mph

        double c;                                                                    // Cantidad de la unidad de velocidad
        byte u;                                                                      // Unidad de velocidad
        
        byte uDestino;
        double cDestino;

        double cMS;                                                                  // Cantidad convertida a m/s como intermediario

        System.out.println("Introduce una unidad de velocidad para convertir:\n m/s = 0\n km/h = 1\n mph = 2");
        u = sc.nextByte();

        System.out.print("Introduce una velocidad: ");
        c = sc.nextDouble();

        System.out.println("Introduce a que unidad de velocidad deseas convertir:\n m/s = 0\n km/h = 1\n mph = 2");
        uDestino = sc.nextByte();
        sc.close();


        cMS = u == 0 ? c 
            : u == 1 ? c * MS_A_KMH 
            : c * MS_A_MPH ;
        
        cDestino = uDestino == 0 ? cMS
                : uDestino == 1 ? cMS / MS_A_KMH
                : cMS / MS_A_MPH;


        // Letra de la unidad a la que se va a convertir
        String uDestinoLetra = uDestino == 0 ? "m/s" 
                             : uDestino == 1 ? "Km/h" 
                             : "mph";                              
        
        // Nombre de la completo de la unidad a la que se va a convertir
        String uDestinoNombre  = uDestino == 0 ? "metros segundo"
                               : uDestino == 1 ? "Kilometros hora"
                               : "millas por hora";

        
        System.out.printf("El resultado en %s es: %f%s%n",uDestinoNombre,cDestino,uDestinoLetra);


        
        
    }
}
