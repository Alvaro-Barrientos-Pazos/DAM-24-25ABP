package pruebaExamen;

import java.util.Arrays;
import java.util.Scanner;

public class AbadiasPirenaicas {

    public static void main(String[] args) {

        int[] arr = new int[] { 6000, 3500, 7000, 3100, 3200 };

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * int[] arr = new int[0];
         * int input = 0;
         * 
         * while (arr.length < 1000 && input >= 0) {
         * 
         * input = sc.nextInt();
         * 
         * if (input >= 0){
         * arr = Arrays.copyOf(arr, arr.length+1);
         * arr[arr.length-1] = input;
         * }
         * }
         */

        System.out.println("La medida de las montañas es de: " + Arrays.toString(arr));
        int[] validHeights = findValidHeights(arr);
        System.out.printf("Se pueden construir %d abadías en las cordilleras: %s\n", validHeights.length,
                Arrays.toString(validHeights));

    }

    static int[] findValidHeights(int[] arr) {

        int[] validArr = new int[arr.length];
        int counter = 0;
        int max_height = 0;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] > max_height) {
                validArr[counter] = i + 1;
                counter++;
                max_height = arr[i];
            }
        }

        validArr = Arrays.copyOf(validArr, counter);
        Arrays.sort(validArr);
        return validArr;

    }

}
