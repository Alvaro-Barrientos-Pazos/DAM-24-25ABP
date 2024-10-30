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

        final byte S_MINUTES   = 60;                     // Segundos en un minuto
        final int  S_HOUR      = S_MINUTES * S_MINUTES;  // Segundos en una hora
        final int  S_MILLISECS = 1000;

        final byte MAX = 10;
        final byte MIN = 1;
        final byte N_OPERATORS = 3;

        Scanner sc = new Scanner(System.in);

        long msStart, msEnd;     // Tiempo en milisegundos de comienzo y final de la respuesta

        int seconds, minutes;

        int nIntentos = 5;
        int nWins = 0;
        int result = -1;
        
        int input;

        int a, b, operator;
        char cOperator = '+';


        while (nIntentos>0){

            a = (int) (Math.random() * MAX ) + MIN;
            b = (int) (Math.random() * MAX ) + MIN;
            operator = (int) (Math.random() * N_OPERATORS) + 1;

            switch (operator) {
                case 1:
                    cOperator = '+';
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

            msStart = System.currentTimeMillis();

            
            System.out.printf("Cual es el resultado de %d %c %d?\n", a, cOperator, b);
            input = sc.nextInt();

            msEnd = System.currentTimeMillis();

            seconds = (int)(msEnd-msStart) / S_MILLISECS ;
            minutes = seconds % S_HOUR/S_MINUTES;
            seconds = seconds % S_MINUTES;

            if (input == result){
                nWins++;
                System.out.printf("¡Correcto! [tiempo respuesta: %02d:%02d]\n",minutes,seconds);
            }
            else {
                nIntentos--;
                if (nIntentos==0){
                    System.out.printf("Has perdido... nº aciertos: %d\n",nWins);    
                }
                else{
                    System.out.printf("Incorrecto la respuesta era %d. Te quedan %d intentos [tiempo respuesta: %02d:%02d]\n",result,nIntentos,minutes,seconds);
                }
                
            }

        }
        sc.close();
    
    }

}
