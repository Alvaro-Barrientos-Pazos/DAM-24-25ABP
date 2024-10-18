package ud2.ejemplos;

import java.util.*;

public class EjemploIfElse2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int n = sc.nextInt();
        sc.close();

        if (n%2 == 0) {
            System.out.println("El número es par");
        } 
        else {
            System.out.println("El número es impar");
        }

    }
}
