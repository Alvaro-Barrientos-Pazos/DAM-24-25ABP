package ud6.rae;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AppRae {

    static String seats = "abcdefghijklmnñopqrstuvwxyz";
    //static String seats = "abcdefghijklmnñopqrstuABCDEFGHIJKLMÑOPQRSTUVXZ";
    
    public static void main(String[] args) {
        Map<Character, Academico> academia = new LinkedHashMap<>();

        String contenidoFichero = readFileToString("src/ud6/rae/academicos.txt");

        String[] arr = contenidoFichero.split("\\n");

        List<Academico> listAcadem = new ArrayList<>();


        for (String str : arr) {
            System.out.println(str);
            
            int bracketIDX = str.indexOf('(');
            String name = str.substring(7,bracketIDX);
            int year = Integer.valueOf(str.substring(bracketIDX+1,str.length()-1));
            Character seatLetter = str.charAt(6);

            Academico academico = new Academico(name,year);
            listAcadem.add(academico);

            nuevoAcademico(academia,academico,seatLetter);

            academia.put(seatLetter, academico);
        }

        System.out.println();

        for ( Map.Entry<Character,Academico> e : academia.entrySet()) {
            System.out.println("map: "+e.getKey()+" "+e.getValue());
        }


        // Sort List by name
        listAcadem.sort(Academico::compareTo);
        //listAcadem.sort(Comparator.naturalOrder());
        //listAcadem.sort((a, b) -> a.compareTo(b));
        //listAcadem.sort(Comparator.comparing(a -> a.getName()));

        for (Academico academico : listAcadem) {
            System.out.println(academico);
        }

        listAcadem.sort((a1,a2) -> {
            int tmp = a1.compareTo(a2); 
            return tmp == 0 ? a1.getYear() - a2.getYear() : tmp;
        }  );

        listAcadem.sort(
            Comparator.comparing((Academico a) -> a)
                    .thenComparingInt(a -> a.getYear())
        );



    }


    static boolean nuevoAcademico (Map<Character, Academico> academia, Academico nuevo, Character letra){
        if (Character.isLetter(letra)){
            academia.put(letra, nuevo);
            return true;
        }

        return false;
    }


    public static String readFileToString(String filePath) {
        StringBuilder fileContent = new StringBuilder();
        try {
            // Creamos un objeto FileReader que nos permitirá leer el fichero
            FileReader reader = new FileReader(filePath);

            // Creamos un buffer para leer el fichero de forma más eficiente
            BufferedReader buffer = new BufferedReader(reader);

            // Leemos el fichero línea a línea
            String line;
            while ((line = buffer.readLine()) != null) {
                // Vamos añadiendo cada línea al StringBuilder
                fileContent.append(line);
                // Añadimos un salto de línea al final de cada línea
                fileContent.append("\n");
            }

            // Cerramos el buffer y el fichero
            buffer.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("No existe el fichero.");
            // e.printStackTrace();
        }

        // Devolvemos el contenido del fichero como un String
        return fileContent.toString();
    }
}
