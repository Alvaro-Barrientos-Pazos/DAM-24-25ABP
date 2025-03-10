package rol;

public class Armadura extends Item{
    
    public static enum TIPO_ARMADURA {
        YELMO, ARMADURA, ESCUDO
    }

    int defensa;
    TIPO_ARMADURA tipo;


    Armadura(String name, double weight, int price, int defensa, TIPO_ARMADURA tipo){
        super(name,weight,price);

        this.defensa = defensa;
        this.tipo = tipo; 
    }

    


}
