package ud1.ejercicios.ABP24104;

import java.util.Locale;
import java.util.Scanner;

public class E0123 {
    public static void main( String[] args ) {
        /* 
        Escribe un programa que convierta unidades de masa entre kilogramos y libras o viceversa. 
        El programa solicitará al usuario la cantidad de masa y la unidad de medida origen (kilogramos o libras). */

        /*
            1 kilogramo = 1000 gramos
            1 libra = 453.592 gramos
         */


        Scanner sc = new Scanner(System.in); // Creamos una instancia de clase Scanner, es necesario para poder usar los métodos de la clase Scanner
        //sc.useLocale(Locale.US);

        double c;   // Cantidad de la unidad de masa, necesita ser doble para los decimales de las conversiones.
        String u;   // unidad de medida

        System.out.println("Introduce una unidad de masa entre Kilos y libras y una cantidad de masa para su conversión a gramos");

        /* Otra solución sería introducir un número para distinguir las unidades, aunq deberemos cambiar el tipo de variable a uno que soporte números (byte,int,long...)  
        Por ejemplo, si introducen 0 sería Kilos y si introducen 1 sería Libras */
        System.out.println("Introduce k para Kilos y l para Libras"); 
        u = sc.nextLine();

        System.out.println("Introduce una cantidad");
        c = sc.nextDouble();
        sc.close();

        /* 
        La siguiente linea de código contiene un operador ternario y tiene la siguiente estructura:
            variable = condicion ? valorSiVerdadero : valorSiFalso;

        Los valores se colocan tras la '?' y separados por ':' ( se pueden encadenar varios operadores ternarios para tener más de dos valores ).
        Nuestros valores son:  m*1000 : m*453.592;
        Nuestra condición es u.equals("k") usa el método de la clase String String.equals() para comprar el valor de u y de "k" y saber si son iguales.
        
        Si usasemos números en vez de Strings podríamos comprar los valores directamente. Sería simplemente u == 0, en caso de que le diesemos el valor 0 a los Kilos.                      */
        c = u.equals("k") ? c*1000 : c*453.592; // Usando números en vez de Strings nos ahorraríamos el método: String.equals()

        String uResultado       = u.equals("k") ? "l" : "k";            // Letra de la unidad
        String uResultadoLargo  = u.equals("k") ? "libras" : "kilos";   // Nombre de la completo de la unidad
        double cResultado       = u.equals("k") ? c/453.592 : c/1000;   // Conversión de gramos a la unidad opuesta a la introducida
        
        // print formateado 
        // %s Introduce una String
        // %f Introduce un valor decimal, el valor decimal convinado con el .2 permite mostar tan solo 2 decimales
        // %n Introduce una nueva linea
        // Las "etiquetas" se sustituyen por los valores a continuación de la String "" secuencialmente usando comas como se ve a continuación.
        // La primera etiqueta se sustituira por el primer valor entre comas y así sucesivamente.
        System.out.printf("El resultado en %s es: %.2f%s%n",uResultadoLargo,cResultado,uResultado);

        

    }
}
