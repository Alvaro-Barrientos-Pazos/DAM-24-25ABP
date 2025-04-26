package ud6.festivalmeigas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Meiga {
    // Atributos
    private String name;
    private String household;
    private Collection<Feitizo> spells;
    private Map<String,Integer> inventory;
    

    // Constructores
    public Meiga(String name, String household, Collection<Feitizo> spells, Map<String, Integer> inventory) {
        this.name = name;
        this.household = household;
        this.spells = spells;
        this.inventory = inventory;
    }

    // Métodos
    public static void main(String[] args) {
        Meiga[] arrMeigas = crearMeigasExemplo(Feitizo.crearFeitizosExemplo());
        
        for (Meiga meiga : arrMeigas) {
            for (Feitizo f : Feitizo.crearFeitizosExemplo()) {
                meiga.lanzarFeitizo(f);
            }            
        }

        
        System.out.println("Fin");
    }


    private Boolean lanzarFeitizo(Feitizo spell){

        Map<String,Integer> tmpInv = new HashMap<>(inventory);
        
        for (String ingredient : spell.ingredientes) {
            if (!inventory.containsKey(ingredient))
                return false;    

            if (tmpInv.get(ingredient) == 1){
                tmpInv.remove(ingredient);
            }
            else{
                tmpInv.put(ingredient,tmpInv.get(ingredient)-1);
            }
            
        }

        inventory = tmpInv;
        System.out.println(name+" lanzo hechizo: "+spell);

        return true;
    }


    public static Meiga[] crearMeigasExemplo(Feitizo[] feitizosDisponibles) {
        Random rnd = new Random();

        String[] nomes = { "Uxía", "Lúa", "Iria", "Noa" };
        String[] alcumes = { "A das Fraguiñas", "Sombra do Vento", "Luz do Bosque", "Meiga da Brétema" };

        Meiga[] meigas = new Meiga[nomes.length];

        // Obtén todos os feitozos de exemplo e todos os seus ingredientes únicos
        Collection<Feitizo> feitizosExemplo = List.of(Feitizo.crearFeitizosExemplo());
        Collection<String> ingredientesExemplo = Feitizo.ingredientesUnicos(feitizosExemplo);

        for (int i = 0; i < nomes.length; i++) {
            String nome = nomes[i];
            String alcume = alcumes[i];
            // Xera unha colección cunha selección aleatoria de feitizos de exemplo para
            // asignar á meiga
            Collection<Feitizo> feitizos = getFeitizosRnd(feitizosExemplo);

            System.out.println("\nSpells: "+feitizos);
            // Xera un mapa cunha selección aleatoria de ingredientes e cantidades de cada
            // un de exemplo para asignar á meiga
            Map<String, Integer> inventario = getIngredientesRnd(ingredientesExemplo, 3);

            System.out.println("Inventory: "+inventario);

            // Crea a meiga e a engade ao array
            meigas[i] = new Meiga(nome, alcume, feitizos, inventario);
        }

        return meigas;

    }

    private static Collection<Feitizo> getFeitizosRnd(Collection<Feitizo> collSpells) {
        List<Feitizo> list = new ArrayList<>(collSpells);
        Collections.shuffle(list);
        
        for (int i = 0; i < Math.random()*collSpells.size(); i++) {
            list.removeLast();
        }

        return list;
    }
    
    private static Map<String, Integer> getIngredientesRnd(Collection<String> collIngredients, int max) {
        Map<String, Integer> map = new HashMap<>();
        
        Random rng = new Random();

        for (String strIngredient : collIngredients) {
            map.put(strIngredient, Integer.valueOf(rng.nextInt(max-1)+1));
        }

        return map;
    }

    



}
