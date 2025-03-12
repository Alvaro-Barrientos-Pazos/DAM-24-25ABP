package ud4;

import java.util.Random;
import java.util.Scanner;

public class Buscaminas {

    static final int FIELD_SIZE = 10;
    static final int N_BOMBS = 50;
    static int nCleanTiles = FIELD_SIZE*FIELD_SIZE-N_BOMBS;
    
    static final int intCharA = (int)'a';
    static byte[][] field;
    static char[][] fow;

    public static void main(String[] args) {

        field = new byte[FIELD_SIZE][FIELD_SIZE];
        fow   = new char[FIELD_SIZE][FIELD_SIZE];


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


    static boolean FieldHasMineAt(int row,int column, boolean isFirstClick){
        if ( fow[row][column] == '#' ){

            if (field[row][column] == 1){
                if (isFirstClick){
                    return true;
                }
    
                return false;
            }
            
            fow[row][column] = '0';
            nCleanTiles--;
            
            if (row+1 < FIELD_SIZE)
                FieldHasMineAt(row+1, column, false);    
            
            if (row-1 >= 0)
                FieldHasMineAt(row-1, column, false);

            if (column+1 < FIELD_SIZE)
                FieldHasMineAt(row, column+1, false);
            
            if (column-1 >= 0)
                FieldHasMineAt(row, column-1, false);
            
            return false;
        }

        return false;
    }


    static void generateFow(char[][] fow){
        for (int i = 0; i < fow.length; i++) {
            for (int j = 0; j < fow.length; j++) {
                fow[i][j] = '#';
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

    static void printField(char[][]a){

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
