/*
 * Diseñar la función eco() a la que se le pasa como parámetro un número n, y muestra por pantalla n veces el mensaje “Eco…”.
 */

package ud2.funciones;

public class E0401 {

    public static void main( String[] args ){
        eco(5);

    }

    public static void eco(int n) {
        for (int i = 0; i < n; i++){
            System.out.println("Eco...");
        }
    }

}
