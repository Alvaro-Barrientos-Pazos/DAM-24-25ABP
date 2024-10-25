/*
Escribe un programa que calcule el dinero recaudado en un concierto. La aplicación solicitará el aforo máximo de local, el precio por entrada 
(suponemos que todas las entradas tienen el mismo precio). Hay que tener en cuenta que si el número de entradas vendidas no supera el 20% del aforo del local, 
se cancela el concierto. Si el número de entradas no supera el 50% del aforo del local, se realiza una rebaja del 25% del precio de la entrada.
 */
package ud2.ejercicios;


import java.util.Scanner;

public class ActivdadPropuesta {
    public static void main(String[] args) {
        
        final double UMBRAL_CANCELACION = 0.2;
        final double UMBRAL_DESCUENTO   = 0.5;
        final double DESCUENTO          = 0.25;
        
        int max_aforo;
        int aforo;
        double precio;


        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número de aforo máximo");
        max_aforo = sc.nextInt();

        System.out.println("Introduce el número de aforo");
        aforo = sc.nextInt();

        System.out.println("Introduce el precio de las entradas");
        precio = sc.nextDouble();
        
        if (aforo <= max_aforo * UMBRAL_CANCELACION){
            System.out.println("El concierto será ser cancelado");    
        }
        else if (aforo < max_aforo * UMBRAL_DESCUENTO){
            System.out.printf("El precio se ha reducido a: %.2f",precio*(1-DESCUENTO));
            
        }
        else {
            System.out.println("Precio normal de: "+precio);
        }
    }

}
