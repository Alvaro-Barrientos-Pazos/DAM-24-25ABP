package ud6.e1202;

import java.util.Arrays;

public class Contenedor<T> {

    T[] list;

    /*
    void insertarAlPrincipio(T nuevo){
        list = Arrays.copyOf(list, list.length+1);
        System.arraycopy(list, 0, list, 1, list.length);

        list[0] = nuevo;

    }
     */

    public Contenedor( T[]t){
        list = t;
    }

     void insertarAlPrincipio(T nuevo){
        list = Arrays.copyOf(list, list.length+1);
        System.arraycopy(list, 0, list, 1, list.length);

        list[0] = nuevo;

    }

    void insertarAlFinal(T nuevo){
        list = Arrays.copyOf(list, list.length+1);
        list[list.length-1] = nuevo;
    }
    
    T extraerDelPrincipio(){

    }
}
