package ud3.ejercicioBanco.classes;

public class Gestor {

    public String nombre;
    public final int telefono;
    int importeMaximo = 10000;

    public Gestor(String nombre, int telefono, int importeMaximo){        
        this.nombre = nombre;
        this.telefono = telefono;

        if (importeMaximo < 0){
            this.importeMaximo = 0;    
        }
        else {
            this.importeMaximo = importeMaximo;
        }
        
    }

    public void getData(){
        System.out.println("nombre: " + nombre);
        System.out.println("telefono: " + telefono);
        System.out.println("importeMaximo: " + importeMaximo);
    }

}