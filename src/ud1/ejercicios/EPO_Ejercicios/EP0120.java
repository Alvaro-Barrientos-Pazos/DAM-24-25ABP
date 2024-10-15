/* 
Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a calcular el importe que hay que cobrar en la taquilla 
por la compra de una serie de entradas (cuyo número será introducido por el usuario). 
Existen dos tipos de entrada: infantiles, que cuestan 15,50 €; y de adultos, que cuestan 20 €.
En el caso de que el importe total sea igual o superior a 100 €, se aplicará automáticamente un bono descuento del 5%.
 */

package ud1.ejercicios.EPO_Ejercicios;

import java.util.Scanner;

public class EP0120 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final int   UMBRAL_BONO = 100;
        final float DESCUENTO   = 0.05f;

        // Precios
        final float P_INFANTIL  = 15.50f;
        final float P_ADULTO    = 20;

        // Coste total
        float cTotal_infantil; 
        float cTotal_adulto;
        float cTotal_tickets;  // Ambos adultos e infantiles


        System.out.print("Introduce el número de tickets para infantes: ");
        cTotal_infantil = sc.nextInt() * P_INFANTIL;

        System.out.print("Introduce el número de tickets para adultos: ");
        cTotal_adulto = sc.nextInt() * P_ADULTO;
        sc.close();

        // Guardamos este valor en una variable, porque de no ser así tendríamos que hacer esta cuenta múltiples veces.
        cTotal_tickets = cTotal_adulto + cTotal_infantil;

        // Si el precio es mayor o igual que 100, aplica el descuento si restamos 0.05 a 1 y multiplicamos el resultado por el precio total es lo mismo que restar un 5%. 
        float cTotal_descuento = cTotal_tickets >= UMBRAL_BONO ? cTotal_adulto * (1-DESCUENTO) : cTotal_adulto;

        // Añade la siguiente cadena al final del mensaje dependiendo de si se aplica el descuento o no.
        String mensaje = cTotal_tickets >= UMBRAL_BONO ? "\nTOTAL DESCUENTO: %.2f euros (-%.2f euros)" : "\nNo se aplica descuento a cantidades menores a 100 euros";
        
        // \t introduce un espacio de tabulador, para alinear los textos.
        System.out.printf("Los precios son:\n- Infantes:\t %.2f euros\n- Adultos:\t %.2f euros\nTOTAL:\t\t %.2f euros" + mensaje, cTotal_infantil, cTotal_adulto, cTotal_tickets, cTotal_descuento, (cTotal_tickets)-cTotal_descuento);
        
    }
}
