package ud2.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value;

        try {
            System.out.println("Introduce un valor: ");
            value = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("El input no es del tipo int");
        }
        

    }
}
