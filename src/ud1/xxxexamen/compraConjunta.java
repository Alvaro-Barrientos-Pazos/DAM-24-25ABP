// Álvaro Barrientos Pazos

/*
    Tres amig@s deciden juntar el dinero en efectivo que llevan encima para comprar un artículo para compartir (por ejemplo, una pelota, un libro, un disco, etc.). Haz un programa
    que permita introducir el precio del artículo (en euros) y el dinero que aporta cada amig@ y que informe si el dinero aportado es suficiente o no para adquirir el artítulo.
    Si el dinero no es suficiente el programa informará de cuánto falta, y si sobra, se indicará el importe del dinero sobrante que guardará como bote para futuras compras conjuntas
 */

package ud1.xxxexamen;

import java.util.Scanner;

public class compraConjunta {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double precio;
        double bote;

        System.out.print("Introduce el precio del artículo: ");
        precio = sc.nextDouble();

        System.out.print("Introduce la contribución del primer amigo: ");
        bote = sc.nextDouble();

        System.out.print("Introduce la contribución del segundo amigo: ");
        bote += sc.nextDouble();

        System.out.print("Introduce la contribución del tercer amigo: ");
        bote += sc.nextDouble();
        sc.close();

        
        String mensaje = bote >= precio ? 
                precio-bote == 0 ? "Tienen dinero justo para comprar el Artículo, no sobra nada" : "Tienen suficiente dinero y al grupo le sobran: "+(bote-precio)+" euros" 
            
            : "El grupo no tiene suficiente dinero, les faltan: "+(precio-bote)+ " euros";

        System.err.println(mensaje);
        


    }

}
