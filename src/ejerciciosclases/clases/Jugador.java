package ejerciciosclases.clases;

import java.time.LocalDateTime;

public class Jugador {

    public static enum POSICION {
        PORTERO,
        DEFENSA,
        CENTROCAMPISTA,
        DELANTERO
    }

    private String dni;
    private String nombre;
    private double estatura;
    private POSICION posicion;

    private LocalDateTime createdAt;
    private LocalDateTime lastLogin;

    public Jugador(String nombre) {
        this.nombre = nombre;
        createdAt = LocalDateTime.now();
        lastLogin = createdAt;

    }

    public void Login() {
        lastLogin = LocalDateTime.now();
    }

    public Jugador(String nombre, POSICION posicion) {
        this(nombre);
        this.posicion = posicion;
    }

    public Jugador(String nombre, POSICION posicion, double estatura, String dni) {
        this(nombre, posicion);
        this.estatura = estatura;
        this.dni = dni;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getDni() {
        return dni;
    }

    public double getEstatura() {
        return estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public POSICION getPosicion() {
        return posicion;
    }

    public String toString() {
        return "nombre: " + nombre + "\ndni: " + dni + "\nposicion: " + posicion + "\nestatura: " + estatura + "\ncreatedAt: " + createdAt + "\nlastLogin: " + lastLogin;
    }

    public void cambiarPosicion(POSICION posicion) {
        this.posicion = posicion;
    }

}
