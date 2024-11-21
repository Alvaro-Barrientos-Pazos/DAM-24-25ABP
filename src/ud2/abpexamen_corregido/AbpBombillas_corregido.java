/* Autor: Álvaro Barrientos Pazos */

package ud2.abpexamen_corregido;

public class AbpBombillas_corregido {

    public static void main(String[] args) {
        System.out.println(causaFinBombilla(1000,200,10));
        System.out.println(causaFinBombilla(1000,100,1));
        System.out.println(causaFinBombilla(1000,100,10));
        System.out.println(causaFinBombilla(100,100,100));
        System.out.println(causaFinBombilla(1000,-10,10));
        System.out.println(causaFinBombilla(1000,10,0));

    }

    static String causaFinBombilla(int maxHours, int maxUses, int HoursPerUse){

        String msg = "MAL";

        if ( HoursPerUse > 10 || maxHours <=0 || maxUses <=0 || HoursPerUse <=0 ){
            msg = "Error";    
        }
        else{
            
            int maxUsesTotalHours = maxUses*HoursPerUse;

            if (maxUsesTotalHours == maxHours){
                msg = "ENCENDIDOS + HORAS";
            }

            else if ( maxHours < maxUsesTotalHours ){
                msg = "HORAS";
            }
        
            else{
                msg = "ENCENDIDOS";
            }
        }
        
        return msg;


    }

}
