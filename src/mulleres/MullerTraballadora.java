package mulleres;

public abstract class MullerTraballadora {
    String nome;
    String apelido;
    int anoNacemento;


    MullerTraballadora(String nome, String apelido, int anoNacemento){
        this.nome = nome;
        this.apelido = apelido;
        this.anoNacemento = anoNacemento;
    }

    public abstract String descripcionContribucion();

}
