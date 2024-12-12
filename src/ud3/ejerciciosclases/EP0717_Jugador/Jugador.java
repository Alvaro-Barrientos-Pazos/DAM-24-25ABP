package ud3.ejerciciosclases.EP0717_Jugador;


public class Jugador {


    enum POSICION {
        PORTERO,
        DEFENSA,
        CENTROCAMPISTAS,
        DELANTERO
    }


    String name,dni;
    double estatura;
    POSICION posicion;

    public Jugador(){

    }

}
