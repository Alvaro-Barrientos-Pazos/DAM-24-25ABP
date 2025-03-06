package rol;

public class Monstruo extends Personaje{
    
    protected double ataque;
    protected double defensa;
    protected double velocidad;

    @Override
    public int atacar(Personaje enemigo){
        double rawAttackpow  = d100() + ataque;
        double dmgMitigation = d100() + enemigo.agilidad;
        
        return (int)(dmgMitigation - rawAttackpow);
    }


    @Override
    public void mostrar(){
        System.out.printf("\n\nMONSTRUO:\nNombre: %s\nRaza: %s\nAtaque: %d\nDefensa: %d\nVelocidad: %d\nFuerza: %d\nAgilidad: %d\nConstitución: %d\nNivel: %d\nExperiencia: %d\nVida Máxima: %d\nVida Actual: %d",
        name,raza.toString(),(int)ataque,(int)defensa,(int)velocidad,(int)fuerza,(int)agilidad,(int)constitucion,nivel,experiencia,(int)maxHealth,currHealth);
    }


    @Override
    public String toString(){
        if (name.isEmpty()){
            return String.format("%s (%d)",getClass().toGenericString(),currHealth);
        }
        return String.format("%s-%s (%d)",name,getClass().toGenericString(),currHealth);
    }



    public Monstruo generaMonstruoAleatorio(){
        int rng = d100();

        if (rng <= 10){
            return new Dragon();
        }
        else if (rng <= 30) {
            return new Troll();    
        }
        else if (rng <= 60) {
            return new Aranha();
        }

        return new Orco();

    }

}
