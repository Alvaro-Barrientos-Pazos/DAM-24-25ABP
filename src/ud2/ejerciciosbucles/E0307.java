/* 
    Escribir todos los múltiplos de 7 menores que 100
*/
package ud2.ejerciciosbucles;


public class E0307 {

    public static void main(String[] args) {
        
        final byte MAX_VALUE = 100;

        System.out.printf("Los multiples de 7 hasta %d son: ",MAX_VALUE);
        int i = 1;

        while (i < MAX_VALUE) {
            System.out.print(i+" ");
            i+=7;
        }
        System.out.println();
    }

}
