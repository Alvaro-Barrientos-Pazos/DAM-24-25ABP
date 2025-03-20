package ud5.testing;

public class AppTesting {
    public static void main(String[] args) {
        Abuelo abu = new Abuelo();

        System.out.println(abu.aHijo);
        System.out.println(abu.aPadre);
        System.out.println(abu.pPadre);

        System.out.println(Padre.aPadre);
        System.out.println(Padre.pPadre);
        System.out.println(Abuelo.aAbuelo);

    }
}
