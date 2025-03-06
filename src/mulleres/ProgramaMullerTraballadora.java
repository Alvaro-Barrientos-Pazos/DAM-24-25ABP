package mulleres;

public class ProgramaMullerTraballadora {
    public static void main(String[] args) {
        

        Cientifica marieCurie = new Cientifica("Marie","Curie",1867,"Descubriu o radio e o polonio");
        Artista fridaKahlo = new Artista("Frida","Kahlo",1907,"Surrealismo e pintura autobiográfica");
        Politica rosaParks = new Politica("Rosa","Parks",1913,"Loita polos dereitos civís e contra a segregación racial");
        Cientifica adaLovelace = new Cientifica("Ada","Lovelace",1815,"Primeira programadora da historia");
        
        Escritora virginiaWoolf = new Escritora("Virginia", "Woolf", 1882, "Orlando e Un cuarto de seu");
        Deportista serenaWilliams = new Deportista("Serena", "Williams", 1981, "Ser a tenista con máis títulos de Grand Slam na era aberta");
        Sindicalista claraCampoamor = new Sindicalista("Clara", "Campoamor", 1888, "Conseguíu o sufraxio feminino en España en 1931");

        MullerTraballadora[] mulleres = {marieCurie,fridaKahlo,rosaParks,adaLovelace,virginiaWoolf,serenaWilliams,claraCampoamor};


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
