package stringejercicios;

import java.util.Scanner;

public class E0603 {
    public static void main(String[] args) {
        
        guessThePassword();
    }

    static void guessThePassword(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la contraseña: ");
        String password = sc.nextLine().toLowerCase();
        String guess;
        int lifes = 3;

        boolean isFinished = false;


        while (isFinished == false) {
            System.out.println("Introduce tu respuesta: ");
            guess = sc.nextLine().toLowerCase();


            if (guess.equals(password)){
                System.out.println("\n¡¡Correcto!!");
                isFinished = true;
            }
            else{
                
                lifes--;
                if (lifes == 0){
                    System.out.println("\nHas perdido");
                    return;
                }
                System.out.println("Incorrecto");
            }

        }

    }
}
