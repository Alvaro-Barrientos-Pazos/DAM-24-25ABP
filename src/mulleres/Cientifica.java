package mulleres;

public class Cientifica extends MullerTraballadora implements IPioneira{


    private String descubrimiento;


    public String getDescubrimientoOuAporte(){
        return String.format("%s foi pioneira en: %s",nome,descubrimiento);
    }

    Cientifica(String nome, String apelido, int anoNacemento, String descubrimiento){
        super(nome, apelido, anoNacemento);
        this.descubrimiento = descubrimiento;
    }


    @Override
    public String descripcionContribucion(){
        return String.format("%s foi unha científica pioneira que descubriu: %s",nome,descubrimiento);
    }

}
