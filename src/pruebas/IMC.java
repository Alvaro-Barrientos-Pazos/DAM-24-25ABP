package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

public class IMC {
    /*
    @Test
    void testImc() {

        double resultadoCaso1 = imc(70, 170);
        assertEquals(24.22, resultadoCaso1, 0.01);

        double resultadoCaso2 = imc(90, 185);
        assertEquals(26.30, resultadoCaso2, 0.01);

        double resultadoCaso3 = imc(60, 160);
        assertEquals(23.44, resultadoCaso3, 0.01);

        double resultadoCaso4 = imc(45, 160);
        assertEquals(17.578, resultadoCaso4, 0.01);

        double resultadoCaso5 = imc(65, 165);
        assertEquals(23.875, resultadoCaso5, 0.01);

        double resultadoCaso6 = imc(100, 175);
        assertEquals(32.653, resultadoCaso6, 0.01);

        double resultadoCaso7 = imc(99.98, 200);
        assertEquals(24.995, resultadoCaso7, 0.01);
    }
 */

    public static void main(String[] args) {     
        imctable(); 
    }

    static void imctable(){

        int maxWidth = "Clasificación".length(); // Palabra más larga
        int tabSpace = 8; // Por defecto un tabulador tiene 8 espacios en la terminal powerShell

        final int NUM_ROWS = 5;
        final String BASE_TABLE_CHARS = "┌┐─│└┘┬┴├┼┤";

        final byte TOP_LEFT     = 0;
        final byte TOP_RIGHT    = 1;
        final byte HORIZONTAL   = 2;
        final byte VERTICAL     = 3;
        final byte BOTTOM_LEFT  = 4;
        final byte BOTTOM_RIGHT = 5;

        final byte TOP_MERGE    = 6;
        final byte BOTTOM_MERGE = 7;
        final byte MID_LEFT_MERGE = 8;
        final byte MID_MERGE      = 9;
        final byte MID_RIGHT_MERGE = 10;



        

        final String TOP_BAR      = "┌%s┐\n";
        final String MIDDLE_BAR   = "│ %s │\n";
        final String MIDDLE_MERGE = "├%s┤";
        final String BOTTOM_BAR   = "└%s┘\n";

        double imcValue = imc(getValidWeight(), getValidHeight());
        
        System.out.printf(TOP_BAR);

        String loopString ="";
        String baseString ="";
        String specialChars = "┌┬┐";

        for (int i = 0; i<NUM_ROWS; i++)

            for (int j = 0; j<maxWidth; j++){

                if (j==0){
                    baseString = TOP_BAR;     
                }
                else if (j==1){
                    System.out.print(specialChars.charAt(0));       
                }    
                
                if (i%3 == 0 && i!=0){
                    
                }
                else {
                    //loopString+=
                }

                System.out.printf(baseString,loopString);
                 
            }
        
        //System.out.println("┌───┬────┐");
        //System.out.println("│   │    │");
        //System.out.println("└───┴────┘");




    }


    static double imc(double kg, int cm) {
        
        if (kg<20|| kg>300 || cm < 50 || cm > 250){
            System.out.println("Se han introducido valore/s invalidos");
            return -1;
        }

        double m = cm * 0.01;
        return kg/(m*m);
    }


    static double getValidWeight(){
        Scanner sc = new Scanner(System.in);

        double input = -1;
        boolean isLoop = true;

        do {
            System.out.println("Introduce el peso en kg");
            try{
                input = sc.nextDouble();
                isLoop = false;
            }
            catch (InputMismatchException e){
                System.out.println("Valor Invalido: Debes usar números enteros o decimales");
                isLoop = true;
            }
        }while (isLoop);

        return input;
    }


    static int getValidHeight(){
        Scanner sc = new Scanner(System.in);

        int input = -1;
        boolean isLoop = true;

        do {
            System.out.println("Introduce la altura en cm");
            try{
                input = sc.nextInt();
                isLoop = false;
            }
            catch (InputMismatchException e){
                System.out.println("Valor Invalido: Solo se aceptan números enteros");
                isLoop = true;
            }
        }while (isLoop);

        return input;
    }


}
