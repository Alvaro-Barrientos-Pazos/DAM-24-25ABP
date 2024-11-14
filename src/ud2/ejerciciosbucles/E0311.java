/* 
    Pedir un número y calcular su factorial. 
    Por ejemplo el factorial de 5 se denota 5! y es igual 
    a 5 x 4 x 3 x 2 x 1 = 120.
*/
package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0311 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int n,fact = 1;
        
        n = sc.nextInt();
        sc.close();

        for (int i=2; i <=n; i++)  {
            fact*=i;
        }
        System.out.printf("El factorial de %d es %d",n,fact);
    }
}