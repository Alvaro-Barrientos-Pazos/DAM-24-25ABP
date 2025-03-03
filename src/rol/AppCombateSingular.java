package rol;

import java.util.Scanner;

public class AppCombateSingular {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        

        Personaje p1 = new Personaje();
        Personaje p2 = new Personaje();

        boolean COMBATANTS_ALIVE = true;

        while (COMBATANTS_ALIVE) {

            COMBATANTS_ALIVE = unitClash(p1, p2);

            if ( COMBATANTS_ALIVE ){
                COMBATANTS_ALIVE = unitClash(p2, p1);
            }
        }

    }



    // Returns false if the defender unit has died
    static boolean unitClash(Personaje attacker, Personaje defender){


        int dmg_taken = attacker.atacar(defender);

        System.out.printf("%s ataca a %s por %d puntos de daño",attacker.getName(),defender.getName(),dmg_taken);

        sc.nextLine();

        if ( dmg_taken > 0 ){

            if (defender.perderVida(dmg_taken)){
                System.out.printf("%s a perdido la vida", defender.getName());
                return false;
            }
            else{
                System.out.printf("%s tiene (%d/%d) puntos de vida", defender.getName(), defender.getCurr_health(), defender.getMax_health());
                return false;
            }
            
        }
        else{
            
        }

        return false;
    }


}
