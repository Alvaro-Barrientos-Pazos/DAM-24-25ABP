package ud5.testing;

public class Familia {
    public static void main(String[] args) {
        Abuelo abu = new Abuelo();

        System.out.println(abu.aHijo);
        //System.out.println(abu.aPadre); // you can't see privated members of a subclass from outside that class
        System.out.println(abu.pPadre);   // you can see protected members of a subclass

        //System.out.println(Padre.aPadre); // you can't see privated members of a subclass from outside that class
        //System.out.println(Padre.pPadre);  // you can't use non static members of a class without an instance
        System.out.println(Abuelo.aAbuelo);

    }
}
