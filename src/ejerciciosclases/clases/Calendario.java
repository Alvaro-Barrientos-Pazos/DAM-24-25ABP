package clases;

import java.time.LocalDate;

public class Calendario {

    private LocalDate date;

    Calendario(int año, int mes, int dia){
        date = LocalDate.of(año,mes,dia);
    }

    int getDia(){
        return date.getDayOfMonth();
    }
    
    int getMes(){
        return date.getMonthValue();
    }

    int getAño(){
        return date.getYear();
    }

    void incrementarDia(){
        date.plusDays(1);
    }

    void incrementarMes(){
        date.plusMonths(1);
    }

    void incrementarAño(int cantidad){
        date.plusYears(1);
    }

    void mostrar(){
        System.out.println(date);
    }

    boolean iguales(Calendario otraFecha){
        return otraFecha.equals(date);
    }



}
