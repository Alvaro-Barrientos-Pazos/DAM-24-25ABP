package stringejercicios;

import java.util.Arrays;

public class E0612 {
    public static void main(String[] args) {
        
        String str1 = "amor";
        String str2 = "ramo";

        analgama(str1,str2);
        analgamaArr(str1,str2);
        
    }

    static boolean analgamaArr(String str1, String str2){
        char[] arr = str2.toLowerCase().toCharArray();

        if (str1.length()!=str2.length()){
            return false;
        }

        char c = '\0';

        for (int i = 0; i < str1.length(); i++) {
            c = str1.charAt(i);

            for (int j = i; j < arr.length; j++) {
                if ( str1.charAt(i) == arr[j]){
                    
                }

            }
        }

        return false;

    }


    static boolean analgama(String str1, String str2){
        char[] arr1 = str1.toLowerCase().toCharArray();
        char[] arr2 = str2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)){
            return true;
        }

        return false;
    }

}
