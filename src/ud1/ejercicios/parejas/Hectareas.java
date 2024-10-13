// Driver/Navigator: Álvaro Barrientos Pazos

package ud1.ejercicios.parejas;

import java.util.Scanner;

public class Hectareas {
    public static void main(String[] args) {
        final double HECTAREA   = 10000;            // Metros cuadrados de una hectarea
        final double AFUTBOL    = 105 * 70;         // Area campo de futbol en metros cuadrados
        final double ABALONCESO = 28 * 15;          // Area campo de baloncesto en metros cuadrados
        final double ATENIS     = 23.77 * 10.97;    // Area campo de tenis
        final double RETIRO     = 125 * HECTAREA;   // Hectareas del parque del Retiro 

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número de hectáreas: ");
        double hectareas = sc.nextDouble();
        sc.close();

        // Total de hectareas
        double hTotal = hectareas * HECTAREA; 
        
        double nCampoFutbol     = (hTotal/AFUTBOL);
        double nCampoBaloncesto = (hTotal/ABALONCESO);
        double nCampoTenis      = (hTotal/ATENIS);
        double nCampoRetiro     = (hTotal/RETIRO);

        System.out.println(hectareas + " hectáreas son aproximadamente: ");
        System.out.printf("%.2f campos de fútbol %n",nCampoFutbol);
        System.out.printf("%.2f canchas de baloncesto %n",nCampoBaloncesto);
        System.out.printf("%.2f pistas de tenis %n",nCampoTenis);
        System.out.printf("%.2f parques del retiro %n",nCampoRetiro);
    }
}
