package contornos.ExamenContornos;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class EmailValidatorTest {
    @Test
    void testIsValid() {
        assertEquals(false, EmailValidator.isValid(null));
    }
    @Test
    void testIsValid2() {
        assertEquals(true, EmailValidator.isValid("alvaro@gmail.com"));
    }
    @Test
    void testIsValid3() {
        assertEquals(false, EmailValidator.isValid("alvaro_gmail.com"));
    }
    @Test
    void testIsValid4() {
        assertEquals(false, EmailValidator.isValid("alvaro@@gmail.com"));
    }
    @Test
    void testIsValid5() {
        assertEquals(false, EmailValidator.isValid("alvaro@"));
    }
    @Test
    void testIsValid6() {
        assertEquals(false, EmailValidator.isValid("@gmail.com"));
    }
}
