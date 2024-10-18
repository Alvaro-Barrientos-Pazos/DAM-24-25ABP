/*
Escribe un programa para emitir la factura de compra de un producto, introduciendo el precio 
del producto y el número de unidades compradas. La factura deberá añadir al total un IVA 
(Impuesto del Valor Añadido) del 21%. Si el precio final con IVA es superior a 100 euros 
se aplicará un descuento del 5%.

    Ejemplos para pruebas:
    Precio = 10 €, Unidades = 5 => Precio Final = 60,50 €
    Precio = 20 €, Unidades = 7 => Precio Final = 160,93 €

 */
package ud2.ejercicios;

import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        
        final double IVA       = 0.21;
        final int    THRESHOLD = 100;
        final double DISCOUNT  = 0.05;

        double tPrecio; // Precio sin impuestos

        String mensaje = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de productos comprados");
        int nItem = sc.nextInt();

        System.out.println("Introduce el precio");
        double price = sc.nextDouble();
        sc.close();

        // Precio con impuestos Añadidos
        double iPrecio = (nItem * price) * (1+IVA);


        if (iPrecio > THRESHOLD){
            tPrecio = iPrecio * (1-DISCOUNT);
            mensaje = String.format("\nPero se ha aplicado un descuento!!\nEl precio final es: %.2f euros",tPrecio);
        }
        
        System.out.printf("\nEl precio con impuesto es de: %.2f euros %s\n",iPrecio,mensaje);

        

    }
}
