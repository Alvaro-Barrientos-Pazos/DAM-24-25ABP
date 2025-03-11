package contornos.ud3.junit;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(32., TemperatureConverter.celsiusToFahrenheit(0));
    }

    @Test
    void testCelsiusToFahrenheit2() {
        assertEquals(212., TemperatureConverter.celsiusToFahrenheit(100));
    }
}
