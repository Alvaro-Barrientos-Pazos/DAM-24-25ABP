package ArraysEstadisticas;
import java.util.Arrays;

public class ArraysEstadisticas {
    
    public static void main(String[] args) {
        // Declaración de variables y constantes
        int[] numeros1 = {2, 4, 6, 7, 4, 7, 9, 2, 5, 6, 7};
        int[] numeros2 = {2, 4, 6, 7, 4, 9, 2, 5, 6, 7};
        // Proceso y salida
        imprimeEstadisticas(numeros1);
        imprimeEstadisticas(numeros2);
    }

    static void imprimeEstadisticas(int[] numeros) {
        System.out.println("ARRAY ORIGINAL: " + Arrays.toString(numeros));
        //System.out.println("---------------------------------------------");
        //System.out.println("Longitud: " + numeros.length);
        //System.out.println("Suma: " + suma(numeros));
        //System.out.println("Máximo: " + maximo(numeros));
        //System.out.println("Mínimo: " + minimo(numeros));
        //System.out.println("Media: " + media(numeros));
        //System.out.println("Mediana: " + mediana(numeros));
        System.out.println("Moda: " + moda(numeros));
        Arrays.sort(numeros);
        System.out.println("ARRAY ORDENADO: " + Arrays.toString(numeros));
        System.out.println("---------------------------------------------\n\n");
    }




    static int suma(int[] numeros){
        int acc = 0;
        for (int n : numeros) {
            acc += n;
        }
        
        return acc;
    }

    static int minimo(int[] numeros){
        int min = numeros[0];
        for (int n : numeros) {
            if (n < min){
                min = n;
            }
        }
        
        return min;
    }


    static int maximo(int[] numeros){
        int max = numeros[0];
        for (int n : numeros) {
            if (n > max){
                max = n;
            }
            
        }
        
        return max;
    }    

    static double media(int[] numeros){
        double acc = 0;
        for (int n : numeros) {
            acc += n;   
        }
        
        return acc/numeros.length;
    }

    static double mediana(int[] numeros){
        int[] a = Arrays.copyOf(numeros, numeros.length);

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        if (a.length%2.0==0){
            return (a[a.length/2-1] + a[a.length/2])/2.0;
            
        }
        else {
            return a[a.length/2];
        }
    }


    static int moda(int[] numeros){
        
        int[] a = numeros.clone();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        
        int max_num = -1;
        int count = 0;
        int max_count = 0;     
        int num = numeros[0];  // num = numeros[0] = 1
                                
                                
                // counter:      1
        for (int n : a) {   // { 1,3,3,4,4,5,6}
            
            if (n != num){   // n != num // counter = 1
                num = n;
                count = 1;
            }
            else {
                count+=1;       

                if (count == max_count){
                    max_num = -1;
                }

                if( count > max_count){           // i = 0
                    max_count = count;            // max_count = 1
                    max_num = num;               // max_num1 = 1
                }
            }
        }

        return max_num;
        
    }



}
