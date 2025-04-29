package ud6.e1210;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class E1210 {

        public static void main(String[] args) {
            
            List<Integer> list = new ArrayList<>();
            
            Random rng = new Random();
            for (int i = 0; i < 20; i++) {
                list.add(rng.nextInt(10)+1);
            }


            System.out.println("Lista Original");
            System.out.println(list);

            HashSet<Integer> hasSet = new HashSet<>();
            HashSet<Integer> h1 = new HashSet<>();

            list.add(11);

            
            Integer v = null;
            for (int i = 0; i < list.size(); i++) {
                v = list.get(i);

                if (hasSet.add(v)){
                    if ( i==0){
                        if (list.lastIndexOf(v) == 0){
                            h1.add(v);
                        }
                    }  
                    else{
                        h1.add(v);
                    }
                    
                }
            }

            System.out.println("\nSin Repetir");
            System.out.println(hasSet);

            System.out.println("\nRepetidos");
            System.out.println(h1);

            //System.out.println("\nUnicos");
            //System.out.println(hasSet);

        }

}
