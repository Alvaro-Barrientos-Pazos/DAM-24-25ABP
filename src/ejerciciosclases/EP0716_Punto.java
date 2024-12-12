import java.security.PublicKey;

import clases.Punto;

public class EP0716_Punto {
    public static void main(String[] args) {
        Punto p1 = new Punto(10.2,25);
        Punto p2 = new Punto(31.2,50);

        p1.desplazaX(1);
        System.out.println(p1.x);
        p2.desplazaY(2);
        System.out.println(p2.y);

        p1.desplaza(-1, 1);
        System.out.println(p1.x);

        System.out.println(p1.distanciaEuclidea(p2));

        p1.muestra();
        p2.muestra();

    }
}
