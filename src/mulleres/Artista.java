package mulleres;

public class Artista extends MullerTraballadora{

    private String estilo;

    Artista(String nome, String apelido, int anoNacemento, String estilo){
        super(nome, apelido, anoNacemento);
        this.estilo = estilo;
    }

    public String descripcionContribucion(){
        return String.format("%s destacou na arte co estilo: %s",nome,estilo);
    }
}
