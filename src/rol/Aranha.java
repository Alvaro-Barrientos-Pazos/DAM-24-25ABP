package rol;

public class Aranha extends Monstruo{

    public Aranha(){
        ataque    = (Math.random()*51-10)+10;
        defensa   = (Math.random()*41-20)+20;
        velocidad = (Math.random()*71-40)+40;
        maxHealth = (Math.random()*81-30)+30;
    }

}
