package pruebas;


// Que print se ejecutara antes?

// Que imprime cada uno de los prints?


public class prueba1 {

    static int a = 20;  // Global

    static int resta_A(int a){
        a -= 5; // a = a - 5
        System.out.println("A#:" + a); // a = 
        return a;
    }

    
    public static void main( String[] args ) {
        int a = 5; // Local
        System.out.println( resta_A(a) );
        System.out.println("A#:" + a); // a =
    }

}
