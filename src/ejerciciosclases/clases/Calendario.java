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
        return date.getMonth();
    }

    int getAño(){
        return año;
    }

    void incrementarDia(){

    }

    void incrementarMes(){

    }

    void incrementarAño(int cantidad){
        if (año + cantidad<= 0){
            return;
        }

        año += cantidad;
    }

    void mostrar(){

    }

    boolean iguales(Calendario otraFecha){
        if (otraFecha.dia != dia)
            return false;
        if (otraFecha.mes != mes)
            return false;
        if (otraFecha.año != año)
            return false;
        
        return true;
    }



}
