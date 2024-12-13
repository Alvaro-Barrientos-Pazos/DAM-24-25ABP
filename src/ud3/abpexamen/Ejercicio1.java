/* Álvaro Barrientos Pazos */
package ud3.abpexamen;

import ud3.abpexamen.CocheCarreras;

public class Ejercicio1 {
    public static void main(String[] args) {

        System.out.println("RAYO");
        System.out.println("====");
        
        CocheCarreras rayo = new CocheCarreras("Rayo", 90, 400);
        
        rayo.mostrar();
        rayo.avanzar();
        System.out.println(rayo.usarTurbo());
        rayo.mostrar();
        
        System.out.println("TRUENO");
        System.out.println("======");
        CocheCarreras trueno = new CocheCarreras("Trueno", 60, 5, 300);
        
        trueno.mostrar();
        
        while (trueno.getAutonomiaRestante() != 0)
            trueno.usarTurbo();

        trueno.mostrar();
        trueno.repostar();
        trueno.mostrar();
    }
}
