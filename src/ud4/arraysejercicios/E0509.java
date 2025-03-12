package ud4.arraysejercicios;

import java.util.Arrays;
import ud4.arraysejercicios.UtilArray;
import java.util.Scanner;

public class E0509 {
    public static void main(String[] args) {
        
        /*
        int[] scores = new int[5];

        
        Scanner sc = new Scanner(System.in);

        for (int i= 0; i < 5; i++){
            scores[i] = sc.nextInt();
        }

        int input = -1;
        */


        int[] test = {2,100,-1};

        int[] scores = {5,1,8,34,10};

        Arrays.sort(scores);

        for(int i = 0; i < test.length; i++ ){
            if (test[i] != -1){
                if (test[i] >= scores[scores.length-1]){
                    scores = Arrays.copyOf(scores, scores.length+1);
                    scores[scores.length-1] = test[i];
                }
                else{
                    scores = UtilArray.insertarOrdenado(scores,test[i]);    
                }
                
            }            
        }

        /*
        
        do{

            input = sc.nextInt();
            if (input != -1){
                scores = UtilArray.insertarOrdenado(scores,input);    
            }
            
                
        }while(input != -1);
        
        */
        
        System.out.println("Scores: "+Arrays.toString(scores));

    }



}
