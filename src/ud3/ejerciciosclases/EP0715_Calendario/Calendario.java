package ud3.ejerciciosclases.EP0715_Calendario;

import java.time.LocalDate;

import java.time.DateTimeException;

public class Calendario {

    private LocalDate date;

    public Calendario(int año, int mes, int dia){
        try {
            date = LocalDate.of(año, mes, dia);
        }
        catch(DateTimeException e){
            System.out.println("uno de los datos introducidos es invalido");
        }
        
    }

    public LocalDate getDate(){
        return date;
    }

    public void mostrar(){
        System.out.println((date.getDayOfMonth() +" de "+ date.getMonth() +" del año "+ date.getYear()).toLowerCase());
    }

    public void incrementarDia(){
        date = date.plusDays(1);
    }

    public void incrementarMes(){
        date = date.plusMonths(1);
    }

    public void incrementarAño(int cantidad){
        date = date.plusYears(cantidad);
    }


}
