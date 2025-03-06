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
        
    }

}
