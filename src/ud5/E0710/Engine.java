package ud5.E0710;

class Engine {

    public static String idTag;
    public static int power;
    public static int year;

    public static Mechanic mechanic;

    public Engine(Mechanic mechanic, int year){
        this.mechanic = mechanic;
        this.year = year;    
    }

    public Engine(Mechanic mechanic, int year, String idTag, int power){
        this.mechanic = mechanic;
        this.year = year;    
        this.idTag = idTag;
        this.power = power;
    }


    @Override
    public String toString() {
        return String.format("ID Tag: %s\nPower: %d\nYear: %d", idTag, power, year);
    }

}
