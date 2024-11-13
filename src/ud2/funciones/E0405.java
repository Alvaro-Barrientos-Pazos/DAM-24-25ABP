package ud2.funciones;

import java.util.Scanner;

public class E0405 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una única letra");
        System.out.println("Es vocal: "+esVocal(sc.nextLine().toLowerCase().charAt(0)));
        sc.close();
    }


    public static boolean esVocal(char c){

        boolean result = false;

        switch (c) {
            case 'a': result = true;
                break;
        
            case 'e': result = true;
                break;

            case 'i': result = true;
                break;

            case 'o': result = true;
                break;

            case 'u': result = true;
                break;
        }

        return result;
    }

}
