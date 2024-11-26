/* Álvaro Barrientos Pazos */

package ud2.abpexamen_corregido;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AbpChicles_corregido {

    @Test
    
    public void ChiclesRegaloTest() {
        assertEquals(31, totalChicles(25, 5, 1));
        assertEquals(6, totalChicles(5, 5, 1 ));
        assertEquals(111, totalChicles(100, 10, 1));
        assertEquals(100, totalChicles(100, 0, 0));
        assertEquals(-1, totalChicles(20, 2, 5));
        assertEquals(-1, totalChicles(10, -1, 0));
        assertEquals(-1, totalChicles(10, 1, -1));
        assertEquals(-1, totalChicles(20, 2, 2));
        assertEquals(10, totalChicles(7, 3, 1));
        assertEquals(40, totalChicles(27, 3, 1));
        assertEquals(21, totalChicles(11, 2, 1));
        assertEquals(31, totalChicles(16, 2, 1));
        assertEquals(100, totalChicles(100, 0, 0));
        assertEquals(100, totalChicles(100, 0, 1));
        assertEquals(0, totalChicles(0, 0, 1));
        assertEquals(0, totalChicles(0, 2, 1));

    }

    static int totalChicles (int nComprados, int nEnvoltorios,  int nRegalo){

        if ( nEnvoltorios == 0 ){
            return nComprados;
        }

        if ( nRegalo >= nEnvoltorios || nRegalo < 0 ){
            return -1;
        }

        int total  = nComprados;
        int extras = nComprados;
        int buffer = 0;

        while( extras>=nEnvoltorios ) {
            buffer = (extras/nEnvoltorios) * nRegalo;
            total += buffer + extras%nEnvoltorios;

            extras = extras/nEnvoltorios;
        };

        return total;

    }
}
