package ud4;

import java.util.Random;
import java.util.Arrays;

public class FuncionBuscar {

    public static void main(String[] args) {
        
        int[] a = randomArray(5, 1, 40);
        System.out.println(Arrays.toString(a));
        System.out.println(contar( a, 4));
        System.out.println(Arrays.toString(buscarVarios(a, 4)));
        sumar(a);
        ArrayprintReverse(a);
        System.out.println(maximo(a));
        System.out.println(Arrays.toString(averageNaverageP(a)));
    }


    static int[] randomArray(int x, int min_range, int max_range){
        Random rng = new Random();
        int[] a = new int[x];

        for (int i = 0; i< x ;i++){
            a[i] = rng.nextInt(max_range - min_range +1) + min_range;
        }
        
        return a;
    }


    static int contar(int t[], int clave){
        int n = 0;

        for (int i = 0; i < t.length; i++ ){
            if (t[i] == clave){
                n++;
            }
        }
            
        return n;
    }


    static int[] buscarVarios(int t[], int clave){
        int n = 0;
        int[] nArray = new int[t.length];

        for (int i = 0; i < t.length; i++ ){
            nArray[i] = -1;    

            if (t[i] == clave){
                nArray[n] = i;
                n++;
            }
        }

        return Arrays.copyOfRange(nArray, 0, n);

    }


    static int sumar(int[] t){
        int i = 0;

        for(int n : t){
            i+=n;
        }

        System.out.println("El sumatorio es: "+i);

        return i;

    }
    

    static void ArrayprintReverse(int[] t){

        int[] reversedArray = new int[t.length];

        for(int i = t.length-1; i >= 0; i--){
            reversedArray[(i-(t.length-1))*-1] = t[i];
        }

        System.out.println(Arrays.toString(reversedArray));
    }
        

    static int maximo(int t[]){
        int max = t[0];

        for (int n = 1; n < t.length; n++){
            if ( t[n] > max){
                max = t[n];
            }
        }

        return max;
    }


    static double[] averageNaverageP(int[]t){

        int[] a = randomArray(10,-10,10);

        int[] pAverage = new int[10];
        int[] nAverage = new int[10];

        double nResult = 0., pResult = 0.;
        int pCounter = 0, nCounter = 0;

        for (int i = 0; i< t.length; i++){
            if (i < 0){
                nAverage[nCounter] = t[i];
                nCounter++;

            }
            else{
                pAverage[pCounter] = t[i];
                pCounter++;
            }

        }

        for (int i = 0; i < pCounter; i++){
            pResult += pAverage[i];
        }

        for (int i = 0; i < nCounter; i++){
            nResult += nAverage[i];
        }

        double[] Results = {pResult/pCounter,nResult/nCounter};

        return Results;

    }

}
