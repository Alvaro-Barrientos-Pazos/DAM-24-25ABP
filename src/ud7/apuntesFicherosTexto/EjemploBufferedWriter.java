package ud7.apuntesFicherosTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjemploBufferedWriter {

    static final String FILE_PATH = "src/ud7/apuntesFicherosTexto/";

    public static void main(String[] args) {

        test1();

    }

    static void test1(){
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(FILE_PATH+"texto.txt"));
            
            

            String linea1 = "En un lugar de La Mancha";
            String linea2 = "de cuyo nombre no quiero acordarme";

            for (int i = 0; i < linea1.length(); i++) {
                out.write(linea1.charAt(i));
            }

            out.flush();
            
            out.newLine();

            out.write(linea2);

            out.close();
            
            


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }    

}
