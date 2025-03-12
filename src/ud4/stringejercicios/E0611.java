package ud4.stringejercicios;

import java.util.Scanner;

public class E0611 {
    public static void main(String[] args) {
        char[] set1 = new char[]{'e','i','k','m','p','q','r','s','t','u','v'};
        char[] set2 = new char[]{'p','v','i','u','m','t','e','r','k','q','s'};

        Scanner sc = new Scanner(System.in);

        char c = 'q';

        char cEncrypted = codificaChar(set1,set2,c);
        
        System.out.println(cEncrypted);

        String strEncrypted = codificaString(set1,set2,"PaquiTo");
        System.out.println(strEncrypted);


    }


    static char codificaChar(char conjunto1[],char conjunto2[], char c){

        char cEncrypted = c;

        for (int i = 0; i < conjunto1.length; i++) {
            if (conjunto1[i] == c){
                return conjunto2[i];
            }
        }

        return cEncrypted;
    }


    public static String codificaString(char[] conjunto1, char[] conjunto2, String palabra){
        
        String strEncrypted = "";
        char letter = '\0';

        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            letter = palabra.charAt(i);

            for (int j = 0; j < conjunto1.length; j++) {
                if (palabra.charAt(i) == conjunto1[j]){
                    letter = conjunto2[j];
                    break;
                }
            }

            strEncrypted += letter;

        }

        return strEncrypted;
    }

    

}
