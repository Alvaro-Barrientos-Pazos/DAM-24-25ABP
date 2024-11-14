/*
Idear un programa que solicite al usuario un número comprendido entre 1 y 7, correspondiente a un día de la semana. 
Se debe mostrar el nombre del día de la semana al que corresponde. Por ejemplo, el número 1 corresponde a “lunes” y el 6 a “sábado”.

*/

package ud2.ejercicios;

import java.util.Scanner;

public class E0211 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero entre 1 y 7: ");

        int diaIndex = sc.nextInt();
        sc.close();

        switch (diaIndex) {
            case 1:
                System.out.println("Lunes");                
                break;
        
            case 2:
                System.out.println("Martes");                
                break;

            case 3:
                System.out.println("Miercoles");                
                break;

            case 4:
                System.out.println("Jueves");                
                break;

            case 5:
                System.out.println("Viernes");                
                break;

            case 6:
                System.out.println("Sabado");                
                break;

            case 7:
                System.out.println("Domingo");                
                break;

            default:
                System.out.println("Número invalido");    
                break;

        }

    }
}
