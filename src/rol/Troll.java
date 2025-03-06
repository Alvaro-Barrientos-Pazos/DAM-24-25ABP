package rol;

public class Troll extends Monstruo{


    public Troll(){
        ataque    = (Math.random()*121-60)+60;
        defensa   = (Math.random()*71-50)+50;
        velocidad = (Math.random()*41-20)+20;
        maxHealth = (Math.random()*201-100)+100;
    }


}
