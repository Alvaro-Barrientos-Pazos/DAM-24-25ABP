package ud5.E0801;

public class Hora {

    byte hora = 0;
    byte minuto = 0;
    
    Hora(int hora){
        this.hora = (byte)hora;
    }


    Hora(int hora, int minuto){
        this(hora);
        this.minuto = (byte)minuto;
    }


    void inc(){
        this.minuto++;

        if (minuto >= 60) {
            minuto = 0;
            hora++;

            if (hora >= 23) {
                hora = 0;
            }
        }
    }


    boolean setMinuto(int minuto){

        if (minuto >= 60 || minuto < 0) {
            return false;
        }
        else{
            this.minuto = (byte)minuto;
            return true;
        }

    }


    boolean setHora(int hora){
        if (hora >= 23 || hora < 0) {
            return false;
        }
        else{
            this.hora = (byte)hora;
            return true;
        }

    }

    public String toString(){
        return String.format("%02d:%02d",hora,minuto);
    }


}
