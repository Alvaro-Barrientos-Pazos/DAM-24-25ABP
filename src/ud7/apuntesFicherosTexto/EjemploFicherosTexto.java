package ud7.apuntesFicherosTexto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class EjemploFicherosTexto {

    static final String FILE_PATH = "src/ud7/apuntesFicherosTexto/";

    public static void main(String[] args) {

        //test1();
        //test2();
        //test3();
        //e10006();
        ap103_jugadores();
    }

    static void ap103_jugadores(){
        try {
            FileReader fichero = new FileReader(FILE_PATH+"jugadores.txt");
            Scanner sc = new Scanner(fichero);
            
            while (sc.hasNextLine()) {
                String nombre = sc.next();
                int edad = sc.nextInt();
                double estatura = sc.nextDouble();

                System.out.printf("%s con edad %d y estatura %.2f\n",nombre,edad,estatura);
            }   

            fichero.close();
            sc.close();


        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    static void e10006(){
        int sum = 0;
        try {
            FileReader fichero = new FileReader(FILE_PATH+"numeros.txt");
            Scanner sc = new Scanner(fichero);
            
            while (sc.hasNextInt()) {
                int n = sc.nextInt();
                sum+= n;
            }   

            fichero.close();
            sc.close();

            System.out.println("sum: "+sum);

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        

    }

    static void test1(){
        try {
            FileReader fichero = new FileReader(FILE_PATH+"texto.txt");
            int charValue = fichero.read();
            while (charValue != -1) {
                System.out.println((char)charValue);
                charValue = fichero.read();
            }   

            fichero.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    static void test2(){
        try {
            FileReader fichero = new FileReader(FILE_PATH+"texto.txt");
            int charValue = fichero.read();
            String txt = "";
            while (charValue != -1) {
                txt +=(char)fichero.read();
                charValue = fichero.read();
            }   

            System.out.println(txt);

            fichero.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    
 
    static void test3(){
        try {
            BufferedReader fichero = new BufferedReader(new FileReader(FILE_PATH+"texto.txt")) ;
            String linea  = fichero.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = fichero.readLine();
            }   

            fichero.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

}
