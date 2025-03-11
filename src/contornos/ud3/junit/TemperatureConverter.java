package contornos.ud3.junit;

public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        // Error: la división debe contener al menos un número de coma flotante para garantizar la precisión
        return celsius * (5 / 9.) + 32;
    }

}
