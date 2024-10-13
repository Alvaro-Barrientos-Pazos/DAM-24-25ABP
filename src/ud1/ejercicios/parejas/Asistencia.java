// Driver/Navigator: Álvaro Barrientos Pazos

package ud1.ejercicios.parejas;

import java.util.Scanner;

public class Asistencia {
    public static void main(String[] args) {
        
        final double SESIONES       = (240 * 60) / 50;   // número de sesiones de 50m en las 240h.
        final double APERCIBIMIENTO = .06;               
        final double PERDIDAEV      = .1;                

        double mApercibimiento = SESIONES * APERCIBIMIENTO; // 6% de las sesiones
        double mPerdidaEva     = SESIONES * PERDIDAEV;      // 10% de las sesiones
        
        int faltas; // número de faltas a calcular

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el número de faltas a calcular: ");
        faltas = sc.nextInt();
        sc.close();

        System.out.println("Número de sesiones de 50': " + SESIONES);
        System.out.println("Número de faltas sin justificar que implican un apercebimiento: " + mApercibimiento);
        System.out.println("Número de faltas sin justificar que implican una pérdida de la evaluación continua: " + mPerdidaEva);

        String consecuencias = (faltas<mApercibimiento) ? "Ningún problema": 
                                (faltas<mPerdidaEva) ? "Apercibimiento" : "Pérdida de evaluación continua";
        
        System.out.println(consecuencias);

    }
}
