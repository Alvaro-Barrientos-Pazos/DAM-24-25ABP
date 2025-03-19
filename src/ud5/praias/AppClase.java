package ud5.praias;

import java.util.Comparator;

public class AppClase implements Comparator{

    public static void main(String[] args) {
        //Praia[] praias = Util.importarPraias("praias.json");
        Praia[] praias = {
            new Praia("Mogor", "Concello 1", "Provincia 1", 42.3),
            new Praia("Lanzada", "Concello 2", "Provincia 2", 43.0),
            new Praia("APAMÁN", "Concello 3", "Provincia 3", 47.2),
            new Praia("Muiños", "Concello 3", "Provincia 3", 41.8)
            
        };
 
        //Praia[] praiasSorted = Praia.sortLatitudNorteSur(praias);
        Praia[] praiasSorted = Praia.sortProvinciaConcelloNome(praias);

        for (Praia praia : praiasSorted) {
            System.out.println(praia);
        }

    }

    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        return 0;
    }

}
