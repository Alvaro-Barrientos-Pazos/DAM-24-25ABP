package contornos.ExamenContornos;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;


public class DiscountSystemTest {
    @Test
    void testApplyDiscount() {
        
        try {
            DiscountSystem.applyDiscount(-1,true);   
            fail("No devuelve da excepción cuando el parámetro es negativo");
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }


    @Test
    void testApplyDiscount2() {
        assertEquals(49, DiscountSystem.applyDiscount(49, true),0.01);
    }

    @Test
    void testApplyDiscount3() {
        assertEquals(47.5, DiscountSystem.applyDiscount(50, true),0.01);
    }

    @Test
    void testApplyDiscount4() {
        assertEquals(95, DiscountSystem.applyDiscount(100, true),0.01);
    }

    @Test
    void testApplyDiscount5() {
        assertEquals(180, DiscountSystem.applyDiscount(200, false),0.01);
    }

    @Test
    void testApplyDiscount6() {
        assertEquals(170, DiscountSystem.applyDiscount(200, true),0.01);
    }


}
