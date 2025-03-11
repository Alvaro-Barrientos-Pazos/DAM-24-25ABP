package contornos.ud3.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.jupiter.api.Test;

public class MathUtilsTest {
    @Test
    void testFactorialValido() {
        assertEquals(2, MathUtils.factorial(2));
    }

    @Test
    void testFactorialValido2() {
        assertEquals(40320, MathUtils.factorial(8));
    }


    @Test
    void testFactorialException(){
        
        try {
            MathUtils.factorial(-1);   
            fail("No devuelve da excepción cuando el parámetro es negativo");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
