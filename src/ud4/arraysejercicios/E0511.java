package ud4.arraysejercicios;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;

public class E0511 {
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        worddle( inputInt() );
    
    }


    static int inputInt(){

        int input = -1;

        do{
            System.out.println("Introduce la longitud del número para el juego:");
            try {
                input = sc.nextInt();

                if (input <= 0){
                    System.out.println("¡¡ Solo se aceptan números enteros superiores a 0 !!\n\n");
                    sc.nextLine();
                }

            } catch (InputMismatchException e) {
                System.out.println("¡¡ Solo se aceptan números enteros superiores a 0 !!\n\n");
                sc.nextLine();
            }
        }while(input <= 0);

        sc.nextLine();

        return input;
    }


    static void worddle(int num_length){

        int[] arr = generate_worddle_numbers(num_length);

        String curr_str_guess;
        char curr_guess;

        String console_response = "";

        boolean isFinished = true;

        System.out.println("\nIntroduce tus respuesta:");

        do{
            isFinished = true;
            curr_str_guess = sc.nextLine();
            console_response = "";
            
            if (curr_str_guess.length() > arr.length){
                isFinished = false;
                System.out.println("El número no es tan largo");
            }
            else{

                for (int i = 0; i< curr_str_guess.length();i++){
                    curr_guess = curr_str_guess.charAt(i);
    
                    if (Character.getNumericValue(curr_guess) > arr[i]){
                        console_response += "-";
                        isFinished = false;
    
                    }
                    else if (Character.getNumericValue(curr_guess) < arr[i]){
                        console_response += "+";
                        isFinished = false;
                    }
                    else{
                        console_response += curr_str_guess.charAt(i);
                    }
    
                }
    
                System.out.println(console_response);
                System.out.println();
            }
        
        }while(isFinished == false);


        sc.close();
        System.out.println("Has Ganado!!");


    }

    static int[] generate_worddle_numbers(int num_length){

        Random rng = new Random();

        int[]arr = new int[num_length];

        for (int i = 0; i < num_length; i++){
            arr[i]=rng.nextInt(6)+1;
        }
        
        //System.out.println("Solucion: "+Arrays.toString(arr));

        return arr;
        
    }

    


}
