package stringejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class E0614 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String oString = "hola";
        int nLifes = 3;

        char[] strShuffled = shuffleString(oString);
        String inputString;

        boolean hasWon = false;

        System.out.println(Arrays.toString(strShuffled));

        do{
            inputString = sc.nextLine();
            hasWon = guessWord(oString, inputString);
            nLifes--;
            if (nLifes == 0){
                System.out.println("Has perdido...");
                sc.close();
                return;
            }

        }while(hasWon == false);
        
        System.out.println("\n\n¡¡Has ganado!!\n\n");
        sc.close();

    }


    static boolean guessWord(String oString, String inputString){
        if (oString.length() != inputString.length()){
            System.out.println("La palabra no tiene este tamaño!!");
            return false;
        }

        char letter;
        boolean isCorrect = true;

        for (int i = 0; i < oString.length(); i++) {
            letter = inputString.charAt(i);

            if (letter == oString.charAt(i)){
                System.out.print(letter);
            }
            else{
                System.out.print('#');
                isCorrect = false;
            }
        }
        System.out.println();
        
        return isCorrect;
    }


    static char[] shuffleString(String str){

        Random rng = new Random();

        char[] arr = str.toCharArray();

        char tmp;
        int random;

        for (int i = arr.length-1; i > 0 ; i--) {
            random = rng.nextInt(i);
            tmp = arr[i];
            arr[i] = arr[random];
            arr[random] = tmp;
        }

        return arr;

    }
}
