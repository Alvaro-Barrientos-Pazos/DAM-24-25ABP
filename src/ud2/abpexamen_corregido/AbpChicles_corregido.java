/* Autor: Álvaro Barrientos Pazos */

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
    }

    static int totalChicles (int nComprados, int nEnvoltorios,  int nRegalo){

        if ( nRegalo > nEnvoltorios ){
            return -1;
        }

        if ( nEnvoltorios == 0 ){
            return nComprados;
        }

        int total  = nComprados;
        int extras = nComprados;
        int buffer = 0;

        while( extras>=nEnvoltorios ) {
            buffer = (extras/nEnvoltorios) * nRegalo;
            total += buffer;
            extras = extras/nEnvoltorios;
        };

        return total;

    }

}
