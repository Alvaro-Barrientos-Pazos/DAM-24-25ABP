package ud4;

import java.util.Arrays;
import java.util.Scanner;

public class EP0514_Sueldos {
    
    static Scanner sc = new Scanner(System.in);

    
    public static void main(String[] args) {
        
        int input = -1, id = 0;

        int[] salaries = new int[1];



        do{
            System.out.print("Introduce numero: ");
            input = sc.nextInt();

            if (input < 0){
                salaries = Arrays.copyOf(salaries, salaries.length-1);
                break;
            }

            salaries[id] = input;
            id++;

            salaries = Arrays.copyOf(salaries, salaries.length+1);

        }while (input != -1);


        Arrays.sort(salaries);

        int max = salaries[0], min = salaries[0];

        double avg = salaries[0];

        for (int i = 1; i < salaries.length-1; i++){
            if (max < salaries[i]){
                max = salaries[i];
            }
            if (min > salaries[i]){
                min = salaries[i];
            }

            avg+= salaries[i];

        }   


        avg /= salaries.length;

        System.out.println("salarios: "+Arrays.toString(salaries));
        System.out.println("max: "+max );
        System.out.println("min: "+min);
        System.out.println("avg: "+avg);

        int cOver = 0, cUnder = 0;

        for (int s : salaries){
            if (s> avg){
                cOver++;
            }
            else if (s < avg){
                cUnder++;
            }
            
        }

        System.out.println("Sueldos por encima de la media: "+cOver);
        System.out.println("sueldos por debajo de la media: "+cUnder);


    }
    

}
