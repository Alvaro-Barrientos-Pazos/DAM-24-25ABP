package ud2;

import java.util.Scanner;

public class Util {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el texto: ");
        String text = sc.nextLine();
        System.out.println("Introduce el simbolo para el padding: ");
        char symbol = sc.nextLine().charAt(0);
        System.out.println("Introduce el tamaño del padding: ");
        int padding = sc.nextInt();
        sc.close();

        cajaTexto(text, symbol, padding);
    }

    public static boolean esPar(int n) {
        return n%2 == 0;
    }


    public static boolean esBisiesto(int n) {
        if ( n%400 == 0 || (n % 4 == 0 && n %100 != 0) ){
            return true;
        }
        return false;
    }


    public static int esMayor(int a, int b) {
        
        int biggest = a>b? a:b;

        return biggest;
    }


    public static int esMayor(int a, int b, int c) {

        if (a>b){
            if (a>c){
                return a;
            }
            return c;
        }

        else if (b>c){
            return b;
        }

        return c;
    }


    public static boolean esCasiCero(double n) {
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


    public static String notaEnTexto() {
        
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


    public static String diaSemana(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero entre 1 y 7: ");

        int diaIndex = sc.nextInt();

        switch (diaIndex) {
            case 1:
                return "Lunes";
        
            case 2:
                return "Martes";              

            case 3:
                return "Miercoles";

            case 4:
                return "Jueves";                

            case 5:
                return "Viernes";

            case 6:
                return "Sabado";

            case 7:
                return "Domingo";

            default:
                return "Número de la semana invalido";

        }
    }


    public static boolean esFechaCorrecta(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un el día de la fecha: ");
        byte dia = sc.nextByte();

        System.out.print("Introduce un el mes de la fecha: ");
        byte mes = sc.nextByte();

        System.out.print("Introduce un el año de la fecha: ");
        int anho = sc.nextInt();
        sc.close();

        String mensaje = "La fecha %d/%d/%d es ";

        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anho < 1 ){
            return false;
        }
        else{
            switch (mes) {         
                case 2:
                    if (dia > 28){
                        return false;
                    }
    
                case 4,6,9,11:
                    if (dia > 30){
                        return false;
                    }
                
                default:
                    return true;
            }
        }
    }


    public static boolean esHoraCorrecta(){
        Scanner sc = new Scanner(System.in);

        final byte MAX_HOUR = 23;
        final byte MAX_SEC_MIN = 59;

        System.out.print("Introduce una hora del día: ");
        if (esMayor(sc.nextByte(), MAX_HOUR)!= MAX_HOUR){
            sc.close();
            return false;
        }

        System.out.print("Introduce el minuto de la hora del día: ");
        
        if (esMayor(sc.nextByte(), MAX_SEC_MIN)!= MAX_SEC_MIN) {
            sc.close();
            return false;
        }

        System.out.print("Introduce el segundo del minuto del día: ");
        if (esMayor(sc.nextByte(), MAX_SEC_MIN)!= MAX_SEC_MIN) {
            sc.close();
            return false;
        }
        sc.close();

        return true;
    }


    public static boolean esHoraCorrecta_v2(){
        Scanner sc = new Scanner(System.in);

        final byte MAX_HOUR = 23;
        final byte MAX_SEC_MIN = 59;

        boolean flag = true;

        System.out.print("Introduce una hora del día: ");
        if (esMayorBoolean(sc.nextByte(), MAX_HOUR)){
            flag = false;
        }

        System.out.print("Introduce el minuto de la hora del día: ");
        if (esMayorBoolean(sc.nextByte(), MAX_SEC_MIN)){
            flag = false;
        }

        System.out.print("Introduce el segundo del minuto del día: ");
        if (esMayorBoolean(sc.nextByte(), MAX_SEC_MIN)){
            flag = false;
        }
        sc.close();

        return flag;
    }


    public static boolean esMayorBoolean(int x,int m){
        if (x > m){
            return true;
        }
        else {
            return false;
        }
    }


    public static void cajaTexto(String str, char symbol) {
        int n = str.length();

        printSimbolo(n,symbol,2);
        
        System.out.printf("%s %s %s\n",symbol,str,symbol);

        printSimbolo(n,symbol,2);

    }

    
    public static void cajaTexto(String str, char symbol, int padding) {
        int n = str.length();

        printSimbolo(n,symbol,padding);
        
        String message = " "+str+" ";

        for (int i = 1; padding>=i ; i++){
            message = String.format("%c%s%c",symbol,message,symbol);
        }

        System.out.println(message);

        printSimbolo(n,symbol,padding);

    }

    
    public static void printSimbolo(int n, char symbol, int padding) {
        for (int i = 1; i <= n + (padding+1)*2; i++ ){
            System.out.print(symbol);
        }
        System.out.println();
    }


}