package ud1.ejercicios;

import java.util.Scanner;

public class EP0111 {
    public static void main(String[] args) {
        double Bimponible;
        double IVA = 20;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("¿Cual es el IVA? introduzca un valor mayor que cero");
        IVA = sc.nextDouble();

        System.out.println("El IVA es: "+IVA+"%");


        System.out.println("¿Cual es la base imponible?");
        Bimponible = sc.nextDouble();
        System.out.println("La base imponible es: "+Bimponible+"€");

        double ImporteIva = Bimponible * (IVA/100);
        double Resultado = Bimponible + ImporteIva;
        
        System.out.println("Importe en IVA: "+ ImporteIva +"€\nPrecio final: "+Resultado+"€");
        
        sc.close();
    }
}
