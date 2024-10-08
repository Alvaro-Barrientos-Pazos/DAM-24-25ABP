package ud1.ejercicios;

import java.util.Scanner;

public class EP0115 {
    public static void main(String[] args) {
        double horas;
        double minutos;
        double segundos;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el número de segundos");
        segundos = sc.nextDouble();

        minutos = segundos%59;
        System.out.println("minutos: "+minutos);

        horas = segundos%3600;
        System.out.println("minutos: "+minutos);
        segundos = segundos - minutos;

        System.out.println("El número de horas:minutos:segundos es: "+horas+":"+minutos+":"+segundos);

        sc.close();
    }
}
