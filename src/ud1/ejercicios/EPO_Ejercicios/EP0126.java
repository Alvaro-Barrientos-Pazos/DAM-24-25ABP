/* 
Solicita al usuario un número real y calcula su raíz cuadrada. Implementa el programa utilizando el nombre cualificado de las clases, 
en lugar de utilizar ninguna importación.
*/

package ud1.ejercicios.EPO_Ejercicios;

public class EP0126 {
    public static void main(String[] args) {

        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        double n;

        System.out.print("Introduce un número para calcular su raíz cuadrada: ");
        n = sc.nextDouble();
        sc.close();

        System.out.println("El resultado es: " + Math.sqrt(n));
        
        
    }
}
