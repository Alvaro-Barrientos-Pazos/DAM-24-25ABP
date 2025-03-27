package ud6.e1202;

import java.util.Arrays;

public class ContenedorLista<T> implements Pila<T>, Cola<T>{

    T[] list;

    public ContenedorLista( T[]t){
        list = t;
    }

     void insertarAlPrincipio(T nuevo){
        System.arraycopy(list, 0, list, 1, list.length+1);

        list[0] = nuevo;
    }

    void insertarAlFinal(T nuevo){
        list = Arrays.copyOf(list, list.length+1);
        list[list.length-1] = nuevo;
    }
    
    T extraerDelPrincipio(){
        T v = list[0];
        list = Arrays.copyOfRange(list, 1, list.length);
        return v;
    }

    T extraerDelFinal(){
        T v = list[list.length-1];
        list = Arrays.copyOf(list, list.length-1);
        return v;
    }

    void ordenar(){

    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }


    @Override
    public void apilar(T t) {
        list = Arrays.copyOf(list, list.length+1);
        list[list.length-1] = t;        
    }

    @Override
    public T desapilar() {
        T v = list[list.length-1];
        list = Arrays.copyOf(list, list.length-1);
        return v;
    }

    @Override
    public void encolar(T e) {
        list = Arrays.copyOf(list, list.length+1);
        list[list.length-1] = e;    
    }

    @Override
    public T desencolar() {
        T v = list[0];
        list = Arrays.copyOfRange(list, 1, list.length);
        return v;
    }


}
