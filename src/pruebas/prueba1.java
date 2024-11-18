package pruebas;


// Que print se ejecutara antes?

// Que imprime cada uno de los prints?

// Que imprime cada uno de los prints si añadimos el argumento a a la funcion resta_A()?


public class prueba1 {

    static int a = 20;

    static int resta_A(){
        a -= 5;
        System.out.println("A#:" + a);
        return a;
    }


    public static void main( String[] args ) {
        int a = 5;
        resta_A()
        System.out.println("A#:" + a);
    }

}
