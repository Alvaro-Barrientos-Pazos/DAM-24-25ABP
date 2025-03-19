package ud5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bingo {

    static class Jugador {
        static public String nombre;
        static Carton[] cartones;

        static final int LINEA = 1;
        static final int BINGO = 2;

        Jugador(String nombre){
            this.nombre = nombre;
        }


        void checkNumber(int num){
            
            for(Carton c : cartones){
                switch (c.checkNumber(num)) {
                    case LINEA:
                        checkFirstLine();
                        break;
                    case BINGO:
                        
                        break;
                
                    default:
                        break;
                };    
            }

        }
        

        

    }


    static class Carton {
        static int[][] arrNums;
        static int[] arrNumsSacados = new int[0];

        static public boolean checkNumber(int num){
            for (int i = 0; i < arrNums.length; i++) {
                for (int j = 0; j < arrJugadores.length; j++) {
                    if (num == arrNums[i][j]) {
                        arrNumsSacados = Arrays.copyOf(arrNumsSacados, arrNumsSacados.length+1);
                        arrNumsSacados[arrNumsSacados.length-1] = num;
                        
                        if (checkRows(num)){
                            checkFirstLine()
                            return checkBingo();
                        }
                    }
                }
            }
            return false;
        }


        static boolean checkRows(int num){
            
            for (int i = 0; i < arrJugadores.length; i++) {
            }


            return false;
        }


        static boolean checkBingo(){
            if (arrNumsSacados.length == ROWS*COLUMNS){
                return true;
            }
            return false;
        }
       

    }

    static final int MAX_CARTONES = 5;
    static final int MIN_VALUE  = 1;
    static final int MAX_VALUE  = 99;
    static final int ROWS       = 3;
    static final int COLUMNS    = 5;


    static Scanner sc = new Scanner(System.in);

    static Jugador[] arrJugadores;
    static Jugador ganador;
    static Jugador primeraLinea;



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

        for (int i = MIN_VALUE; i < MAX_VALUE; i++) {
            nBombo[i] = i;
        }

        int newNum = -1, currId;
        Random rng = new Random();

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


    static public boolean checkFirstLine(Jugador jugador){
        if (primeraLinea == null){
            primeraLinea = jugador;
            System.out.printf("%s gano la primera linea",jugador.nombre);
            return true;
        }

        return false;
    }

}
