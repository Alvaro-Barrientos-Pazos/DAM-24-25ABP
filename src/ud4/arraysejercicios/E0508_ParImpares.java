package arraysejercicios;

import java.util.Arrays;

public class E0508_ParImpares {
    public static void main(String[] args) {
        
        int[]arr1 = arraysejercicios.UtilArray.randomArray();
        
        int[]arrEvenNumbers = getPares(arr1);
        int[]arrOddNumbers = getImpares(arr1);
        
        Arrays.sort(arrEvenNumbers);
        Arrays.sort(arrOddNumbers);
        
        System.out.println("Random: "+Arrays.toString(arr1));
        System.out.println("Pares: "+Arrays.toString(arrEvenNumbers));
        System.out.println("Impares: "+Arrays.toString(arrOddNumbers));

    }


    static int[] getPares(int t[]){
        int[] a = t.clone();

        int counter = 0;

        for (int i = 0; i< t.length;i++){
            if (t[i]%2 == 0){
                a[counter] = t[i];

                counter++;
            }
        }

        return Arrays.copyOf(a, counter);
    }


    static int[] getImpares(int t[]){
        int[] a = t.clone();

        int counter = 0;

        for (int i = 0; i< t.length;i++){
            if (t[i]%2 != 0){
                a[counter] = t[i];

                counter++;
            }
        }

        return Arrays.copyOf(a, counter);
    }

}
