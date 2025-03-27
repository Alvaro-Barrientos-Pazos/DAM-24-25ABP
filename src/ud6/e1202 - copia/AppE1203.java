package ud6.e1202;

import java.util.Scanner;

public class AppE1203 {
    static Scanner sc = new Scanner(System.in);
    static ContenedorLista<Integer> cont = new ContenedorLista<Integer>(new Integer[0]);

    public static void main(String[] args) {

        programaPila();
        programaCola();

    }

    static void programaCola(){
        System.out.println("Introduce los números de la cola: ");

        int value;
        boolean isLooping = true;


        while (isLooping) {
            value = sc.nextInt();

            if (value == -1) {
                isLooping = false;
            }
            else{
                cont.encolar(value);
            }
        }

        System.out.println("\nEncolar\n============1\n");
        System.out.println(cont);
        System.out.println("\nDesencolar\n============1\n");

        int l = cont.list.length;
        for (int i = 0; i < l; i++) {
            cont.desencolar();
            System.out.println(cont);
        }
    }

    static void programaPila(){
        
        System.out.println("Introduce los números de la pila: ");

        int value;
        boolean isLooping = true;


        while (isLooping) {
            value = sc.nextInt();

            if (value == -1) {
                isLooping = false;
            }
            else{
                cont.apilar(value);
            }
        }

        System.out.println("\nApilar\n============1\n");
        System.out.println(cont);
        System.out.println("\nDesapilar\n============1\n");

        int l = cont.list.length;
        for (int i = 0; i < l; i++) {
            cont.desapilar();
            System.out.println(cont);
        }
    }
}
