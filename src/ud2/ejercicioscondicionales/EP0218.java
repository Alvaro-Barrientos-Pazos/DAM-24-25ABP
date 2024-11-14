/*
Modifica la actividad anterior (EP0217) para que, además de los dos números aleatorios, 
también aparezca aleatoriamente la operación que debe realizar el jugador: suma, resta o multiplicación.

Amplía el programa anterior para que muestre el número de segundos que el usuario ha tardado en responder. Utiliza la clase LocalTime.
*/
package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0218 {
    public static void main(String[] args) {

        long msStart = System.currentTimeMillis(); // Hora en milisegundos del comienzo del programa
        long msEnd;                                // Hora en milisegundos de la finalizacion del programa

        final byte MAX = 99;
        final byte MIN = 1;
        final byte N_OPERATORS = 3;

        Scanner sc = new Scanner(System.in);

        int a = (int) (Math.random() * MAX ) + MIN;
        int b = (int) (Math.random() * MAX ) + MIN;
        int operator = (int) (Math.random() * N_OPERATORS) + 1;
        int result = -1;

        char cOperator = '+';

        switch (operator) {
            case 1:
                result = a + b;
                break;

            case 2:
                cOperator = '-';
                result = a - b;
                break;

            case 3:
                cOperator = '*';
                result = a * b;
                break;
        }

        System.out.printf("Cual es el resultado de %d %c %d?\n", a, cOperator, b);
        int input = sc.nextInt();
        sc.close();

        msEnd = System.currentTimeMillis();


        final int S_MINUTES = 60;    // Segundos en un minuto
        final int S_HOUR    = S_MINUTES * S_MINUTES; // Segundos en una hora
        

        int seconds = (int)(msEnd-msStart) / 1000 ;
        int minutes = seconds % S_HOUR/S_MINUTES;
        int hours   = seconds / S_HOUR;
        seconds     = seconds % S_MINUTES;

        System.out.printf("%s [%02d:%02d:%02d]\n",input == result ? "Correcto": "Incorrecto",hours,minutes,seconds);

    }
}
