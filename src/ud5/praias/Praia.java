package ud5.praias;

import java.util.Arrays;
import java.util.Comparator;

public class Praia implements Comparable{
    private int id;
    private String nome;
    private String concello;
    private String provincia;
    private double lat;
    private double lon;

    public Praia() {
    }

    public Praia(int id) {
        this.id = id;
    }

    public Praia(String nome, String concello, String provincia, double lat) {
        this.nome = nome;
        this.concello = concello;
        this.provincia = provincia;
        this.lat = lat;
    }

    public Praia(int id, String nome, String concello, String provincia) {
        this.id = id;
        this.nome = nome;
        this.concello = concello;
        this.provincia = provincia;
    }

    public Praia(int id, String nome, String concello, String provincia, double lat, double lon) {
        this.id = id;
        this.nome = nome;
        this.concello = concello;
        this.provincia = provincia;
        this.lat = lat;
        this.lon = lon;
    }

    @SuppressWarnings("unchecked")
    static Praia[] sortLatitudNorteSur(Praia[] p) {
        Praia[] sorted = p.clone();
        Arrays.sort(sorted, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                return Double.compare(((Praia)o1).getLat(), ((Praia)o2).getLat());
            }
        });
        return sorted;
    }

    static Praia[] sortProvinciaConcelloNome(Praia[] p){
        Praia[] sorted = p.clone();
        
        Arrays.sort(sorted, Comparator.comparing(Praia::getNome));
        
        return sorted;
    }

    /*
    public static Praia[] sortLatitudNorteSur(Praia[] p) {
        Praia[] sorted = p.clone();
        Arrays.sort(sorted, Comparator.comparingDouble(Praia::getLat).reversed());
        return sorted;
    }
    */

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConcello() {
        return concello;
    }

    public void setConcello(String concello) {
        this.concello = concello;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %f", nome, concello, provincia, lat) ;
    }

}
