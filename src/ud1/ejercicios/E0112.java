package ud1.ejercicios;

import java.util.Scanner;

public class E0112 {
    public static void main(String[] args) {
        double base;
        double altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Cual es la base del triángulo?");
        base = sc.nextDouble();

        System.out.println("¿Cual es la altura del triángulo?");
        altura = sc.nextDouble();

        System.out.println("El area del triángulo es de: "+ (base*altura)/2);

    }
}
