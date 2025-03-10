package rol;

public class App2Armas {

    public static void main(String[] args) {
        
        PersonajeEx arturo = new PersonajeEx("Arturo");

        arturo.addToInventario( new Item("Cota de Malla",10.0, 2000) );
        arturo.addToInventario( new Item("Espada larga", 3.0, 10000) );
        arturo.addToInventario( new Item("Espadón a dos manos",5.0,1000) );
        arturo.addToInventario( new Item("Pan",1.0,1) );
        arturo.addToInventario( new Item("Agua",2.0,1) );
        arturo.addToInventario( new Item("Daga",0.5,200) );
        arturo.addToInventario( new Item("Antorcha", 0.75,10) );
        
        arturo.mostrar();

    }

}
