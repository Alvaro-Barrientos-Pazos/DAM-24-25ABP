package rol;

public class Personaje {

    protected final String[] RNG_NAMES = {"Hans","Garet","Elendil","Arathor","Pit","Danna","Jenna","Helga","Maya"};

    public enum RAZA { HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL }

    protected final int EXP_THRESHOLD = 1000;

    protected String name;
    protected RAZA raza;
    
    protected int fuerza;
    protected int agilidad;
    protected int constitucion;

    protected int nivel;
    protected int experiencia;

    protected final int BASE_HEALTH = 50;

    protected int max_health;
    protected int curr_health;


    Personaje(){
        this("", RAZA.HUMANO);
        this.name = RNG_NAMES[(int)Math.random()*RNG_NAMES.length];
    }

    public Personaje(RAZA raza){
        this.raza = raza;
        this.name = RNG_NAMES[(int)Math.random()*RNG_NAMES.length];

        int fuerza       = (int)Math.random()*100+1;
        int agilidad     = (int)Math.random()*100+1;
        int constitucion = (int)Math.random()*100+1;

        setAttributes(fuerza, agilidad, constitucion, 1, 0);

    }

    
    public Personaje(String name){
        this(name, RAZA.HUMANO);
    }


    public Personaje(String name, RAZA raza){
        this.name = name;
        this.raza = raza;

        int fuerza       = (int)Math.random()*100+1;
        int agilidad     = (int)Math.random()*100+1;
        int constitucion = (int)Math.random()*100+1;

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
    
    public void setAttributes(int fuerza, int agilidad, int constitucion, int nivel, int experiencia){
        try {
            setFuerza(fuerza);
            setAgilidad(agilidad);
            setContitucion(constitucion);
            setNivel(nivel);
            setExperiencia(experiencia);
            setCurr_health(max_health);  
        } 
        catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }


    byte sumarExperiencia(int puntos){

        int acc = 0;

        experiencia += puntos;

        if ( experiencia > EXP_THRESHOLD * nivel ) {
            experiencia = experiencia- EXP_THRESHOLD * nivel;
        }

        acc = setNivel(nivel+1);

        return 1;
    }

    void subirNivel(){

    }

    void curar(){

    }


    boolean perderVida(int puntos){
        
        if ((curr_health - puntos) > 0){
            curr_health -= puntos;
            return false;
        }

        curr_health = 0;
        
        return true;
    }

    boolean estaVivo(){

        return true;
    }

    int atacar(Personaje enemigo){
        int rawAttackpow  = d100() + fuerza;
        int dmgMitigation = d100() + enemigo.agilidad;
        
        return rawAttackpow - dmgMitigation;
    }

    boolean defender(int attack_pow){
        int dmg_mitigation = d100() + agilidad;
        int dmg_taken =  attack_pow - dmg_mitigation;

        if (dmg_taken > 0){
            if (perderVida(dmg_taken)){
                sumarExperiencia(dmg_taken);
                return false;
            }
            return true;
        }

        return false;
    }

    int d100(){
        return (int)Math.random()*100+1;
    }

    public void setFuerza(int fuerza) {
        if (fuerza < 1) {
            throw new IllegalArgumentException("No se puede asociar el valor 0 al atributo fuerza");
        }
        else{
            this.fuerza = fuerza;
        }
    }
    public void setAgilidad(int agilidad) {
        if (agilidad < 1) {
            throw new IllegalArgumentException("No se puede asociar un valor menor a 1 al atributo agilidad");
        }
        else{
            this.agilidad = agilidad;
        }
    }
    public void setContitucion(int constitucion) {
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

    public void setMax_health(int constitucion) {
        this.max_health = BASE_HEALTH + constitucion;
    }

    public void setCurr_health(int curr_health) {
        this.curr_health = curr_health;
    }
    
    public String getName() {
        return name;
    }

    public RAZA getRaza() {
        return raza;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getAgilidad() {
        return agilidad;
    }

    public int getConstitucion() {
        return constitucion;
    }

    public int getNivel() {
        return nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public int getMax_health() {
        return max_health;
    }

    public int getCurr_health() {
        return curr_health;
    }

    void mostrar(){
        System.out.printf("PERSONAJE:\nNombre: %s\nRaza: %s\nFuerza: %d\nAgilidad: %d\nConstitución: %d\nNivel: %d\nExperiencia: %d\nVida Máxima: %d\nVida Actual: %d",
        name,raza.toString(),fuerza,agilidad,constitucion,nivel,experiencia,max_health,curr_health);
    }
    
    public String toString(){
        return String.format("%s(%d/%d)",name,curr_health,max_health);
    }






}
