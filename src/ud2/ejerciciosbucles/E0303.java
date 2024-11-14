/* 
    Codificar el juego “el número secreto”, que consiste en acertar un número entre 1 y 100 (generado aleatoriamente). 
    Para ello se introduce por teclado una serie de números, para los que se indica: “mayor” o “menor”, según sea mayor o menor con respecto al número secreto. 
    El proceso termina cuando el usuario acierta o cuando se rinde (introduciendo un -1).

    - Amplía el programa para que muestre el número secreto cuando el usuario se rinda y el número de intentos cuando haya acertado.

*/

package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0303 {

    public static void main(String[] args) {
        
        final byte MIN = 1, MAX = 100;

        Scanner sc = new Scanner(System.in);

        int nInput=0, input, randNumber;
        
        // Math.random() * ( MAX - MIN ) + MIN
        randNumber = (int)(Math.random() * MAX ) + MIN;

        System.out.print("Introduce un número del 0 al 100: ");
        input = sc.nextInt();
        sc.close();

        String mensaje;

        while (input != -1) {
            
            if (input == -1){
                System.out.printf("El jugador se ha rendido el número era: %d [intentos:%d]",randNumber,nInput);
                sc.close();
                return;
            }
            else if (input == randNumber){
                System.out.printf("¡Enhorabuena el número era %d! [intentos:%d]",input,nInput);
                sc.close();
                return;
            }
            else{
                
                nInput++;
                mensaje = input>randNumber ? "menor" : "mayor";

                System.out.printf("el número es %s que %d",mensaje,input);
                System.out.print("\n\nIntroduce un número del 0 al 100: ");
                input = sc.nextInt();
            }
            
        }
    }
}