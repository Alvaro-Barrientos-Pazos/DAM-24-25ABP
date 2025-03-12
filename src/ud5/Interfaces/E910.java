package ud5.interfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class E910 {

    public static void main(String[] args) {
        
        Integer num[] = rngIntegerArr(20,1,100);
        Arrays.sort(num,Comparator.reverseOrder());

        System.out.println(Arrays.toString(num));
    }


    private static Integer[] rngIntegerArr(int length, int min, int max ){
        Integer[] arr = new Integer[length];
        Random rng = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rng.nextInt(max)+1;
        }

        return arr;
    }

}
