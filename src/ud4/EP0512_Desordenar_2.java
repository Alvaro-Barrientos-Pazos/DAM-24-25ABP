package ud4;

import java.util.Arrays;
import java.util.Random;

public class EP0512_Desordenar_2 {
    public static void main(String[] args) {
        int[]a = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(a));
        desordenar(a);

    }


    static void desordenar(int t[]){
        
        int tmp = 0;
        int rng_value = 0;

        Random rng = new Random();

        for (int i = t.length-1; i > 0; i--){

            rng_value = rng.nextInt(i);
            
            tmp = t[i];
            t[i] = t[rng_value];
            t[rng_value] = tmp;

        }

        System.out.println(Arrays.toString(t));

    }


    static boolean hasValue(int[]a, int value){

        for (int n : a){
            if (value == n){
                return true;
            }

        }
    
        return false;
    }
}
