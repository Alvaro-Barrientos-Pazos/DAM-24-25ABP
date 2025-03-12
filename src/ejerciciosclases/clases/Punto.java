package ejerciciosclases.clases;

import java.lang.Math;

public class Punto {
    public double x,y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void desplazaX(double dx){
        x+=dx;
    }

    public void desplazaY(double dy){
        y+=dy;
    }

    public void desplaza(double dx, double dy){
        y+=dy;
        x+=dx;
    }

    public double distanciaEuclidea(Punto otro){
        return Math.sqrt( Math.pow(otro.x - x,2) + Math.pow(otro.y - y,2));
    }

    public void muestra(){
        System.out.printf("(%f, %f)\n",x,y);
    }


}
