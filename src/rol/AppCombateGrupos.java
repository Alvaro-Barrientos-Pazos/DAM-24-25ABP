package rol;

public class AppCombateGrupos {

    static final byte TEAM_SIZE = 2;

    static Personaje[] allyTeam = new Personaje[TEAM_SIZE];
    static Personaje[] enemyTeam = new Personaje[TEAM_SIZE];
    static Personaje[] units = new Personaje[TEAM_SIZE * 2];

    public static void main(String[] args) {

        int acc = 0;

        for (int i = 0; i < TEAM_SIZE; i++) {
            allyTeam[i] = new Personaje(1);
            enemyTeam[i] = new Personaje(2);

            units[acc] = enemyTeam[i];
            acc++;
            units[acc] = allyTeam[i];
            acc++;
        }

        allyTeam = sortTeamMembersByAgility(allyTeam);
        units = sortTeamMembersByAgility(units);

        System.out.println("ALLY TEAM");
        for (Personaje ally : allyTeam) {
            System.out.printf("%s Agilidad: %d\n", ally.getName(), (int) ally.getAgilidad());
        }

        System.out.println("\nENEMY TEAM");
        for (Personaje ally : enemyTeam) {
            System.out.printf("%s Agilidad: %d\n", ally.getName(), (int) ally.getAgilidad());
        }

        System.out.println("\n\nComienza el combate: \n");
        boolean COMBATANTS_ALIVE = true;

        Personaje p1 = null;
        Personaje p2 = null;

        while (COMBATANTS_ALIVE) {

            for (int i = 0; i < units.length; i++) {

                if (units[i].estaVivo()) {

                    p1 = units[i];
                    p2 = findLowestHealthTarget(p1);
                    COMBATANTS_ALIVE = unitClash(p1, p2);

                    if (COMBATANTS_ALIVE == false) {
                        break;
                    }

                }
            }

        }

    }

    // Returns false if a team of units is defeated
    static boolean unitClash(Personaje attacker, Personaje defender) {

        int dmg_taken = attacker.atacar(defender);

        System.out.printf("\n\n%s ataca a %s\n", attacker.getName(), defender.getName());

        if (dmg_taken < 0) {
            System.out.printf("La defensa de %s supera por %d puntos el ataque de %s\n", defender.getName(),
                    dmg_taken * -1, attacker.getName());
        }

        else if (dmg_taken > 0) {

            System.out.printf("%s pierde %d puntos de vida\n", defender.getName(), dmg_taken);

            attacker.sumarExperiencia(dmg_taken);

            if (defender.perderVida(dmg_taken)) {
                System.out.printf("%s a perdido la vida\n", defender.getName());

                return isTeamAlive(defender.getTeam());

            } else {
                defender.sumarExperiencia(dmg_taken);
            }

        }

        else {
            System.out.printf("\nLa defensa de %s fue la justa para mitigar todo el daño del ataque de %s",
                    defender.getName(), attacker.getName());
        }

        System.out.printf("\n%s puntos de vida", defender);
        // attacker.mostrar();
        // defender.mostrar();

        return true;
    }

    static boolean isTeamAlive(int teamID) {
        for (int i = 0; i < units.length; i++) {
            if (units[i].getTeam() == teamID) {
                if (units[i].estaVivo()) {
                    return true;
                }
            }
        }

        System.out.printf("EL EQUIPO CON LA ID: %d HA SUCUMBIDO A SUS RIVALES\n", teamID);

        return false;
    }

    static Personaje findCurrActor() {

        for (int i = 0; i < units.length; i++) {
            if (units[i].estaVivo()) {
                return units[i];
            }
        }

        return null;

    }

    static Personaje findLowestHealthTarget(Personaje actor) {

        Personaje target = null;
        int minHealth = Integer.MAX_VALUE;

        for (int i = 0; i < units.length; i++) {

            if (units[i].getTeam() != actor.getTeam()) {

                if (units[i].estaVivo()) {

                    if (minHealth > units[i].getCurr_health()) {

                        minHealth = units[i].getCurr_health();
                        target = units[i];
                    }
                }
            }
        }

        return target;

    }

    static Personaje[] sortTeamMembersByAgility(Personaje[] team) {

        Personaje[] dupTeam = team.clone();
        Personaje temp;

        for (int i = 0; i < dupTeam.length - 1; i++) {
            for (int j = 0; j < dupTeam.length - 1 - i; j++) {
                if (dupTeam[j].getAgilidad() < dupTeam[j + 1].getAgilidad()) {
                    temp = dupTeam[j];
                    dupTeam[j] = dupTeam[j + 1];
                    dupTeam[j + 1] = temp;
                }
            }
        }

        return dupTeam;
    }

}
