import clases.Jugador;

public class EP0717 {
    public static void main(String[] args) {
        
        Jugador j1 = new Jugador("ramón");
        Jugador j2 = new Jugador("olmo",Jugador.POSICION.CENTROCAMPISTA);
        Jugador j3 = new Jugador("pablo",Jugador.POSICION.DELANTERO,1.7,"7724521A");
        
        j1.cambiarPosicion(Jugador.POSICION.DEFENSA);

        System.out.println(j1);
        
    }
}