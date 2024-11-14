/* 
    Dadas 6 notas, escribir la cantidad de alumnos aprobados, 
    condicionados (nota igual a 4) y suspensos.
*/
package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0313 {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        final byte N_SCORES = 6;

        int c_fails = 0, c_cfails = 0, score;


        System.out.println("Introduce 6 notas: ");

        for (int i=1; i< N_SCORES; i++){
            score = sc.nextInt();
            if (score < 5 ){
                if (score < 4) {
                    c_fails++;
                }
                else{
                    c_cfails++;
                }
            } 
        }

        sc.close();

        System.out.printf("Condicionados  |  Suspensos\n");
        System.out.println("---------------------------------------------");
        System.out.printf("%7d%16d\n",c_cfails,c_fails);

    }
}