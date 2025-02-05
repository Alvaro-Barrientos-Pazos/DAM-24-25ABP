package stringejercicios;

import java.util.Scanner;

public class E0602 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la primera string:");
        String str1 = sc.nextLine();
        System.out.println("Introduce la segunda string:");
        String str2 = sc.nextLine();

        String str3 = returnLongestString(str1,str2);
        System.out.println(str3);
        
    }

    static String returnLongestString(String str1,String str2){
        return str1.length() > str2.length() ? str1 : 
        str1.length() == str2.length() ? "Tienen la misma longitud" : str2;
    }
}
