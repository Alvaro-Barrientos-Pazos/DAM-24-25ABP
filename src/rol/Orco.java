package rol;

public class Orco extends Monstruo{

    public Orco(){
        ataque    = (Math.random()*81-30)+30;
        defensa   = (Math.random()*51-30)+30;
        velocidad = (Math.random()*61-30)+30;
        maxHealth = (Math.random()*101-30)+30;
    }

}
