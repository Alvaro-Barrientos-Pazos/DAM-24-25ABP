/* 
    Pedir 5 calificaciones de alumnos y decir al final si hay algún 
    suspenso.
*/
package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0312 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 5 notas: ");

        boolean esSuspenso = false;
        final byte N_NOTAS = 5;

        double nota;

        for (int i=1; i < N_NOTAS; i++){
            nota = sc.nextDouble();
            if (nota < 5){
                esSuspenso = true;
            }

        }
        sc.close();
        System.out.printf("Hay suspensos? %s",esSuspenso?"Si":"No");
            



    }
}