package mulleres;

public class Deportista extends MullerTraballadora implements IPioneira{

    String fitoHistorico;

    public String getDescubrimientoOuAporte(){
        return String.format("%s foi unha pioneira no deporte por: %s",nome, fitoHistorico);
    }

    Deportista(String nome, String apelido, int anoNacemento, String fitoHistorico){
        super(nome, apelido, anoNacemento);
        this.fitoHistorico = fitoHistorico;
    }

    @Override
    public String descripcionContribucion() {
        return String.format("%s foi unha deportista e pioneira: %s",nome, fitoHistorico);
    }

}
