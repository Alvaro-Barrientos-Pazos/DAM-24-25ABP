
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ConceptosProgramacion {
    public static void main(String[] args) {
        
        String[] arr = {
            "Algoritmo",
            "Lenguaje de programación",
            "Entorno de desarrollo",
            "Compilación",
            "Ejecución",
            "Código fuente",
            "Bytecode",
            "Código objeto"
        };


        String result = fraseAleatoria(arr);

        System.out.println(result);

        Scanner sc = new Scanner(System.in);

        char input = '\0';
        

        do{
            input = sc.next().charAt(0);
            int[] searchResults = BuscandoLetras.buscarLetra(result,input);

            if (searchResults.length==0){
                System.out.println("Fallaste");
                sc.close();
                return;
            }

        System.out.println("La letra aparece en las posiciones: "+Arrays.toString(searchResults));
        System.out.printf("La letra aparece %s de veces\n",searchResults.length);


        }while(true);
    }
    

    static String fraseAleatoria(String[] t){
        Random rng = new Random();

        return t[rng.nextInt(t.length)];
    }




}
