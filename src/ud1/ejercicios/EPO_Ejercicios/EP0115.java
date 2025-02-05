/* 
Convertir un número de segundos introducido por teclado en horas, minutos y segundos. 
*/

package ud1.ejercicios.epo_ejercicios;

import java.util.Scanner;

public class EP0115 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int SEGUNDOS_HORA = 60*60;  // Segundos en una hora

        int horas;
        int minutos;
        int segundos;
        int segundosBase;


        System.out.println("Introduce el número de segundos a transformar en HH:MM:SS");
        segundosBase = sc.nextInt();
        sc.close();

        // Divide entre 3600 para sacar el número de horas
        horas   = segundosBase / SEGUNDOS_HORA; 

        // Divide entre 3600 y si queda resto, dividelo entre 60 para sacar los minutos
        minutos = (segundosBase % SEGUNDOS_HORA) /60;

        // Divide entre 60 y guarda el resto.
        segundos = segundosBase % 60;

        System.out.println(horas+":"+minutos+":"+segundos);

        
    }
}
