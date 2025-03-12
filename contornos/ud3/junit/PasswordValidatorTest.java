package contornos.ud3.junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {

    @Test
    void TestValidPassword() {
        assertEquals(true, PasswordValidator.isValid("contraseñaSegura123"));
    }

    @Test
    void TestInvalidShortPassword() {
        assertEquals(false, PasswordValidator.isValid("aB1"));
    }

    @Test
    void TestInvalidEightCharactersPassword() {
        assertEquals(false, PasswordValidator.isValid("abcdefghijklmn"));
    }

    @Test
    void TestInvalidOWithUpperCasePassword() {
        assertEquals(false, PasswordValidator.isValid("HOLAqueTALestas"));
    }

    @Test
    void TestInvalidWithNumberPassword() {
        assertEquals(false, PasswordValidator.isValid("contraseña123"));
    }
    

}
