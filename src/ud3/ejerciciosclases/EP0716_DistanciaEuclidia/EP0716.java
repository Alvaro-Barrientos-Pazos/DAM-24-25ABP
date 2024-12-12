package ud3.ejerciciosclases.EP0716_DistanciaEuclidia;

public class EP0716 {
    public static void main(String[] args) {
        Punto p1 = new Punto(10,20.5);
        Punto p2 = new Punto(21.6,21.5);


        p1.desplazar(2, 3);
        p1.mostrar();

        p1.desplazarX(-2);
        p1.mostrar();
        p1.desplazarY(-3);
        p1.mostrar();

        System.out.println(p1.distanciaEuclidea(p2));



    }
}
