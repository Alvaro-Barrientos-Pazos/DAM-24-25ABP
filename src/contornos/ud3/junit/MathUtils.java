package contornos.ud3.junit;

public class MathUtils {

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número debe ser positivo");
        }

            int resultado = 1;
            
            // Modificamos el loop para que se incremente la variable de 1 a n en vez de restarle a 1
            for (int i = 1; i <= n; i++) {
                resultado *= i;
            }
            return resultado;
    }
}

