/* 
Convertir un número de horas, minutos y segundos introducidos por teclado en un número total de segundos. 
*/
package ud1.ejercicios.EPO_Ejercicios;

import java.util.Scanner;

public class EP0114 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int SEGUNDOS_HORA = 60*60;  // Segundos en una hora

        int horas;
        int minutos;
        int segundos;
        
        
        System.out.println("Introduce un número de horas");
        horas = sc.nextInt();

        System.out.println("Introduce un número de minutos");
        minutos = sc.nextInt();

        System.out.println("Introduce un número de segundos");
        segundos = sc.nextInt();
        sc.close();

        int nSegundos = horas * SEGUNDOS_HORA + minutos * 60 + segundos;

        System.out.println("El número total de segundos es: "+nSegundos);

    }
}

