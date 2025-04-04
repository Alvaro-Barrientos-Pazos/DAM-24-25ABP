package ud6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import rol.Personaje;

public class Sorteo<T> {

    public Set<T> ts;

    public Sorteo(){
        ts = new TreeSet<>();
    }

    boolean add (T elemento){
        return ts.add(elemento);
    }

    Set<T> premiados (int numPremiados){
        if (numPremiados > ts.size() ) {
            return null;
        }

        Set<T> winners = new LinkedHashSet();
        List<T> list = new ArrayList<>(ts);

        Collections.shuffle(list);

        for (int i = 0; i < numPremiados; i++) {
            winners.add(list.get(i));
            i++;
        }
        
        return winners;
    }

    public static void main(String[] args) {
        Sorteo<Personaje> sorteo = new Sorteo<>();
        sorteo.add(new Personaje("Aragorn"));
        sorteo.add(new Personaje("Mara"));
        sorteo.add(new Personaje("Paula"));
        sorteo.add(new Personaje("Jet"));

        Set<Personaje> winners = sorteo.premiados(2);

        System.out.println(winners);

    }
}
