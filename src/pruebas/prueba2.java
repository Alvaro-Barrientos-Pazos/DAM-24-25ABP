package pruebas;

public class prueba2 {

    static int a = 0;

    public static void main(String[] args) {

        int total = 5;

        switch (a) {
            case 0:
                total = 10;
                a = 1;
                break;
            
            case 1:
                System.out.println("Hola");
        
            default:
                total = 20;
                break;
        }


        total = switch (a){
            case 0 -> 0;        
            default -> 5;    
        };


        total = switch (total){
            case 0 -> {
                System.out.println("Hola");
                System.out.println("1");
                System.out.println("2");
                yield -1;
            }

            case 1 -> {
                yield -5;
            }
            default -> {
                a = 2;
                System.out.println(total);
                yield -20;
            }
        };


        switch (a) {
            case 0 -> System.out.print("hola");
            case 1 -> System.out.print("adios");
            case 2 -> System.out.print("hasta mañana");
            default -> System.out.print("asd");
        }


        System.out.println(total);

    }

}
