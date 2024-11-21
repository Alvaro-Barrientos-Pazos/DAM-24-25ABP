/* Autor: Álvaro Barrientos Pazos */

package ud2.abpexamen_corregido;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class AbpBombillas_corregido {
    
    @Test
    
    public void causaFinBombillaTest() {
        assertEquals("ERROR", causaFinBombilla(100, 100, 100));
        assertEquals("ERROR", causaFinBombilla(1000, -10, 10));
        assertEquals("ERROR", causaFinBombilla(0, 10, 10));
        assertEquals("ERROR", causaFinBombilla(1000, 10, 0));
        assertEquals("ENCENDIDOS", causaFinBombilla(500, 400, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 10000, 1));
        assertEquals("HORAS", causaFinBombilla(1000, 200, 10));
        assertEquals("HORAS", causaFinBombilla(2000, 700, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(2000, 600, 3));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 1));
        assertEquals("ENCENDIDOS", causaFinBombilla(1000, 100, 9));
        assertEquals("ENCENDIDOS + HORAS", causaFinBombilla(1000, 100, 10));
    }

    
    static String causaFinBombilla(int maxHours, int maxUses, int HoursPerUse){

        String msg = "ERROR";

        if ( HoursPerUse >10 || maxHours <=0 || maxUses <=0 || HoursPerUse <=0){
            msg =  "ERROR";    
        }
        else{

            int totalUseHours = HoursPerUse * maxUses;

            if ( maxHours > totalUseHours ){
                msg = "ENCENDIDOS";
            }
            else if ( maxHours < totalUseHours ){
                msg = "HORAS";
            }
            else{
                msg = "ENCENDIDOS + HORAS";
            }
        }

        return msg;

    }

}
