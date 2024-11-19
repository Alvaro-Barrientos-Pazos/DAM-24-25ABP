package ud2.practicas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraHumana {

    static Scanner sc = new Scanner(System.in);

    static int nPoints = 0, nFails = 0;

    public static void main(String[] args) {

        final byte nTries = 7;

        boolean isLooping = true;
        

        do {
            chooseQuestion();

            if (nPoints == nTries){
                System.out.printf("El programa ha terminado has conseguido: %s aciertos\n",nPoints);
                isLooping = false;
            }

        } while(isLooping);
        
        sc.close();
        
    }


    static void chooseQuestion(){
        int programID = randNumber(0, 3);

        switch (programID) {
            case 0 -> addition();
            case 1 -> substraction();
            case 2 -> multiplication();
            default -> division();
        };
    } 


    static int ValidateInput(){
        int input = 0;
        
        try{
            input = sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Solo se aceptan números enteros");
        }

        return input;
    }


    static boolean addition(){
        int op1 = randNumber(0, 200);
        int op2 = randNumber(0, 200-op1);
        int result = op1+op2;


        System.out.printf("%d + %d = ");
        int answer = ValidateInput();

        return AnswerIsCorrect(answer, result);
    }


    // Resultado mínimo de la resta es 0
    static boolean substraction(){
        int op1 = randNumber(0, 200);
        int op2 = randNumber(0, op1); 
        int result = op1-op2;

        operationModule(result);
        
    }

    static boolean multiplication(){
        int op1 = randNumber(0, 200);
        int op2 = randNumber(0, 200/op1);
        int result = op1*op2;

        System.out.printf("%d * %d = ");
        int answer = ValidateInput();
        return AnswerIsCorrect(answer, result);
    }

    static boolean division(){
        int op1 = randNumber(0, 200);
        int op2 = randNumber(0, 200);
        int result = op1/op2;

        System.out.printf("%d / %d = ");
        int answer = ValidateInput();
        return AnswerIsCorrect(answer, result);
    }

    static int randNumber(int min,int max){
        return (int)Math.random()*(max-min+1)+min;
    }

    static boolean AnswerIsCorrect(int answer, int result){
        sc.nextLine();

        if (answer == result){
            nPoints++;
            System.out.printf("¡¡Correcto!! (Aciertos: %d)\n",nPoints);
            return true;    
        }
        nFails++;
        System.out.printf("Incorrecto (Fallos: %d)\n",nFails);
        return false;
    }


    static void operationModule(int result){
        boolean isLooping = true;

        do {
            
            isLooping = true;
            System.out.printf("%d - %d = ");
            int answer = ValidateInput();

            if (AnswerIsCorrect(answer, result)){
                isLooping = false;
            }

        }while(isLooping);
    }

}
