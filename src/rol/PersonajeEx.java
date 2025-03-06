package rol;

import java.util.Arrays;

public class PersonajeEx extends Personaje {

    int wallet = 0;
    Item[] inventory;

    PersonajeEx(){
        super();
    }


    public PersonajeEx(String name){
        super(name, RAZA.HUMANO);
    }


    public void addItem(Item item){
        inventory = Arrays.copyOf(inventory, inventory.length+1);
        inventory[inventory.length-1] = item;
    }

    @Override
    public void mostrar(){

        super.mostrar();

        Item item = null;

        System.out.println("INVENTARIO");

        for (int i = 0; i < inventory.length; i++) {
            item = inventory[i];

            System.out.printf("%s (%.2fkg) (%dg)\n",item.getName(),item.getWeight(),item.getPrice());
        }
    }

}
