/* 
Escribe un programa que convierta unidades de masa entre kilogramos y libras o viceversa. El programa solicitará al usuario la cantidad de masa y la unidad de medida origen (kilogramos o libras).
    1 kilogramo = 1000 gramos
    1 libra = 453.592 gramos
El programa deberá manejar las conversiones automáticamente y mostrar el resultado al usuario. Utiliza el operador ternario para evaluar la unidad de medida introducida por el usuario. El programa mostrará por pantalla el resultado con la unidad de medida adecuada.
 */

package ud1.ejercicios.ABP24104;

import java.util.Scanner;

public class E0123_v2 {
    public static void main( String[] args ) {
        
        final double GRAMOS_EN_LIBRAS  = 453.592f;                      // Cantidad de gramos en una Libras
        final int    GRAMOS_EN_KILOS   = 1000;                          // Cantidad de gramos en un Kilo

        Scanner sc = new Scanner(System.in); 
        double  c;   		                                            // Cantidad, necesita ser doble para los decimales de las conversiones.
        byte    u;      	                                            // Unidad de medida, usaremos números en vez de Strings para tener una sintaxis más sencilla, podríamos usar los números que quisieramos. 
		double  cResultado;	                                            // Resultado transformado a la unidad a la que se quiere convertir
        
        System.out.print("Introduce 0 para Kilos y 1 para Libras: "); 
        u = sc.nextByte();

        System.out.print("Introduce una cantidad: ");
        c = sc.nextDouble();
        sc.close();
        
        c = u == 0 ? c*GRAMOS_EN_KILOS : c*GRAMOS_EN_LIBRAS;            // Conversión a gramos
    
        System.out.println("El resultado en gramos es: "+c+"g");

        String uNombreCorto = u == 0 ? "l" : "kg";                      // Letra de la unidad a la que se va a convertir
        String uNombreLargo = u == 0 ? "libras" : "kilos";              // Nombre de la completo de la unidad a la que se va a convertir
        
        cResultado = u == 0 ? c/GRAMOS_EN_LIBRAS : c/GRAMOS_EN_KILOS ;  // Conversión de gramos a la unidad a convertir

        System.out.printf("El resultado en %s es: %.2f%s%n",uNombreLargo,cResultado,uNombreCorto);

        

    }
}
