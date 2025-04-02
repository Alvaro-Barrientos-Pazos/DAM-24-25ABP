package ud6;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Sorteo<T> {

    public Set<T> ts = new TreeSet<>();

    boolean add (T elemento){
        return ts.add(elemento);
    }

    Set<T> premiados (int numPremiados){
        if (numPremiados <= ts.size() ) {
            return null;
        }
        
        Set<T> ts2 = new TreeSet<>();

        Random rng = new Random();
        
        T rng_value = 0;
        T tmp = 0;
        T[] t = ts.toArray(new T[ts.size()]);

        for (int i = t.length-1; i > 0; i--){
            rng_value = rng.nextInt(i+1);
            tmp = t[i];
            t[i] = t[rng_value ];
            t[rng_value] = tmp;
            ts2.add(t[i]);
        }

        return ts2;
    }
}
