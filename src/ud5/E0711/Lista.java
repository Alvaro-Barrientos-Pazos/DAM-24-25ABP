package ud5.e0711;

import java.util.Arrays;

public class Lista {

    Integer[] lista;

    public Lista(){
        lista = new Integer[0];
    }


    public int getSize(){
        return lista.length;
    }

    public void insert(int n){
        Arrays.copyOf(lista, lista.length+1);
        lista[-1] = Integer.valueOf(n);
    }


}
