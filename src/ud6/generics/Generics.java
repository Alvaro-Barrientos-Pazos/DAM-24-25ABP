package ud6.generics;

import java.util.Objects;

public class Generics {

    private String firstName, lastName;

    public static <T> T getFirstElement(T[] array) {
        return array.length > 0 ? array[0] : null;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        Generics other = (Generics) obj;
        return Objects.equals(firstName, other.firstName)
        && Objects.equals(lastName, other.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

}