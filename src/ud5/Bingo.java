package ud5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bingo {

    static final int MAX_CARTONES = 5;
    static final int MIN_VALUE  = 1;
    static final int MAX_VALUE  = 99;


    static Scanner sc = new Scanner(System.in);

    static Jugador[] arrJugadores;
    static Jugador ganador;
    static Jugador primeraLinea;
    static Jugador primerBingo;



    static class Jugador {

        static public String nombre;
        static Carton[] cartones;

        Jugador(String nombre){
            this.nombre = nombre;
        }

        void checkNumber(int num){
            
            for( Carton c : cartones ){

                switch (c.checkNumber(num)) {
                    case 0: // El cartón contiene el número pero no hay linea ni bingo.
                        break;

                    case 1:
                        if (primeraLinea == null)
                            System.out.println("%s Canto la primera linea!!");    
                        break;
                    
                    case 2:
                        if (primerBingo == null)
                            System.out.println("%d Canto bingo!!");
                        break;
                
                    default:
                        break;
                }
            }
        }      
    }


    static class Carton {

        static final int COLUMNS = 5;
        static final int ROWS = 3;
        
        static int[][] arrNums = new int[COLUMNS][ROWS];
        static int[] arrNumsSacados = new int[COLUMNS*ROWS];
        

        Carton(){
            int[] arrRange = new int[MAX_VALUE];
            int newNum = -1, currId;
            Random rng = new Random(); 
            
            for (int i = MIN_VALUE; i < MAX_VALUE; i++) {
                arrRange[i] = i;
            }

            System.out.println("");

            for (int i = 0; i < COLUMNS; i++) {
                for (int j = 0; j < ROWS; j++) {
                    currId = rng.nextInt(arrRange.length);
                    arrNums[i][j] = arrRange[currId];
        
                    arrRange[currId] = arrRange[arrRange.length-1];
                    arrRange = Arrays.copyOf(arrRange, arrRange.length-1);    
                }
            }

            System.out.println(Arrays.deepToString(arrNums));

        }

        
        public int checkNumber(int num){
            for (int i = 0; i < arrNums.length; i++) {
                for (int j = 0; j < arrJugadores.length; j++) {
                    if (num == arrNums[i][j]) {
                        arrNumsSacados = Arrays.copyOf(arrNumsSacados, arrNumsSacados.length+1);
                        arrNumsSacados[arrNumsSacados.length-1] = num;
                        
                        return checkLine(num, i, j);
                    }
                }
            }
            return -1;
        }

        
        static int checkLine(int num, int x, int y){
            boolean esLinea = false;
            int hLinea = 0;

            for (int i = 0; i < arrNums[x].length; i++) {
                for (int n : arrNumsSacados) {
                    if (n == num){
                        hLinea++;
                    }

                }                
            }

            int vLinea = 0;

            for (int i = 0; i < COLUMNS; i++) {
                for (int n : arrNumsSacados) {
                    if (n == arrNums[i][y]){
                        vLinea++;
                    }

                }                
            }


            if (hLinea == 3) {
                esLinea = true;
            }

            if (vLinea == 3) {
                // Bingo?

                if ( esLinea && arrNumsSacados.length == ROWS*COLUMNS){
                    return 2;
                }
                return 1;
            }

            return esLinea? 1:0;
        }
    }


    public static void main(String[] args) {

        int nJugadores;

        System.out.println("Nº Jugadores");
        nJugadores = sc.nextInt();
        

        arrJugadores = new Jugador[nJugadores];

        
        for (int i = 0; i < nJugadores; i++) {
            System.out.printf("Nombre Jugador %d: ",i+1);
            arrJugadores[i] = new Jugador(sc.nextLine());
        }

        sc.close();

        maquinaBingo();
    }

    static boolean maquinaBingo(){
        
        int[] nBombo = new int[MAX_VALUE];
        int newNum = -1, currId;
        Random rng = new Random();

        for (int i = MIN_VALUE; i < MAX_VALUE; i++) {
            nBombo[i] = i;
        }

        for (int i = 1; i < nBombo.length; i++) {
            currId = rng.nextInt(MAX_VALUE)+1;
            newNum = nBombo[currId];

            nBombo[currId] = nBombo[nBombo.length-1];
            
            nBombo = Arrays.copyOf(nBombo, nBombo.length-1);
        }

        Jugador jugador = null;
        for (int i = 0; i < arrJugadores.length; i++) {
            jugador = arrJugadores[i];
            jugador.checkNumber(newNum);
        }


        return false;
    }

}
