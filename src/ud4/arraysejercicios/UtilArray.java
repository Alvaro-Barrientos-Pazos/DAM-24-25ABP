package ud4.arraysejercicios;

import java.util.Random;
import java.util.Arrays;

public class UtilArray {

    public static void main(String[] args) {

        int[]a = {1,2,4,5};

    }


    static int[] randomArray(int length, int min_range, int max_range){
        Random rng = new Random();
        int[] a = new int[length];

        for (int i = 0; i< length ;i++){
            a[i] = rng.nextInt(max_range - min_range +1) + min_range;
        }
        
        return a;
    }

    static public int[] insertarOrdenado(int[] t, int num){

        int[] arrTemp = t.clone();
        int[] arrResults = new int[t.length+1];

        Arrays.sort(arrTemp);

        int index = -Arrays.binarySearch(arrTemp, num)-1;

        arrTemp[index] = num;

        System.arraycopy(arrTemp, 0, arrResults, 0, index+1);

        System.arraycopy(t, index, arrResults, index + 1, t.length - index);

        return arrResults;

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
    

    static int[] InvertArray(int[] t){

        int[] invertedArray = new int[t.length];

        for(int i = t.length-1; i >= 0; i--){
            invertedArray[(i-(t.length-1))*-1] = t[i];
        }

        return invertedArray;
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

    static int[] randomEvenArray(int x, int min_range, int max_range){
        Random rng = new Random();
        int[] a = new int[x];
        int value = 0;

        for (int i = 0; i< x ;i++){
            value = rng.nextInt(max_range - min_range +1) + min_range; 
           
            if (value%2 != 0){
               
                if (value+1 > max_range){
                    value-=1;
                } 
                else{
                    value+=1;
                }
            }

            a[i] = value;

        }
        
        return a;
    }

    static int[] rellenaPares(int length, int end){
        int[] a = randomEvenArray(length, 2, end);
        
        Arrays.sort(a);

        return a;
    }

    static int[] rellenaParesOscar(int length, int end){
        int[] a = randomEvenArray(length, 2, end);
        
        Arrays.sort(a);

        return a;
    }

    static int buscarUltimo(int[] a, int value){

        for (int i=a.length-1; i >= 0; i--){
            if (a[i] == value){
                return i;
            }
            
        }
        return -1;

    }

    static int numAciertosOscar(int[] apuesta, int[] ganadora){
        int i = 0;

        for (int num_apuesta : apuesta){
            if (Arrays.binarySearch(ganadora, num_apuesta) >= 0){
                i++;
            }
        }

        return i; 
    }


    static int numAciertos(int[] apuesta, int[] ganadora){
        int i = 0;

        for (int num_apuesta : apuesta){
            for ( int num_ganador : ganadora){
                if (num_apuesta == num_ganador){
                    i++;
                    break;
                }
            }
        }

        return i; 
    }


}
