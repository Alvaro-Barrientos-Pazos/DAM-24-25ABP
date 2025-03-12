package contornos.ud3.junit;

public class PasswordValidator {

    public static boolean isValid(String password) {
        
        // Corregido: Cambio <= por < se aceptan contraseñas de 8 caracteres
        if (password.length() < 8) { 
            return false;
        }
        
        boolean hasUpperCase = false;
        boolean hasDigit = false;
        
        for (char c : password.toCharArray()) {
            // Corregido: Cambio de isLowerCase() a isUpperCase() para buscar mayúsculas
            if (Character.isUpperCase(c)) { 
                hasUpperCase = true;
            }
            if (Character.isDigit(c)) {
                hasDigit = true; // Corregido: hasDigit debe ser verdadero si se encuentra un dígito
            }
        }
        
        // Corregido: Cambio de operador OR a AND
        return hasUpperCase && hasDigit; 
    }
}

