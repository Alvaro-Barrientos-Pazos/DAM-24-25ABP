package mulleres;

public class Politica extends MullerTraballadora implements IActivista{


    private String causa;


    Politica(String nome, String apelido, int anoNacemento, String causa){
        super(nome, apelido, anoNacemento);
        this.causa = causa;
    }


    public String getCausaDefendida(){
        return String.format("%s defendeu a causa: %s",nome,causa);
    }


    public String descripcionContribucion(){
        return String.format("%s foi unha poítica e activista destacada por: %s",nome,causa);
    }


    public String toString(){
        return descripcionContribucion();
    }


}
