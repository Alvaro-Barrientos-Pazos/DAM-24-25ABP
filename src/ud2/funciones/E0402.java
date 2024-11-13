/*
 * Escribir una función a la que se le pasan dos enteros y muestre todos los números 
 * comprendidos entre ellos.
 */

package ud2.funciones;

public class E0402 {

    public static void main(String[] args) {
        inBetween(1,5);
        inBetween(5,10);
    }

    public static void inBetween(int a, int b){
        
        int first, last;

        if (a>b) {
            last = a;
            first = b;
        }
        else{
            last = b;
            first = a;
        }

        
        for (int i=1; i < last-first; i++ ){
            
            System.out.print((first+i)+" ");
        }
        System.out.println();
    }

}
