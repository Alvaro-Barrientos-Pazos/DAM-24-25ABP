package rol;

import java.util.Arrays;

public class PersonajeEx extends Personaje {

    static enum EQUIPMENT_SLOT {
        L_HAND, R_HAND, HEAD, BODY 
    }

    int wallet = 0;
    Item[] inventory = new Item[0];

    Item itemManoIzq;
    Item itemManoDch;
    Armadura armaduraCabeza;
    Armadura armaduraCuerpo;

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

    
    public boolean equipItem(Item item, EQUIPMENT_SLOT slot ){

        if (item instanceof Armadura)
            return equipArmour((Armadura)item, slot);

        else if (item instanceof Arma);
            return equipWeapon((Arma)item, slot);
    }


    private boolean equipArmour(Armadura armour, EQUIPMENT_SLOT slot){
        
        switch (slot) {

            case L_HAND:
                if (armour.tipo == Armadura.TIPO_ARMADURA.ESCUDO)
                    unequipItem(armour, slot);
                    itemManoIzq = armour;
                    
                    return true;

            case R_HAND:
                if (armour.tipo == Armadura.TIPO_ARMADURA.ESCUDO)
                    unequipItem(armour, slot);    
                    itemManoDch = armour;
                    
                    return true;

            case HEAD:
                if (armour.tipo == Armadura.TIPO_ARMADURA.YELMO)
                    unequipItem(armour, slot);
                    armaduraCabeza = armour;
                    
                    return true;

            case BODY:
                if (armour.tipo == Armadura.TIPO_ARMADURA.ARMADURA)
                    unequipItem(armour, slot);    
                    armaduraCuerpo = armour;
                    
                    return true;
        
            default:
                return false;
        }
    }


    private boolean equipWeapon(Arma weapon, EQUIPMENT_SLOT slot){
        
        if (weapon.dosManos){

            if (itemManoIzq != null)
                unequipItem(weapon, EQUIPMENT_SLOT.L_HAND);

            if (itemManoDch != null)
                unequipItem(weapon, EQUIPMENT_SLOT.R_HAND);

            itemManoIzq = weapon;
            itemManoDch = weapon;

            return true;
        }

        else if (slot == EQUIPMENT_SLOT.L_HAND){
            unequipItem(weapon, slot);        
            itemManoIzq = weapon;
            
            return true;
        }

        else if (slot == EQUIPMENT_SLOT.L_HAND){
            unequipItem(weapon, slot);    
            itemManoDch = weapon;
            
            return true;
        }

        return false;
    }


    private void unequipItem(Item item, EQUIPMENT_SLOT slot){
        
        String msg = "Has desequipado el objecto %s [%s]";
        String suffix = "";

        if (addToInventario(item)){
            suffix = String.format("\n%s se ha guardado en el inventario de %s",item, name);
        }

        else{
            suffix = String.format("\n%s no puede cargar con el peso del objecto desequipado: %s, el objecto será desechado",name,item);
        }
        unequipMessage(msg+suffix, item, slot);
    }


    private void unequipMessage(String msg, Item item, EQUIPMENT_SLOT slot){
        
        switch (slot) {

            case L_HAND:
                msg = String.format(msg, item.getName(), "Mano Izq");
                break;

            case R_HAND:
                msg = String.format(msg, item.getName(), "Mano Dch");
                break;

            case HEAD:
                msg = String.format(msg, item.getName(), "Cabeza");
                break;
                
            case BODY:
                msg = String.format(msg, item.getName(), "Armadura");
                break;
        
            default:
                break;
        }

        System.out.println(msg);
    }


    @Override
    public void mostrar(){
        super.mostrar();

        Item item = null;

        System.out.println("\n1. Inventario de Personaje\n====================\nInventario de Arturo: ");

        for (int i = 0; i < inventory.length; i++) {
            item = inventory[i];
            System.out.printf("%d. %s (%.2fkg) (%dg)\n",i+1,item.getName(),item.getWeight(),item.getPrice());
        }

        System.out.printf("\nCarga total transportada: %.2f / %.2f kilos\n", currLoad,maxLoad, getMaxHealth() );

    }

}
