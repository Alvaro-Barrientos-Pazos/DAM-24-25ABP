package ud4;

import java.util.Arrays;
import java.util.Random;

public class EP0512_Desordenar {
    public static void main(String[] args) {
        int[]a = {1,2,3,4};
        desordenar(a);

    }

    static void desordenar(int t[]){

        Random rng = new Random();

        int[] indexes = new int[t.length];

        int tmp = 0;

        int rng_value = 0;

        boolean flag = true;

        for (int i = 0; i<t.length-1; i++){

            tmp = t[i];

            while (flag) {
                rng_value = rng.nextInt(t.length-1);  
                
                if (!hasValue(indexes,rng_value)){
                    flag = false;
                }

            }

            t[i] = t[rng_value];
            t[rng_value] = tmp;

            indexes[i] = i;
            indexes[rng_value] = rng_value;
            

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
