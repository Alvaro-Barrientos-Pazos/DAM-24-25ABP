package ud2.practicas;

import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraHumana {

    static Scanner sc = new Scanner(System.in);

    static int nPoints = 0, nFails = 0, nHP = 0;

    static final byte ANSWER_TIMEOUT = 60;

    static int timer_start;


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
        
        timer_start = LocalTime.now().toSecondOfDay();

        try{
            input = sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Solo se aceptan números enteros");
        }
        finally{
            isOutofTime();
        }

        return input;
    }


    static void addition(){
        int op1 = randNumber(0, 200);
        int op2 = randNumber(0, 200-op1);
        int result = op1+op2;

        operationModule(String.format("%d + %d = ",op1,op2), result);
    }


    // Resultado mínimo de la resta es 0
    static void substraction(){
        int op1 = randNumber(0, 200);
        int op2 = randNumber(0, op1); 
        int result = op1-op2;

        operationModule(String.format("%d - %d = ",op1,op2), result);
    }


    static void multiplication(){
        int op1 = randNumber(0, 200);
        int op2 = randNumber(0, 200/op1);
        int result = op1*op2;

        operationModule(String.format("%d * %d = ",op1,op2), result);
    }


    // Impedir decimales muy pequeños
    static void division(){
        int op1 = randNumber(0, 200);
        int op2 = randNumber(0, op1);
        int result = op1/op2;

        operationModule(String.format("%d / %d = ",op1,op2), result);
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


    static void operationModule(String msg, int result){
        boolean isLooping = true;

        do {
            
            System.out.print(msg);
            isLooping = true;
            int answer = ValidateInput();

            if (AnswerIsCorrect(answer, result)){
                isLooping = false;
            }

        }while(isLooping);
    }


    static int randNumber(int min,int max){
        return (int)(Math.random()*(max-min+1)+min);
    }

    
    static void isOutofTime(){
        int timer_end = LocalTime.now().toSecondOfDay();        

        if (timer_end-timer_start >= ANSWER_TIMEOUT){
            System.out.println("El tiempo se habia acabado, has sido eliminado");
            System.exit(0);
        }
    }

}
