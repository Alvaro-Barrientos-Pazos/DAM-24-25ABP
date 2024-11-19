package contornos.proyectos;

import contornos.proyectos.Cartera;

public class Usuario {

    public static String nombre;
    public static Cartera cartera;
    public static String email;


    public static String cambiar_nombre(String nuevo_nombre){
        nombre = nuevo_nombre;
        return  nombre;
    }


}
