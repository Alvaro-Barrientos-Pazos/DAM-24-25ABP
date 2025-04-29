package ud6.colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Colecciones {
    public static void main(String[] args) {
        
        String[] arr = {"apple", "banana", "avocado"};

        Collection<String> listCollection = new ArrayList<>();
        List<String> listArr    = new ArrayList<>();
        List<String> list       = new ArrayList<>(List.of("apple", "banana", "avocado"));
        List<String> listPArr   = new ArrayList<>(List.of(arr));

        System.out.println("Okey");

        listArr.add("A");
        listArr.add("B");
        listArr.add("C");

        listArr.addFirst("Z");

        listArr.add(2, null); // inserts
        listArr.set(3, null); // remplaces

        System.out.println(listArr);

        List<String> listArr2 = new ArrayList<>(listArr);
        listArr.removeIf(x -> x == null || x.equals("B"));

        System.out.println(listArr2.get(1));

        

        //System.out.println(listArr);

        


    }
}
