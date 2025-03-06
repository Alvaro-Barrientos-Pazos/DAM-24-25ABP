package mulleres;

public class Sindicalista extends MullerTraballadora implements IActivista{

    private String movementoDefendido;

    public String getCausaDefendida(){
        return String.format("%s defendeu a causa: %s", nome, movementoDefendido);
    }

    Sindicalista(String nome, String apelido, int anoNacemento, String movementoDefendido){
        super(nome, apelido, anoNacemento);
        this.movementoDefendido = movementoDefendido;
    }

    @Override
    public String descripcionContribucion() {
        return String.format("%s foi unha sindicalista e activista destacada por: %s", nome, movementoDefendido);
    }

}
