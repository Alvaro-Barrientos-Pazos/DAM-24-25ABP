package ud2.practicas;

import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
        menuPrincipal();

    }

    public static void menuPrincipal() {
        
        Scanner sc = new Scanner(System.in);
        
        double precio;

        System.out.println("Introduce el precio de cada producto (con un máximo de 2 decimales)");
        precio = sc.nextDouble();
        sc.close();

        precio = Math.floor(precio * 100.0) / 100.0;


        System.out.println("Introduce la cantidad de productos");
        
    }

}
