package ud6.e1215;

import java.util.HashMap;

public class E1215 {
    public static void main(String[] args) {

        class Producto{
            Integer id;
            String name;

            Producto(Integer id, String name){
                this.id = id;
                this.name = name;
            }

            @Override
            public String toString() {
                return id+":"+name;
            }

        }


        HashMap<Producto,Integer> tmap = new HashMap<>();

        Producto p1 = new Producto(1,"Platano");
        Producto p2 = new Producto(2,"Pera");
        Producto p3 = new Producto(3,"Manzana");

        tmap.put(p1,2);
        tmap.put(p2,10);
        tmap.put(p3,8);


        System.out.println(tmap+"\n");

        tmap.put(p1, 20);
        tmap.remove(p2);

        System.out.println(tmap);

        


    }
}
