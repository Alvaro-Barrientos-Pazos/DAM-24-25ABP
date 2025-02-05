package ud4.stringejercicios;

import java.util.Scanner;

public class E0610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        esPalindromo(str);

    }

    public static boolean esPalindromo(String str){

        str.toLowerCase();

        String inverseStr = "";

        str = sinTildes(str);

        for (int i = str.length()-1; i >=0; i--) {
            inverseStr += str.charAt(i);
        }

        System.out.println(inverseStr);
        
        return inverseStr.equals(str);
    }


    static String sinTildes(String str){
        String strResultante = "";
        char letter = '\0';

        for (int i = 0; i < str.length(); i++) {    
            
            letter = switch (str.charAt(i)) {
                case 'á' -> 'a';
                case 'é' -> 'e';
                case 'í' -> 'i';
                case 'ó' -> 'o';
                case 'ú' -> 'u';
                default -> str.charAt(i);
            };

            strResultante += letter;
        }

        return strResultante;
    }

}
