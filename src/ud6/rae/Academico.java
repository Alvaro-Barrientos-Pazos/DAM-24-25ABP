package ud6.rae;

import java.util.Map;

public class Academico implements Comparable<Academico>{

    private String name;
    private int year;


    public Academico(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(Academico o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object obj) {
        Academico academ = (Academico)obj;
        return academ.name.equals(this.name) && academ.year == this.year;
    }

    @Override
    public String toString() {
        return this.name+" año: "+this.year;
    }

    static boolean nuevoAcademico (Map<Character, Academico> academia, Academico nuevo, Character letra){
        if (Character.isLetter(letra)){
            academia.put(letra, nuevo);
            return true;
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    

}
