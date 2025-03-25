package ud5.interfacesejercicios.mulleres;

public class Escritora extends MullerTraballadora implements IPioneira{

    private String obraMaestra;

    @Override
    public String getDescubrimientoOuAporte() {
        return String.format("%s foi unha pioneira na obra: %s", nome, obraMaestra);
    }

    Escritora(String nome, String apelido, int anoNacemento, String obraMaestra){
        super(nome, apelido, anoNacemento);
        this.obraMaestra = obraMaestra;
    }

    @Override
    public String descripcionContribucion() {
        return String.format("%s foi a escritora da famosa obra: %s ",nome, obraMaestra);
    }



}
