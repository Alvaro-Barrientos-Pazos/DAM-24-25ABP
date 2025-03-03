package ud5.E0801;

public class E0802 {
    public static void main(String[] args) {
        
        HoraExacta horaExacta = new HoraExacta(0, 59, 58);

        System.out.println(horaExacta);

        horaExacta.inc();

        System.out.println(horaExacta);

        horaExacta.inc();

        System.out.println(horaExacta);

    }
}
