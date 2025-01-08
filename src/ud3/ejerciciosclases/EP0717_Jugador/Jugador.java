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

    public String getName() {
        return name;
    }

    public String getDni() {
        return dni;
    }

    public double getEstatura() {
        return estatura;
    }

    public POSICION getPosicion() {
        return posicion;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setPosicion(POSICION posicion) {
        this.posicion = posicion;
    }

    


}

