/* 
Escribe un programa que convierta unidades de masa entre kilogramos y libras o viceversa. El programa solicitará al usuario la cantidad de masa y la unidad de medida origen (kilogramos o libras).
    1 kilogramo = 1000 gramos
    1 libra = 453.592 gramos
El programa deberá manejar las conversiones automáticamente y mostrar el resultado al usuario. Utiliza el operador ternario para evaluar la unidad de medida introducida por el usuario. El programa mostrará por pantalla el resultado con la unidad de medida adecuada.
 */
package ud1.ejercicios.ABP24104;

import java.util.Scanner;

public class E0123_v3 {
    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);
        
        double c;                                                                   // Cantidad de la unidad de masa
        String u;                                                                   // Unidad de medida

        final double GRAMOS_EN_LIBRAS  = 453.592f;                                  // Cantidad de gramos en una Libras
        final int    GRAMOS_EN_KILOS   = 1000;                                      // Cantidad de gramos en un Kilo


        boolean isKilos = false;

        System.out.println("Introduce una unidad de masa entre Kilos y libras y una cantidad de masa para su conversión a gramos");
        System.out.print("Introduce k para Kilos y l para Libras"); 
        u = sc.nextLine();

        isKilos = u.equals("k") || u.equals("K")|| u.equals("kg") || u.equals("Kg") || u.equals("lb") || u.equals("Lb")? true:false;

        System.out.print("Introduce una cantidad");
        c = sc.nextDouble();
        sc.close();

        c = isKilos ? c*GRAMOS_EN_KILOS : c*GRAMOS_EN_LIBRAS;                         // Conversión a gramos

        String uResultado       = isKilos ? "lb" : "k";                               // Letra de la unidad a la que se va a convertir
        String uResultadoLargo  = isKilos ? "libras" : "kilos";                       // Nombre de la completo de la unidad a la que se va a convertir
        double cResultado       = isKilos ? c/GRAMOS_EN_LIBRAS : c/GRAMOS_EN_KILOS;   // Conversión de gramos a la unidad opuesta a la introducida
        
        System.out.printf("El resultado en %s es: %.2f%s%n",uResultadoLargo,cResultado,uResultado);

        

    }
}
