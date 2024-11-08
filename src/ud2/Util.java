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
        if (esMayorQue(sc.nextByte(), MAX_HOUR)){
            flag = false;
        }

        System.out.print("Introduce el minuto de la hora del día: ");
        if (esMayorQue(sc.nextByte(), MAX_SEC_MIN)){
            flag = false;
        }

        System.out.print("Introduce el segundo del minuto del día: ");
        if (esMayorQue(sc.nextByte(), MAX_SEC_MIN)){
            flag = false;
        }
        sc.close();

        return flag;
    }


    public static boolean esMayorQue(int x,int m){
        if (x > m){
            return true;
        }
        else {
            return false;
        }

    }
}