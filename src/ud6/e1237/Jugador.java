package ud6.e1237;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Jugador {

    public static enum POSICION {
        GOALKEEPER,
        CENTRAL,
        DEFENSE,
        STRIKER
    }

    
    private String dni;
    private String name;
    private POSICION position;
    private int height;
    private int posNum;


    public Jugador(String dni, String name, POSICION position, int height, int posNum) {
        this.dni = dni;
        this.name = name;
        this.position = position;
        this.height = height;
        this.posNum = posNum;
    }



    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador){
        plantilla.put(dorsal, jugador);
    }

    
    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal){
        return plantilla.remove(dorsal);
    }


    static boolean editarJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador){
        //return plantilla.merge(dorsal, jugador,(old,newj)->newj ) !=null;  // doesn't return false
        return plantilla.computeIfPresent(dorsal, (old,newj)->newj) != null;
        
        /*
        if (plantilla.containsKey(dorsal)){
            plantilla.put(dorsal, jugador);
            return true;
        }

        return false;
        */
    }

    static void mostrar (Map<Integer, Jugador> plantilla){
        for (Integer d : plantilla.keySet()) {
            System.out.printf("%d - %s\n",d,plantilla.get(d).name);
        }
    }

    static void mostrar (Map<Integer, Jugador> plantilla, POSICION posicion){
        for (Integer d : plantilla.keySet()) {
            if (posicion == plantilla.get(d).position)
                System.out.printf("%d - %s\n",d,plantilla.get(d).name);
        }
    }

    


    @Override
    public String toString() {
        return String.format("dni: %s nombre: %s pos: %s %d %d",dni,name,position,height,posNum);
    }

    

    public String getDni() {
        return dni;
    }



    public String getName() {
        return name;
    }



    public POSICION getPosition() {
        return position;
    }



    public int getHeight() {
        return height;
    }



    public int getPosNum() {
        return posNum;
    }

}
