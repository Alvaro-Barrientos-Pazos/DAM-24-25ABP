package ud1.ejercicios;

import java.util.Scanner;

public class E0114 {
    public static void main(String[] args) {
        int horas;
        int minutos;
        int segundos;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número de horas");
        horas = sc.nextInt();

        System.out.println("Introduce un número de minutos");
        minutos = sc.nextInt();

        System.out.println("Introduce un número de segundos");
        segundos = sc.nextInt();

        int nSegundos = horas * 3600 + minutos * 60 + segundos;

        System.out.println("El número total de segundos es: "+nSegundos);

    }
}

