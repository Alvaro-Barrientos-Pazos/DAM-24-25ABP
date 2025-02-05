package arraysejercicios;

import java.util.Arrays;

public class E0510 {
    public static void main(String[] args) {
        
        int[] arr1 = UtilArray.randomArray();

        final int BIGGER_THAN = 6;
        final int DELETE_INDEX = 4;

        int[] arr2 = eliminarMayores(arr1,BIGGER_THAN);
        int[] arr3 = noLoopDelete(arr1,DELETE_INDEX);

        System.out.println("Original: "+Arrays.toString(arr1));
        System.out.printf("EliminarMayores que %d: %s\n",BIGGER_THAN,Arrays.toString(arr2));
        System.out.printf("NoLoopDelete índice[%d]: %s\n",DELETE_INDEX,Arrays.toString(arr3));

    }


    static int[] eliminarMayores(int t[], int valor){
        int[] arr = new int[t.length];

        int counter = 0;

        for (int n : t) {
            if (n <= valor){
                arr[counter] = n;
                counter++;
            }
        }

        return Arrays.copyOf(arr, counter);

    }

    static int[] noLoopDelete(int[] t, int index){
        int[] arr = t.clone();

        arr[index] = arr[arr.length-1];


        return Arrays.copyOf(arr, arr.length-1);
    }

}
