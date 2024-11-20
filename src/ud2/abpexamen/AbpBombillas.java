/* Autor: Álvaro Barrientos Pazos
 * 
 * 
 * 
 */

// 0 es negativo

// error = "ERROR"

package ud2.abpexamen;

public class AbpBombillas {

    public static void main(String[] args) {
        System.out.println(causaFinBombilla(1000,200,10));
        System.out.println(causaFinBombilla(1000,100,1));
        System.out.println(causaFinBombilla(1000,100,10));
        System.out.println(causaFinBombilla(100,100,100));
        System.out.println(causaFinBombilla(1000,-10,10));
        System.out.println(causaFinBombilla(1000,10,0));

    }

    static String causaFinBombilla(double maxHours, double maxUses, double HoursPerUse){

        

        if ( HoursPerUse >10 || maxHours <=0 || maxUses <=0 || HoursPerUse <=0){
            return "Error";    
        }

        String msg = "MAL";

        double nUses = maxUses/HoursPerUse;


        /*
         * 200  : 10  : 20 
         * 
         * 1000 : 1 : 100 
         * 
         */

        if (nUses >= maxUses){
            msg = "ENCENDIDOS";
            if ( maxHours*nUses <= maxHours){
                msg = "ENCENDIDOS + HORAS";
            }
        }

        else if ( nUses*HoursPerUse < maxHours){
            msg = "HORAS";
        }
        

        return msg;


    }

}
