package rol;

public class Dragon extends Monstruo{

    public Dragon(){
        ataque    = (Math.random()*201-100)+100;
        defensa   = (Math.random()*101-60)+60;
        velocidad = (Math.random()*121-80)+80;
        maxHealth = (Math.random()*251-120)+120;
    }

}
