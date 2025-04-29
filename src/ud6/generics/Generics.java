package ud6.generics;

public class Generics {


    public static <T> T getFirstElement(T[] array) {
        return array.length > 0 ? array[0] : null;
    }
    

}
