package stringejercicios;

import java.util.Scanner;

public class E0609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = "";
        String input = "";
        boolean isLooping = true;

        do{
            input = sc.nextLine();

            if (input.equals("fin")){
                isLooping = false;
            }
            else{
                str += input.toLowerCase()+" ";
            }
            
        }while(isLooping);

        str.stripTrailing();

        System.out.println(str);


    }
}
