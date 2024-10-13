// Driver/Navigator: Álvaro Barrientos Pazos

package ud1.ejercicios.parejas;

import java.util.Scanner;

public class Receta {
    public static void main(String[] args) {

        // Cantidades
        final double C_MANZANA = 1.5 / 6;  // Kg
        final double C_AGUA    = 330 / 6;  // ml
        final double C_AZUCAR  = 120 / 6;  // g
        final double C_LIMON   = 6 / 6;

        // Precio ingredientes
        final double P_MANZANA = 1.69;
        final double P_AZUCAR  = 1.52 / 1000; // euros por gramo

        int nPersonas;

        Scanner sc = new Scanner (System.in);
        

        System.out.println("Compota de manzana");
        System.out.print("Introduce el número de comensales: ");
        nPersonas = sc.nextInt();
        sc.close();

        System.out.printf("\n Necesitas %.2f kilos de manzana", C_MANZANA * nPersonas);
        System.out.printf("\n Necesitas %.2f mililitros de agua", C_AGUA * nPersonas);
        System.out.printf("\n Necesitas %.2f gramos de azucar", C_AZUCAR * nPersonas);
        System.out.printf("\n Necesitas %.2f mililitros de zumo de limón", C_LIMON * nPersonas);

        double precio = (P_MANZANA * C_MANZANA * nPersonas) + (P_AZUCAR * C_AZUCAR * nPersonas); 
        System.out.printf("\n El precio de la receta es: %.2f ", precio);

    }
}
