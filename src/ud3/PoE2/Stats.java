package ud3.PoE2;

public class Stats {
    
    int level;

    int health;
    int mana;

    int max_health;
    int max_mana;

    
    int strength;
    int dexterity;
    int inteligence;
    
    int crit_chance;

    int luck;

    double physical_damage;
    double spell_damage;
    double damage_multiplier;



    double luck_chance;
    double low_hp_threshold;
    double high_hp_threshold;



    
    int armour;

    int res_lightning;
    int res_fire;
    int res_cold;
    int res_chaos;

    int max_res_lightning;
    int max_res_fire;
    int max_res_cold;
    int max_res_chaos;


    public setHealth(int health){
        if (health > 0){
            this.health = health
        }
        else{
            return;
        }
        

    }
    

}
