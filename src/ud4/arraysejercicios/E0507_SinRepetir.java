package ud4.arraysejercicios;

import java.util.Arrays;

public class E0507_SinRepetir {
    public static void main(String[] args) {
        int[] results = sinRepetidos(new int[]{ 1,2,6,2,3,1,5 });

    }


    static int[] sinRepetidos(int[]a){
        int[] unique_arr = new int[a.length];
        unique_arr[0] = a[0];

        boolean isUnique = true;

        int unique_counter = 1;

        for (int i = 1; i < a.length; i++){

            isUnique = true;

            for (int j = 0; j < unique_counter; j++){
                if (a[i] == unique_arr[j]){
                    isUnique = false;
                    break;
                }
                
            }

            if (isUnique){
                unique_arr[unique_counter] = a[i];
                unique_counter++;
            }

        }

        return Arrays.copyOf(unique_arr, unique_counter);
    }


}
