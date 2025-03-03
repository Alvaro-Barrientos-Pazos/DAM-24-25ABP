package rol;

public class Personaje {

    protected final String[] RNG_NAMES = {"Hans","Garet","Elendil","Arathor","Paul","Gil","Barry","Paula","Pit","Danna","Jenna","Helga","Maya"};

    public enum RAZA { HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL }

    protected final int EXP_THRESHOLD = 1000;

    protected String name;
    protected RAZA raza;
    
    protected double fuerza;
    protected double agilidad;
    protected double constitucion;

    protected int nivel;
    protected int experiencia;

    protected final int BASE_HEALTH = 50;

    protected double max_health;
    protected int curr_health;
    
    protected int team;


    Personaje(){
        this("", RAZA.HUMANO);
        this.name = getRandomName();
        this.team = 1;
    }


    public Personaje(int team){
        this("", RAZA.HUMANO);
        this.name = getRandomName();
        this.team = team;
    }


    public Personaje(RAZA raza){
        this.raza = raza;
        this.name = getRandomName();
        this.team = 1;

        double fuerza       = Math.random()*100+1;
        double agilidad     = Math.random()*100+1;
        double constitucion = Math.random()*100+1;

        setAttributes(fuerza, agilidad, constitucion, 1, 0);

    }

    
    public Personaje(String name){
        this(name, RAZA.HUMANO);
    }


    public Personaje(String name, RAZA raza){
        this.name = name;
        this.raza = raza;

        int fuerza       = (int)(Math.random()*100+1);
        int agilidad     = (int)(Math.random()*100+1);
        int constitucion = (int)(Math.random()*100+1);

        setAttributes(fuerza, agilidad, constitucion, 1, 0);

    }


    public Personaje(String name, RAZA raza, int fuerza, int agilidad, int constitucion){
        this.name = name;
        this.raza = raza;

        setAttributes(fuerza, agilidad, constitucion, 1, 0);
    }


    public Personaje(String name, RAZA raza, int fuerza, int agilidad, int constitucion, int nivel, int experiencia){
        this.name = name;
        this.raza = raza;

        setAttributes(fuerza, agilidad, constitucion, nivel, experiencia);
    }
    
    public String getRandomName(){
        return RNG_NAMES[(int)(Math.random()*RNG_NAMES.length)];
    }

    public void setAttributes(double fuerza, double agilidad, double constitucion, int nivel, int experiencia){
        try {
            setFuerza(fuerza);
            setAgilidad(agilidad);
            setContitucion(constitucion);
            setNivel(nivel);
            setExperiencia(experiencia);
            setCurr_health((int)max_health);  
        } 
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }


    int sumarExperiencia(int puntos){

        int acc = 0;

        System.out.printf("\n%s gana %dexp\n",name,puntos);

        experiencia += puntos;

        while (experiencia > EXP_THRESHOLD * nivel) {
            experiencia = experiencia - EXP_THRESHOLD * nivel;
            subirNivel();
            acc++;

            System.out.printf("\n%s sube al nivel %d\n",name,nivel);
        }

        return acc;
    }


    void subirNivel(){
        setFuerza(getFuerza()*1.05);
        setAgilidad(getAgilidad()*1.05);
        setContitucion(getConstitucion()*1.05);
    }


    void curar(){
        setCurr_health((int)getMax_health());
    }


    boolean perderVida(int puntos){

        if ((curr_health - puntos) <= 0){
            setCurr_health(0);
            return true;
        }
        
        setCurr_health(curr_health - puntos);
        return false;
    }

    boolean estaVivo(){
        return getCurr_health() > 0 ? true : false;
    }

    int atacar(Personaje enemigo){
        double rawAttackpow  = d100() + fuerza;
        double dmgMitigation = d100() + enemigo.agilidad;
        
        return (int)(dmgMitigation - rawAttackpow);
    }


    /*
    boolean defender(int attack_pow){
        double dmg_mitigation = d100() + agilidad;
        int dmg_taken =  (int)(attack_pow - dmg_mitigation);

        if (dmg_taken > 0){
            if ( !perderVida(dmg_taken) ){
                sumarExperiencia(dmg_taken);
                return false;
            }
            return true;
        }

        return false;
    }
    //*/


    int d100(){
        return (int)(Math.random()*100+1);
    }

    public void setFuerza(double fuerza) {
        if (fuerza < 1) {
            throw new IllegalArgumentException("No se puede asociar el valor 0 al atributo fuerza");
        }
        else{
            this.fuerza = fuerza;
        }
    }
    public void setAgilidad(double agilidad) {
        if (agilidad < 1) {
            throw new IllegalArgumentException("No se puede asociar un valor menor a 1 al atributo agilidad");
        }
        else{
            this.agilidad = agilidad;
        }
    }
    public void setContitucion(double constitucion) {
        if (constitucion < 1){
            throw new IllegalArgumentException("No se puede asociar un valor menor a 1 al atributo constitucion");
        }
        else{
            this.constitucion = constitucion;
        }
        
        setMax_health(constitucion);
    }

    public void setNivel(int nivel) {
        if (nivel < 1){
            throw new IllegalArgumentException("No se puede asociar un valor menor a 1 al atributo nivel");
        }
        else{
            this.nivel = nivel;            
        }
    }

    public void setExperiencia(int experiencia) {
        if (experiencia < 0) {
            throw new IllegalArgumentException("No se puede asociar un valor menor a 0 al atributo experiencia");
        }
        else{
            this.experiencia = experiencia;    
        }
    }

    public void setMax_health(double constitucion) {
        this.max_health = (int)(BASE_HEALTH + constitucion);
    }

    public void setCurr_health(int curr_health) {
        this.curr_health = curr_health;
    }
    
    public void setTeam(int team){
        this.team = team;
    }

    public int getTeam(){
        return team;
    }

    public String getName() {
        return name;
    }

    public RAZA getRaza() {
        return raza;
    }

    public double getFuerza() {
        return fuerza;
    }

    public double getAgilidad() {
        return agilidad;
    }

    public double getConstitucion() {
        return constitucion;
    }

    public int getNivel() {
        return nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public double getMax_health() {
        return max_health;
    }

    public int getCurr_health() {
        return curr_health;
    }

    void mostrar(){
        System.out.printf("\n\nPERSONAJE:\nNombre: %s\nRaza: %s\nFuerza: %d\nAgilidad: %d\nConstitución: %d\nNivel: %d\nExperiencia: %d\nVida Máxima: %d\nVida Actual: %d",
        name,raza.toString(),(int)fuerza,(int)agilidad,(int)constitucion,nivel,experiencia,(int)max_health,curr_health);
    }
    
    public String toString(){
        return String.format("%s (%d/%d)",name,curr_health,(int)max_health);
    }






}
