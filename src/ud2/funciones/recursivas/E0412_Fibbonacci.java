/* 
 * Diseñar una función recursiva que calcule el enésimo término de la serie de Fibonacci. En esta serie el enésimo valor se calcula sumando los dos valores anteriores de la serie, es decir:

    fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
    fibonacci(1) = 1
    fibonacci(0) = 1   // Esto debe ser 0 en vez de 1
*/

package ud2.funciones.recursivas;

public class E0412_Fibbonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    static int fibonacci(int n){

        if (n < 2){
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
