package ud6.e1237;

import java.util.HashMap;
import java.util.Map;

public class EP1237 {

    public static void main(String[] args) {
        Map<Integer,Jugador> plantilla = new HashMap<>();

        Jugador j1 =  new Jugador("12345678V", "Paco", Jugador.POSICION.CENTRAL, 165, 6);
        Jugador j2 =  new Jugador("22245558V", "Fernando", Jugador.POSICION.DEFENSE, 170, 10);


        Jugador.altaJugador(plantilla,12, j1);
        Jugador.altaJugador(plantilla,20, j2);

        System.out.println(plantilla);

        Jugador.eliminarJugador(plantilla, 20);

        System.out.println(plantilla);


        Jugador.mostrar(plantilla, Jugador.POSICION.CENTRAL);

        Jugador j3 =  new Jugador("11144558A", "Alvaro", Jugador.POSICION.GOALKEEPER, 178, 1);


        System.out.println("30: "+Jugador.editarJugador(plantilla, 30, j3));

        System.out.println(plantilla);

        System.out.println("20: "+Jugador.editarJugador(plantilla, 20, j3));

        System.out.println(plantilla);

    }

}
