package ud6.e1210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class E1210 {

        public static void main(String[] args) {
            
            List<Integer> arr = new ArrayList<>();
            
            Random rng = new Random();
            for (int i = 0; i < 20; i++) {
                arr.add(rng.nextInt(10)+1);
            }

            System.out.println(arr);

            // Numeros sin repetir
            HashSet<Integer> hasSet = new HashSet<>();
            
            for (int i = 0; i < arr.size(); i++) {
                hasSet.add(arr.get(i));
            }

            // Números repetidos
            List<Integer> list = new ArrayList<>();
            
            for (int i = 0; i < arr.size(); i++) {
                if(i!= arr.lastIndexOf(arr.get(i)))
                    list.add(arr.get(i));
            }

            System.out.println(list);


            // Únicos
            System.out.println(hasSet);
            
            HashSet<Integer> hasSet2 = new HashSet<>();
            for (int i = 0; i < arr.size(); i++) {
                if (!hasSet2.add(arr.get(i))) {
                    hasSet2.remove(arr.get(i));
                }
                else if(i==0 && arr.lastIndexOf(arr.get(i)))
            }

            System.out.println(hasSet2);

        }

}
