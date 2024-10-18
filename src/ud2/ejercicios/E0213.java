/*
Escribir un programa que pida una hora de la siguiente forma: hora, minutos y segundos. El programa debe mostrar qué hora será un segundo más tarde. 
Por ejemplo: hora actual (10:41:59) => hora actual + 1 segundo (10:42:00)

 */
package ud2.ejercicios;

import java.util.Scanner;

public class E0213 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        final int SEGUNDOS_HORA = 60*60;  // Segundos en una hora
        final int SEGUNDOS_MINUTOS = 60;  // Segundos en un minuto


        System.out.println("Introduce el número de horas: ");
        int horas = sc.nextInt(); 
        
        System.out.println("Introduce el número de minutos: ");
        int minutos = sc.nextInt();
        
        System.out.println("Introduce el número de segundos: ");
        int segundos = sc.nextInt();
        sc.close();
            
            
        int segundosBase = horas * SEGUNDOS_HORA + minutos * SEGUNDOS_MINUTOS + segundos + 1;

        int nHoras;
        int nMinutos;
        int nSegundos;

    
        // Divide entre 3600 para sacar el número de horas
        nHoras = segundosBase / SEGUNDOS_HORA; 

        // Divide entre 3600 y si queda resto, dividelo entre 60 para sacar los minutos
        nMinutos = (segundosBase % SEGUNDOS_HORA) / SEGUNDOS_MINUTOS;

        // Divide entre 60 y guarda el resto.
        nSegundos = segundosBase % SEGUNDOS_MINUTOS;

        // Usar un digito entre % y d permite "reservar" el espacio de un caracter en caso de que el número de caracter no llege a la cantidad indicada.
        // Si usamos un %0 rellenar el espacio de los caracteres indicados con ceros.
        // Si el número de caracteres de nuestra cifra es superior al indicado en la etiqueta no se apreciara su efecto.
        System.out.printf("%02d:%02d:%02d más un segundo son: %02d:%02d:%02d",horas,minutos,segundos,nHoras,nMinutos,nSegundos);
    
    }
}
