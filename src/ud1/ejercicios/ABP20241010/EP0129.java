/* 
Escribe un programa que tome como entrada un número entero e indique 
qué cantidad hay que sumarle para que el resultado sea múltiplo de 7 
*/

package ud1.ejercicios.abp20241010;

import java.util.Scanner;


public class EP0129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        sc.close();

        int diff = 7-(n%7);
        

        String mensaje = diff == 7 ? "%d es múltiplo de 7" : "%d necesita sumar %d ser múltiplo de 7";
        
        System.out.printf(mensaje,n,diff);



    }
}
