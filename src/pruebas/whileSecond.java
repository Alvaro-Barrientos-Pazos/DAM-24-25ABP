package pruebas;

import java.time.LocalTime;

public class whileSecond {

    public static void main(String[] args) {
        LocalTime tiempoInicio = LocalTime.now();

        LocalTime time_s = LocalTime.now();
        System.out.println(time_s);

        int timer_start = LocalTime.now().toSecondOfDay();
        int timer_end = 0;
        int i = 0;

        while (timer_end - timer_start != 60) {
        
            timer_end = LocalTime.now().toSecondOfDay();
            
            if ((timer_end-timer_start)==1){
                timer_start = timer_end;
                i++;
                System.out.println(i);
            }
        }
    }

}
