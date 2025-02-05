package matricesejercicios;

import java.util.Arrays;

import arraysejercicios.UtilArray;

public class BuscarColumnaSumaMayor {

    public static void main(String[] args) {
        int [][] arr = UtilArray.randomMatrix();
        UtilArray.printMatrix(arr);
        BuscarColumnaSumaMayor(arr);
    }


    static void BuscarColumnaSumaMayor(int[][]a){

        if (a == null || a.length == 0 || a[0].length == 0) {
            throw new IllegalArgumentException("Matrix must not be null or empty.");
        }

        int acc = 0;
        int max_acc = 0;
        int column_id = 0;
        int[] max_column = new int[a.length];


        for (int i = 0; i < a[0].length ; i++ ){
            acc = 0;
            for (int j = 0; j < a.length ; j++ ){
                acc += a[j][i];
            }
            
            System.out.println("["+i+"] acc: "+acc);
            if (i == 0 || acc > max_acc){
                max_acc = acc;
                column_id = i;
            }

        }

        System.out.print("\n["+column_id+"] arr: ");
        for (int i = 0; i< a.length;i++){
            max_column[i]= a[i][column_id];
        }

        System.out.println(Arrays.toString(max_column));

    }
}
