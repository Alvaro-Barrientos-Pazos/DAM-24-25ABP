package ud3.ejerciciosclases.EP0716_DistanciaEuclidia;

import java.lang.Math;

public class Punto {

    private double x,y;


    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void desplazarX(double x){
        this.x+= x;
    }

    public void desplazarY(double y){
        this.y+= y;
    }

    public void desplazar(double x, double y){
        this.x+= x;
        this.y+= y;
    }

    public void mostrar(){
        System.out.println("("+x+", "+y+")");
    }

    public String toString(){
        return "("+x+", "+y+")";
    }

    public double distanciaEuclidea(Punto otro){
        return Math.sqrt(Math.pow(x-otro.x,2)+Math.pow(y-otro.y,2));
    }

}
