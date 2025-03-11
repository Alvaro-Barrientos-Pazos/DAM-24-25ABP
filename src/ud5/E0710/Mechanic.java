package ud5.e0710;

public class Mechanic {
    


    public static enum ESPECIALITIES {
        ENGINE
    }

    public static String name;
    public static String phoneNumber;
    public static ESPECIALITIES speciality;

    public Mechanic(String name, ESPECIALITIES speciality){
        this.name = name;
        this.speciality = speciality;
    }


    public Mechanic(String name, ESPECIALITIES speciality, String phoneNumber){
        this.name = name;
        this.speciality = speciality;
        this.phoneNumber = phoneNumber;
    }
    


    public static String getName() {
        return name;
    }
    public static void setName(String name) {
        Mechanic.name = name;
    }
    public static String getPhoneNumber() {
        return phoneNumber;
    }
    public static void setPhoneNumber(String phoneNumber) {
        Mechanic.phoneNumber = phoneNumber;
    }
    public static ESPECIALITIES getSpeciality() {
        return speciality;
    }
    public static void setSpeciality( ESPECIALITIES speciality) {
        Mechanic.speciality = speciality;
    }
    

}
