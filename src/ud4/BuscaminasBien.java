package ud4;

import java.util.Random;
import java.util.Scanner;

public class BuscaminasBien {

    static final int FIELD_SIZE = 10;
    static final int N_BOMBS = 50;
    static int nCleanTiles = FIELD_SIZE*FIELD_SIZE-N_BOMBS;
    
    static final int intCharA = (int)'a';
    static byte[][] field;
    static String[][] fow;

    public static void main(String[] args) {

        field = new byte[FIELD_SIZE][FIELD_SIZE];
        fow   = new String[FIELD_SIZE][FIELD_SIZE];


        fieldGenerator(field, N_BOMBS);
        generateFow(fow);

        System.out.println();
        printField(fow);

        Scanner sc = new Scanner(System.in);

        int column, row;

        do{
            System.out.println();
            System.out.print("Selecciona la fila: ");
            row = (int)(sc.nextLine().charAt(0))-intCharA;
            
            
            System.out.print("Selecciona la columna: ");
            column = sc.nextInt();
            sc.nextLine();
            System.out.println();

            if ( FieldHasMineAt(row, column, true) ){
                System.out.println("\n\n¡¡HAS PERDIDO!!\n");
                printField(field);
                sc.close();
                return; 
            }
            if (nCleanTiles == 0){
                System.out.println("\n\n¡¡HAS GANADO!!\n");
            }
            printField(fow);

        }while(true);
    }


    static byte updateFow(int row,int column){
        if ( fow[row][column].equals("#") ){

            if ( field[row][column] == 1 ){
                return 1;
            }
            
            nCleanTiles--;

            int counter = 0;
            
            if (row+1 < FIELD_SIZE)
                counter += updateFow(row+1, column);    
            
            if (row-1 >= 0)
                counter += updateFow(row-1, column);

            if (column+1 < FIELD_SIZE)
                counter += updateFow(row, column+1);
            
            if (column-1 >= 0)
                counter += updateFow(row, column-1);
            

            fow[row][column] = String.format("%d", counter);

            return 0;
        }

        return 0;
    }


    static boolean FieldHasMineAt(int row,int column, boolean isFirstClick){
        if ( fow[row][column].equals("#") ){

            if (field[row][column] == 1){
                if (isFirstClick){
                    return true;
                }
    
                return false;
            }
            
            nCleanTiles--;

            int counter = 0;

            fow[row][column] = "0";
            
            if (row+1 < FIELD_SIZE)
                counter += updateFow(row+1, column);    
            
            if (row-1 >= 0)
                counter += updateFow(row-1, column);

            if (column+1 < FIELD_SIZE)
                counter += updateFow(row, column+1);
            
            if (column-1 >= 0)
                counter += updateFow(row, column-1);
            

            fow[row][column] = String.format("%d", counter);

            return false;
        }

        return false;
    }


    static void generateFow(String[][] fow){
        for (int i = 0; i < fow.length; i++) {
            for (int j = 0; j < fow.length; j++) {
                fow[i][j] = "#";
            }
        }
    }


    static void fieldGenerator(byte[][] field, int nBombs){
        
        Random rng = new Random();

        for (int i = 0; i < nBombs; i++) {
            field[rng.nextInt(field.length)][rng.nextInt(field.length)] = 1;
        }

        printField(field);
    }


    static void printField(byte[][]a){

        

        for (int i = 0; i< a.length; i++){
            
            for (int j = 0; j< a[i].length; j++){
                if (j==0){
                    if (i != 0 ){
                        System.out.printf("%2s",Character.toString(intCharA+i-1));
                    }
                    
                }
                if (i == 0){
                    if (j==0){
                        System.out.printf("%2s","");
                    }
                    
                    System.out.printf("%2d",j);
                }
                else{
                    System.out.printf("%2d",a[i-1][j]);
                }
                
            }
            System.out.println();
            
        }
    }

    static void printField(String[][]a){

        int intCharA = (int)'a';

        for (int i = 0; i< a.length; i++){
            
            for (int j = 0; j< a[i].length; j++){
                if (j==0){
                    if (i != 0 ){
                        System.out.printf("%2s",Character.toString(intCharA+i-1));
                    }
                    
                }
                if (i == 0){
                    if (j==0){
                        System.out.printf("%2s","");
                    }
                    
                    System.out.printf("%2s",j);
                }
                else{
                    System.out.printf("%2s",a[i-1][j]);
                }
                
            }
            System.out.println();
            
        }
    }


}
