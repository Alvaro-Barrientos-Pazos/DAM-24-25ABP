package ud1.ejercicios;

import java.util.Scanner;

public class E0115 {
    public static void main(String[] args) {
        int horas;
        int minutos;
        int segundos;
        int segundosBase;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de segundos a transformar en HH:MM:SS");
        segundosBase = sc.nextInt();

        // Divide entre 3600 para sacar el número de horas
        horas   = segundosBase / 3600; 

        // Divide entre 3600 y si queda resto, dividelo entre 60 para sacar los minutos
        minutos = (segundosBase % 3600) /60;

        // Divide entre 60 y guarda el resto.
        segundos = segundosBase % 60;

        System.out.println(horas+":"+minutos+":"+segundos);

        
    }
}
