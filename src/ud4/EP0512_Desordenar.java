package ud4;

import java.util.Arrays;
import java.util.Random;

public class EP0512_Desordenar {
    public static void main(String[] args) {
        int[]a = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(Arrays.toString(a)+"\n");
        desordenar(a);
        desordenar2(a);

    }

    static void desordenar2(int t[]){
        
        Random rng = new Random();
        
        int rng_value = 0;
        int tmp = 0;

        for (int i = t.length-1; i > 0; i--){
            rng_value = rng.nextInt(i+1);
            tmp = t[i];
            t[i] = t[rng_value ];
            t[rng_value] = tmp;
        }

        System.out.println(Arrays.toString(t));

    }


    static void desordenar(int t[]){
        int tmp = 0;
        int r_value = 0;

        Random rng = new Random();
        int[] used_indexes = new int[t.length];

        boolean isUsedIndex = true;

        for (int i = 0; i<t.length; i++){

            while (isUsedIndex) {
                r_value = rng.nextInt(t.length);  
                isUsedIndex = hasValue(used_indexes,r_value);
            }

            tmp = t[i];
            t[i] = t[r_value];
            t[r_value] = tmp;

            used_indexes[i] = i;
            used_indexes[r_value] = r_value;

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
