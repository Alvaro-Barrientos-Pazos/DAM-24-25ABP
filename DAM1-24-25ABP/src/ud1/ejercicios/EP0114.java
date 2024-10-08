package ud1.ejercicios;

import java.util.Scanner;

public class EP0114 {
    public static void main(String[] args) {
        int horas;
        int minutos;
        int segundos;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el número de horas");
        horas = sc.nextInt();

        System.out.println("Introduzca el número de minutos");
        minutos = sc.nextInt();
        
        System.out.println("Introduzca el número de segundos");
        segundos = sc.nextInt();             


        segundos = horas*60*60 + minutos*60 + segundos ;

        System.out.println("El número de segundos total es: "+segundos);

        sc.close();
    }
}
