package ud1.ejercicios;

import java.util.Scanner;

public class EP0112 {
    public static void main(String[] args) {
        double base;
        double altura;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca la base del triángulo");
        base = sc.nextDouble();


        System.out.println("Introduzca la altura del triángulo");
        altura = sc.nextDouble();

        double resultado = (base*altura)/2;

        
        System.out.println("El area del triángulo es: "+resultado);
        
        sc.close();
    }
}
