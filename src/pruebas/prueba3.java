package pruebas;

public class prueba3 {

    
    public static void main(String[] args) {

        int total = 0;
        
        for (int i = 1; i < 5; i++) {
            total = 10;
        }

        for (total = 1; total <= 5; total++) {
            System.out.println("a");
        }

        System.out.println(total);

        for (int i = 10; i < 5; i--) {
            System.out.println(i);
        }

        // Queremos un rango de (5:10)
        // random() = 0 : 0.999...
        // (int)Math.random() * (MAX - MIN + 1) + MIN;

        int rand = (int)Math.random() * ( 10 - 5 + 1 ) + 5;

    }

}
