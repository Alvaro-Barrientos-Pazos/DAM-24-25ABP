// Álvaro Barrientos Pazos

package ud6.abpexamen.genericos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class UtilGenerico {
    public static void main(String[] args) throws Exception {
        List<Integer> list = List.of(1,2,3,4,4,3,5,1);
        System.out.println(repetidos(list));
    }


    public static <T> List<T> repetidos(List<T> list){
        List<T> tmp = new ArrayList<>(list);
        List<T> results = new ArrayList<>();

        T obj = null;

        System.out.println("list: "+list.size());
        for (int i = 0; i < list.size(); i++) {
            obj = list.get(i);
            tmp.remove(obj);

            if (tmp.contains(obj)){
                results.add(obj);
            }
            else if (results.contains(obj)){
                results.add(obj);
            }
        }

        return results;
    }

    public static <T> Collection<T> filtrarMayores(Collection<T> coll, T t, Comparator<T> c){
        Collection<T> result = new ArrayList<>();

        for (T obj : coll) {
            if (c.compare(obj, t) >= 0){
                result.add(obj);
            }
        }

        return result;
    }

}
