package stringejercicios;

import java.util.Arrays;

public class E0613 {
    public static void main(String[] args) {
        //String str1 = "En un lugar de La Mancha";
        String str1 = "AaCCc";

        int[] arr = charCounter(str1);

        Arrays.toString(arr);

    }

    
    static int[] charCounter(String str){

        char[] arrABC = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};

        int[] arrResultado = new int[arrABC.length];

        str = str.toLowerCase();

        for (int i = 0; i < arrABC.length; i++) {
            for (int j = 0; j < str.length(); j++) {
                if (arrABC[i] == str.charAt(i)){
                    arrResultado[i]++;
                }
            }            
        }
        
        return arrResultado;
    }

}
