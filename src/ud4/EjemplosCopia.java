package ud4;

import java.util.Arrays;

public class EjemplosCopia {
    public static void main(String[] args) {
        
    }


    static int[] arrayCopy(int[]a){
        int[]b = new int[a.length];

        for (int i = 0; i< a.length-1; i++){
            b[i] = a[i];
        }

        // b = Arrays.copyOf(a, a.length);

        return b;
    }

}
