package ud4.stringejercicios;

import java.util.Scanner;

public class E0604 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la frase: ");
        String frase = sc.nextLine();

        

        int nSpaces = contarEspacios(frase);
        System.out.println(nSpaces);

    }


    static int contarEspacios(String frase){
        char[] arr = frase.toCharArray();
        int counter = 0;

        for (char c : arr) {
            if (Character.isSpaceChar(c)){
                counter++;
            }
        }

        return counter;
    }
}
