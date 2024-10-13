/* 
Escribe un programa que convierta unidades de masa entre kilogramos y libras o viceversa. El programa solicitará al usuario la cantidad de masa y la unidad de medida origen (kilogramos o libras).
    1 kilogramo = 1000 gramos
    1 libra = 453.592 gramos
El programa deberá manejar las conversiones automáticamente y mostrar el resultado al usuario. Utiliza el operador ternario para evaluar la unidad de medida introducida por el usuario. El programa mostrará por pantalla el resultado con la unidad de medida adecuada.
 */
package ud1.ejercicios.ABP24104;

import java.util.Scanner;

public class E0123Copy {
    public static void main( String[] args ) {

        // Creamos una instancia de clase Scanner, es necesario para poder usar los métodos de la clase Scanner
        Scanner sc = new Scanner(System.in); 

        double c;   		// Cantidad, necesita ser doble para los decimales de las conversiones.
        int u;      		// Unidad de medida, usaremos números en vez de Strings para tener una sintaxis más sencilla, podríamos usar los números que quisieramos. 
		double cResultado;	// Resultado transformado a la unidad a la que se quiere convertir
                    
        //En mi caso usaré: ( 0 == Kilos y 1 == Libras)
        System.out.println("Introduce 0 para Kilos y 1 para Libras"); 
        u = sc.nextInt();

        System.out.println("Introduce una cantidad");
        c = sc.nextDouble();
        sc.close();

        // Si u es igual a 0, osea Kilos, la condición sera verdadera y se aplicará el primer valor del operador ternario.

        /* 
        La siguiente linea de código contiene un operador ternario y tiene la siguiente estructura:
            variable = condicion ? valorSiVerdadero : valorSiFalso;

        Los valores se colocan tras la '?' y separados por ':' ( se pueden encadenar varios operadores ternarios para tener más de dos valores ).
        Nuestros valores son:  m*1000 : m*453.592;
        Nuestra condición es u == 0. Osea, es u igual a Kilos? si es verdadera cogeremos el valor de verdadero y viceversa.                   */
        c = u == 0 ? c*1000 : c*453.592;
        

        System.out.println("El resultado en gramos es: "+c+"g");

        //////////////////////////////////////////////////////////////////////////////////////////
        // Pasamos los gramos a Kilos o Libras dependiendo de lo que haya escogido el usuario. //
        //////////////////////////////////////////////////////////////////////////////////////////
        
        // Si introducimos kilos pasamos a libras y viceversa.
        // Esto es solo para mostrar la letra y el nombre completo de la unidad.
        String uNombreCorto = u == 0 ? "l" : "k"; 
        String uNombreLargo = u == 0 ? "libras" : "kilos"; 
        
        // Si introducimos kilos se asigna el valor de la conversion de gramos a libras, si se introducieron libras se asiogna la conversion de gramos a kilos.
        cResultado = u == 0 ? c/453.592 : c/1000 ; 


        // print formateado 
        // %s Introduce una String
        // %f Introduce un valor decimal, el valor decimal combinado con el .2 permite mostar tan solo 2 decimales
        // %n Introduce una nueva linea
        // Las "etiquetas" se sustituyen por los valores a continuación de la String "" secuencialmente usando comas como se ve a continuación.
        // La primera etiqueta se sustituira por el primer valor entre comas y así sucesivamente.
        System.out.printf("El resultado en %s es: %.2f%s%n",uNombreLargo,cResultado,uNombreCorto);

    }
}
