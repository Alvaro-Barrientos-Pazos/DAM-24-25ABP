/* Autor: Álvaro Barrientos Pazos
 * 
 * 
 * 
 */

// 0 es negativo

// error = "ERROR"

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

    static String causaFinBombilla(double maxHours, double maxUses, double HoursPerUse){

        String msg = "Error";

        if ( HoursPerUse >10 || maxHours <=0 || maxUses <=0 || HoursPerUse <=0){
            msg =  "Error";    
        }
        else{
            if ( maxHours > HoursPerUse * maxUses){
                msg = "ENCENDIDOS";

            }
            else if ( maxHours < HoursPerUse * maxUses ){
                msg = "HORAS";
            }
            else{
                msg = "ENCENDIDOS + HORAS";
            }
        }

        return msg;


    }

}
