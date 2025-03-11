package ud5.e0801;

public class E0803 {
    public static void main(String[] args) {

        HoraExacta horaExacta = new HoraExacta(1, 0, 0);

        HoraExacta horaExacta2 = new HoraExacta(1,0,0);

        System.out.println(horaExacta.esHoraExacta(horaExacta2));

        horaExacta2.inc();
        
        System.out.println(horaExacta.esHoraExacta(horaExacta2));

    }
}
