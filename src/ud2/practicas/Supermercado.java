package ud2.practicas;

import java.util.Scanner;

public class Supermercado {

    public static void main(String[] args) {
        menuPrincipal();

    }

    public static void menuPrincipal() {
        
        Scanner sc = new Scanner(System.in);
        
        String precio;

        System.out.println("Introduce el precio de cada producto (solo se aceptan 2 decimales)");
        precio = sc.nextLine();

        precio.split("\.")

        

        System.out.println("Introduce la cantidad de productos");
        
    }

}
