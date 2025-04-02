/*
    Implementar un método estático que lleve a cabo la unión de dos conjuntos de
    elementos genéricos. La unión es un nuevo conjunto con todos los elementos que
    pertenezcan, al menos a uno de los dos conjuntos.
    Implementa en otro método genérico la intersección, formada por los elementos comunes
    a los dos conjuntos. Los prototipos de los métodos son: 
 */

package ud6.e1212;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class E1212 {

    public static void main(String[] args) {

            HashSet<Integer> h1 = new HashSet<>();
            HashSet<Integer> h2 = new HashSet<>();

            for (int i = 0; i < 5; i++) {
                h1.add(i);
            }

            for (int i = 3; i < 8; i++) {
                h2.add(i);
            }
            System.out.println("h1: "+h1);
            System.out.println("h2: "+h2);


        Set<Integer> t = interseccion(h1,h2);

        System.out.println(t);
    }
    
    static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2){
        Set<E> t = new TreeSet<>(conjunto1);
        t.addAll(conjunto2);
        return t;
    }

    static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2){
        Set<E> t = new TreeSet<>();
        Iterator<E> it = conjunto1.iterator();

        E v = null;

        while (it.hasNext()) {
            v = it.next();
            if (conjunto2.contains(v)) {
                t.add(v);
            }
        }
        
        return t;
    }
}
