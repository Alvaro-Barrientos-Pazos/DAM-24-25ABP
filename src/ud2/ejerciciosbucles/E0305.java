/* 
    Desarrollar un juego que ayude a mejorar el cálculo mental de la suma. El jugador
    tendrá que introducir la solución de la suma de dos números aleatorios comprendidos
    entre 1 y 100. Mientras la solución sea correcta, el juego continuará. En caso contrario, el
    programa terminará y mostrará el número de operaciones realizadas correctamente.
    
    Amplía el programa para que muestre el número de aciertos al terminar.

    Variante. Permite al usuario un número limitado de fallos.
*/


package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0305 {
    public static void main(String[] args) {

        long msStart = System.currentTimeMillis(); // Hora en milisegundos del comienzo del programa
        long msEnd;                                // Hora en milisegundos de la finalizacion del programa

        final byte MAX = 100;
        final byte MIN = 1;
        final byte N_OPERATORS = 3;


        Scanner sc = new Scanner(System.in);

        int nIntentos = 5;
        int nWins = 0;
        int result = -1;

        while (nIntentos>0){

            int a = (int) (Math.random() * MAX ) + MIN;
            int b = (int) (Math.random() * MAX ) + MIN;
            int operator = (int) (Math.random() * N_OPERATORS) + 1;

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

            msEnd = System.currentTimeMillis();


            final int S_MINUTES = 60;    // Segundos en un minuto
            final int S_HOUR    = S_MINUTES * S_MINUTES; // Segundos en una hora
            

            int seconds = (int)(msEnd-msStart) / 1000 ;
            int minutes = seconds % S_HOUR/S_MINUTES;
            int hours   = seconds / S_HOUR;
            seconds     = seconds % S_MINUTES;

            if (input == result){
                nWins++;

                System.out.printf("Correcto [tiempo respuesta: %02d:%02d:%02d]\n",hours,minutes,seconds);
            }
            else {
                System.out.printf("Incorrecto te quedan %d intentos [tiempo respuesta: %02d:%02d:%02d] [nºAciertos: %d]\n",nIntentos,hours,minutes,seconds,nWins);
                nIntentos--;
            }
        }
    
    }

}
