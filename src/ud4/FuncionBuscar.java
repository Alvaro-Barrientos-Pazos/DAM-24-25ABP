package ud4;

import java.util.Random;
import java.util.Arrays;

public class FuncionBuscar {

    public static void main(String[] args) {

        /*int[] a = randomArray(10, 1, 10);
         
        System.out.println(Arrays.toString(a));
        System.out.println(contar( a, 4));
        System.out.println(Arrays.toString(buscarVarios(a, 4)));
        sumar(a);
        ArrayprintReverse(a);
        System.out.println(maximo(a));
        System.out.println(Arrays.toString(averageNaverageP(a)));
        */
        //System.out.println( Arrays.toString(rellenaPares(10, 10) ) );
        //System.out.println(Arrays.toString(a));
        //System.out.println(buscarUltimo(a,5));

        int[]a1 = randomArray(5,1,5);
        int[]a2 = randomArray(5,1,5);

        System.out.println(Arrays.toString(a1));
        //System.out.println(Arrays.toString(a2));

        int[]a3 = {1,2,3,4,5};

        System.out.println(Arrays.toString(a3));

        System.out.println(numAciertos(a1,a3));

    }


    static int[] randomArray(int length, int min_range, int max_range){
        Random rng = new Random();
        int[] a = new int[length];

        for (int i = 0; i< length ;i++){
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
