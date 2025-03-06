package mulleres;

public class ProgramaMullerTraballadora {
    public static void main(String[] args) {
        

        Cientifica marieCurie = new Cientifica("Marie","Curie",1867,"Descubriu o radio e o polonio");
        Artista fridaKahlo = new Artista("Frida","Kahlo",1907,"Surrealismo e pintura autobiográfica");
        Politica rosaParks = new Politica("Rosa","Parks",1913,"Loita polos dereitos civís e contra a segregación racial");
        Cientifica adaLovelace = new Cientifica("Ada","Lovelace",1815,"Primeira programadora da historia");

        MullerTraballadora[] mulleres = {marieCurie,fridaKahlo,rosaParks,adaLovelace};


        System.out.println("=== Mulleres Traballadoras Destacadas ===");
        for (MullerTraballadora mullerTraballadora : mulleres) {
            System.out.println(mullerTraballadora.descripcionContribucion());

        }

        System.out.println("\n=== Detalles Específicos ===");
        for (MullerTraballadora mullerTraballadora : mulleres) {

            if (mullerTraballadora instanceof IActivista){
                IActivista activista = (IActivista)mullerTraballadora;
                System.out.println(activista.getCausaDefendida());
            }

            else if(mullerTraballadora instanceof IPioneira){
                IPioneira pionera = (IPioneira)mullerTraballadora;
                System.out.println(pionera.getDescubrimientoOuAporte());
            }

        }
        

    }
}
