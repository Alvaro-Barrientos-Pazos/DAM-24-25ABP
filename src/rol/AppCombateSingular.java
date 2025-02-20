package rol;

import java.util.Scanner;

public class AppCombateSingular {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Personaje p1 = new Personaje("Hans");
        Personaje p2 = new Personaje("Ivan");


        int dmg_taken;

        boolean COMBATANTS_ALIVE = true;

        while (COMBATANTS_ALIVE) {
            
            sc.nextLine();

            COMBATANTS_ALIVE = unitClash(p1, p2);

            if ( COMBATANTS_ALIVE ){
                COMBATANTS_ALIVE = unitClash(p2, p1);
            }
        }

    }



    static boolean unitClash(Personaje attacker, Personaje defender){


        int dmg_taken = attacker.atacar(defender);

        System.out.printf("%s ataca a %s por %d puntos de daño",attacker.getName(),defender.getName(),dmg_taken);

        if ( dmg_taken > 0 ){
            if (defender.perderVida(dmg_taken)){
                return false;
            }
            else{
                return false;
            }
            
        }
        else{
            
        }

        return false;
    }


}
