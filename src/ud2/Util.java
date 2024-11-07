package ud2;

import java.util.Scanner;

public class Util {

    static boolean esPar(int n) {
        return n%2 == 0;
    }

    static boolean esBisiesto(int n) {
        if ( n%400 == 0 || (n % 4 == 0 && n %100 != 0) ){
            return true;
        }
        return false;
    }

    static int esMayor(int a, int b) {
        
        int biggest = a>b? a:b;

        return biggest;
    }

    static boolean esCasiCero(double n) {
        return n >-1 && n<1 ? true : false;
    }

    public static int numCifras(){
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Introduce un númro: ");
        
        num = sc.nextInt(); 
        sc.close();
        
        if (num < 1) {
            return -1;
        }
        else if (num < 10) {
            return 1;
        }
        else {
            int nCeros = 10, nCounter = 1;

            while ( num > (10*nCeros)) {
                nCeros*=10;
                nCounter++;
            }

            return nCounter+1;
        }

    }

    static String notaEnTexto() {
        
        System.out.println("Introduce la nota: ");
        Scanner sc = new Scanner(System.in);

        double nota = sc.nextDouble();
        sc.close();

        String scoreString = "Nota invalida";

        switch ((int)nota) {
            case 0,1,2,3,4:
                scoreString = "Insuficiente";
                break;
        
            case 5:
                scoreString = "Suficiente";
                break;

            case 6:
                scoreString = "Bien";
                break;

            case 7,8:
                scoreString = "Notable";
                break;
            
            case 9,10:
                scoreString = "Sobresaliente";
                break;
        }


        return scoreString;
    }


    public static void main(String[] args) {
        numCifras();

    }

}
