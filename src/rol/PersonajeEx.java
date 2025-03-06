package rol;

import java.util.Arrays;

public class PersonajeEx extends Personaje {

    int wallet = 0;
    Item[] inventory = new Item[0];

    PersonajeEx(){
        super();
    }


    public PersonajeEx(String name){
        super(name, RAZA.HUMANO);
    }


    public boolean addToInventario(Item item){
        if (item == null){
            return false;
        }
        else if( getCurrLoad() + item.getWeight() > getMaxLoad()  ){
            return false;
        }

        inventory = Arrays.copyOf(inventory, inventory.length+1);
        inventory[inventory.length-1] = item;
        setCurrLoad( getCurrLoad() + item.getWeight() );
        return true;
    }


    @Override
    public void mostrar(){

        super.mostrar();

        Item item = null;
        int weight = 0;

        System.out.println("\n1. Inventario de Personaje\n====================\nInventario de Arturo: ");

        for (int i = 0; i < inventory.length; i++) {
            item = inventory[i];
            weight+=item.getWeight();

            System.out.printf("%d. %s (%.2fkg) (%dg)\n",i+1,item.getName(),item.getWeight(),item.getPrice());
        }

        System.out.printf("Carga total transportada: %.2f/%.2f kilos\n", weight, getMaxHealth() );

    }

}
