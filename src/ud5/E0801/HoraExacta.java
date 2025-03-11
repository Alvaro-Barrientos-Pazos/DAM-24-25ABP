package ud5.e0801;

public class HoraExacta extends Hora{

    byte segundo = 0;

    public HoraExacta(int hora, int minuto, int segundo){
        super(hora,minuto);
        this.segundo = (byte)segundo;
    }

    boolean setSegundo(int segundo){
        if (segundo >= 60 || segundo < 0) {
           return false; 
        }
        
        this.segundo = (byte)segundo;
        return true;
    }


    @Override
    void inc() {
        segundo++;

        if (segundo >= 60) {
            segundo = 0;
            super.inc();    
        }
    }

    boolean esHoraExacta(HoraExacta horaEx){
        if (this.hora == horaEx.hora) 
            if (this.minuto == horaEx.minuto) 
                if (this.segundo == horaEx.segundo)
                    return true;
        
        return false;
    }


    @Override
    public String toString() {
        return String.format("%s:%02d",super.toString(),segundo);
    }


}
