package ud6.rae;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AppRae {


    
    static public Map<Character,Academico> seats = new HashMap<>();
    static String seatsCharacters = "abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    static public Academico[] arrSortedByName = new Academico[seatsCharacters.length()];
    static public Academico[] arrSortedByYear = new Academico[seatsCharacters.length()];

    public static void main(String[] args) {
        
        final String filePath = "DATOS - Académicos RAE (2025_04_11).txt";
     
        String rawNames = readFileToString(filePath);

        String[] names = rawNames.split("\\n");
        System.out.println(names);

        System.out.println(Arrays.toString(names));

        for (int i = 0; i < seatsCharacters.length(); i++) {
            if (i>= names.length){
                System.out.println("Se han cubierto todos los asientos, pero quedan nombres en la lista");
                break;
            }
            String[] arrSplit = names[i].split("\\(");
            String name = arrSplit[0];
            String year = arrSplit[1];
            year = year.replace(")","");
    
            Academico a = new Academico(name,year);

            seats.put(Character.valueOf(seatsCharacters.charAt(i)),new Academico(name,year));
            arrSortedByName[i] = a;
        }
        
        Character c = 'B';
        boolean result = nuevoAcademico(seats, arrSortedByName[0], c );
        System.out.printf("Sillón '%s': %s",c,result);

        arrSortedByYear = arrSortedByName.clone();
        System.out.println(Arrays.toString(arrSortedByName));
        Arrays.sort(arrSortedByName);

        System.out.println(Arrays.toString(arrSortedByName));
    }


    static boolean nuevoAcademico (Map<Character, Academico> academia, Academico nuevo, Character letra){
        if (-1 == seatsCharacters.lastIndexOf(letra.charValue())) {
            if (academia.get(letra) != null) {
                System.out.println("Sillon ocupado");
                return false;
            }
            
            seats.put(letra,nuevo);
            return true;
        }
        else{
            System.out.println("Sillon invalido");
            return false;
        }
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
