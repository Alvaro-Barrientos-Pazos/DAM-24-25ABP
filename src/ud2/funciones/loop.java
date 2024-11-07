package ud2.funciones;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un texto: ");
        String txt = sc.nextLine();
        System.out.print("Introduce un symbolo: ");
        char symbol = sc.nextLine().charAt(0);

        cajaTexto(txt,symbol);
    }


    public static void cajaTexto(String str, char symbol) {
        int n = str.length();

        printSimbolo(n,symbol);
        
        System.out.printf("%s-%s-%s\n",symbol,str,symbol);

        printSimbolo(n,symbol);

    }

    public static void printSimbolo(int n, char symbol) {
        for (int i = 1; i <= n + 4; i++ ){
            System.out.print(symbol);
        }
        System.out.println();
    }


}
