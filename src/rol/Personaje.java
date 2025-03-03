package rol;

import java.util.Random;

public class Personaje {

    enum RAZA { HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL }

    String name;
    RAZA raza;
    
    int fuerza;
    int agilidad;
    int constitucion;

    int nivel;
    int experiencia;

    final int BASE_HEALTH = 50;

    int max_health;
    int curr_health;


    Personaje(){

    }

    public Personaje(String name){
        this(name, RAZA.HUMANO);
    }


    public Personaje(String name, RAZA raza){
        this.name = name;
        this.raza = raza;

        int fuerza       = (int)Math.random()*100+1;
        int agilidad     = (int)Math.random()*100+1;
        int constitucion = (int)Math.random()*100+1;

        setAttributes(fuerza, agilidad, constitucion, 1, 0);

    }


    public Personaje(String name, RAZA raza, int fuerza, int agilidad, int constitucion){
        this.name = name;
        this.raza = raza;

        setAttributes(fuerza, agilidad, constitucion, 1, 0);
    }


    public Personaje(String name, RAZA raza, int fuerza, int agilidad, int constitucion, int nivel, int experiencia){
        this.name = name;
        this.raza = raza;

        setAttributes(fuerza, agilidad, constitucion, nivel, experiencia);
    }


    public void setAttributes(int fuerza, int agilidad, int constitucion, int nivel, int experiencia){
        try {
            setFuerza(fuerza);
            setAgilidad(agilidad);
            setContitucion(constitucion);
            setNivel(nivel);
            setExperiencia(experiencia);
            setCurr_health(max_health);    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void setFuerza(int fuerza) {
        if (fuerza < 1) {
            throw new IllegalArgumentException("No se puede asociar el valor 0 al atributo fuerza");
        }
        else{
            this.fuerza = fuerza;
        }
    }
    public void setAgilidad(int agilidad) {
        if (agilidad < 1) {
            throw new IllegalArgumentException("No se puede asociar un valor menor a 1 al atributo agilidad");
        }
        else{
            this.agilidad = agilidad;
        }
    }
    public void setContitucion(int constitucion) {
        if (constitucion < 1){
            throw new IllegalArgumentException("No se puede asociar un valor menor a 1 al atributo constitucion");
        }
        else{
            this.constitucion = constitucion;
        }
        
        setMax_health(constitucion);
    }

    public void setNivel(int nivel) {
        if (nivel < 1){
            throw new IllegalArgumentException("No se puede asociar un valor menor a 1 al atributo nivel");
        }
        else{
            this.nivel = nivel;            
        }
    }

    public void setExperiencia(int experiencia) {
        if (experiencia < 0) {
            throw new IllegalArgumentException("No se puede asociar un valor menor a 0 al atributo experiencia");
        }
        else{
            this.experiencia = experiencia;    
        }
    }

    public void setMax_health(int constitucion) {
        this.max_health = BASE_HEALTH + constitucion;
    }

    public void setCurr_health(int curr_health) {
        this.curr_health = curr_health;
    }


    void mostrar(){
        System.out.printf("PERSONAJE:\nNombre: %s\nRaza: %s\nFuerza: %d\nAgilidad: %d\nConstitución: %d\nNivel: %d\nExperiencia: %d\nVida Máxima: %d\nVida Actual: %d",
        name,raza.toString(),fuerza,agilidad,constitucion,nivel,experiencia,max_health,curr_health);
    }
    
    public String toString(){
        return String.format("%s(%d/%d)",name,curr_health,max_health);
    }

}
