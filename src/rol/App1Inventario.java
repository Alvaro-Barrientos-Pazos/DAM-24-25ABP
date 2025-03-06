package rol;

public class App1Inventario {

    public static void main(String[] args) {
        PersonajeEx arturo = new PersonajeEx("Arturo");

        arturo.addItem( new Item("Cota de Malla",10.0, 2000) );
        arturo.addItem( new Item("Espada larga", 3.0, 10000) );
        arturo.addItem( new Item("Espadón a dos manos",5.0,1000) );
        arturo.addItem( new Item("Pan",1.0,1) );
        arturo.addItem( new Item("Agua",2.0,1) );
        arturo.addItem( new Item("Daga",0.5,200) );
        arturo.addItem( new Item("Antorcha", 0.75,10) );
        
        System.out.println(arturo);



    }

}
