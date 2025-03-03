package rol;

import java.util.Scanner;

public class AppCombateSingular {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        

        Personaje p1 = new Personaje();
        Personaje p2 = new Personaje();

        p1.mostrar();
        p2.mostrar();

        System.out.println("\n\nComienza el combate: \n");
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

        System.out.printf("\n\n%s ataca a %s",attacker.getName(), defender.getName());


        if ( dmg_taken < 0 ){
            System.out.printf("\nLa defensa de %s supera por %d puntos el ataque de %s",defender.getName(), dmg_taken*-1, attacker.getName());
        }

        else if ( dmg_taken > 0 ){

            System.out.printf("\n%s pierde %d puntos de vida",defender.getName(), dmg_taken);

            attacker.sumarExperiencia(dmg_taken);

            if (defender.perderVida(dmg_taken)){
                System.out.printf("\n%s a perdido la vida", defender.getName());
                return false;
            }
            else{
                defender.sumarExperiencia(dmg_taken);
            }
            
            
        }

        else{
            System.out.printf("\nLa defensa de %s fue la justa para mitigar todo el daño del ataque de %s", defender.getName(), attacker.getName());
        }

        System.out.printf("\n%s puntos de vida", defender);
        //attacker.mostrar();
        //defender.mostrar();

        return true;
    }


}
