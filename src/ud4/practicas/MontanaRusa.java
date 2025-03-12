package ud4.practicas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MontanaRusa {


    @Test
    void testContarPicos_CasoBase() {
        int[] alturas = { 1, 2, 3, 2, 1 };
        assertEquals(1, contarPicos(alturas));
        }
    @Test
    void testContarPicos_MultiplesPicos() {
        int[] alturas = { 1, 2, 3, 2, 1, 0, 1, 2, 3, 2, 1 };
        assertEquals(2, contarPicos(alturas));
        }
    @Test
    void testContarPicos_PicoAlFinal() {
        int[] alturas = { 1, 2, 3, 4, 5 };
        assertEquals(1, contarPicos(alturas));
        }
    @Test
    void testContarPicos_PicoEnInicio() {
        int[] alturas = { 5, 4, 3, 2, 3, 4, 4 };
        assertEquals(1, contarPicos(alturas));
        }
    @Test
    void testContarPicos_MontañaCircularSinPicos() {
        int[] alturas = { 3, 2, 1, 2, 3 };
        assertEquals(0, contarPicos(alturas));
        }
    @Test
    void testContarPicos_MontañaCircularConVariosPicos() {
        int[] alturas = { 3, 2, 1, 2, 1, 2, 1, 2, 3 };
        assertEquals(2, contarPicos(alturas));
        }

    public static void main(String[] args) {
    
        int[] arr1 = new int[]{ 4,10,3,2};      // 1
        int[] arr2 = new int[]{ 10,3,2,4};      // 1
        int[] arr3 = new int[]{ 1,10,10,1,2};   // 0

        System.out.println((0-1)%4);

        System.out.println(contarPicos(arr1));
        System.out.println(contarPicos(arr2));
        System.out.println(contarPicos(arr3));


    }


    static int contarPicos(int[] alturas){              // { 4,10,3,2};      // 1
        int nPeaks = 0;
        int nValue = 0;
        int pValue = 0;
        int currValue = 0;

        for (int i = 0; i < alturas.length; i++) {
            currValue = alturas[i];

            nValue = alturas[(i+1)%alturas.length];
            if (i == 0){
                pValue = alturas[alturas.length-1];
            }
            else{
                pValue = alturas[i-1];
            }
            
            if (nValue < currValue && pValue < currValue){
                nPeaks++;
            }

        }
        

        return nPeaks;
    }

}
