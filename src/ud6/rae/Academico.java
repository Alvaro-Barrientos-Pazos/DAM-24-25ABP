package ud6.rae;

public class Academico implements Comparable<Academico>{
        
    private String name;
    private String year;

    public Academico(String name, String year){
        this.name = name;
        this.year = year;
        //System.out.printf("%s -> %s\n",name,year);
    }

    @Override
    public int compareTo(Academico o) {
        return this.name.compareTo(o.name);
    }

    
}
