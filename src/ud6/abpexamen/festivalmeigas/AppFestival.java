// Álvaro Barrientos Pazos
package ud6.abpexamen.festivalmeigas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppFestival {

    public static void main(String[] args) {
        System.out.println("\nFESTIVAL DE MEIGAS");
        System.out.println("==================\n");
        // Crea un array de meigas de exemplo
        Meiga[] meigasExemplo = Meiga.crearMeigasExemplo(Feitizo.crearFeitizosExemplo());

        // TODO: Ordena as Meigas de menor a maior número de feitizos
        List<Meiga> listMeiga = new ArrayList<>(List.of(meigasExemplo));
        listMeiga.sort((m1,m2)-> m2.getFeitizos().size() - m1.getFeitizos().size());

        Map<Meiga,Integer> ranking = new HashMap<Meiga,Integer>();

        // Para cada meiga do festival, imprime os seus datos, lanza os
        // feitizos posibles, e imprime os puntos obtidos.
        for (Meiga meiga : meigasExemplo) {
            System.out.println("MEIGA: ");
            System.out.println(meiga);
            int score = meiga.lanzarFeitizos();
            meiga.setScore(score);
            ranking.put(meiga,score);
            System.out.println("TOTAL PUNTOS: " + score + "\n\n");

            // TODO: Engade o código que necesites...

        }

        // Amosa a clasificación final do festival
        System.out.println("Clasificación Final do Festival: ");
        // TODO: Engade o código que necesites...
        listMeiga.sort(new Comparator<Meiga>() {

            public int compare(Meiga o1, Meiga o2) {
                return o2.getScore()-o1.getScore() == 0 ? o1.getAlcume().compareTo(o2.getAlcume()): o2.getScore()-o1.getScore();
            };
            
        });

        for (int i = 0; i < listMeiga.size(); i++) {
            Meiga m = listMeiga.get(i);
            System.out.printf("%d. %s (%s) [%d]\n",i+1,m.getNome(),m.getAlcume(),m.getScore());
        }

        System.out.println("\nFIN DO FESTIVAL DE MEIGAS\n");
    }

}
