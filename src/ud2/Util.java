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

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double n = sc.nextDouble();
        sc.close();
        //System.out.println("Introduce un número");
        System.out.println(esCasiCero(n)?"Es casi cero":"no es casi cero");
        //System.out.println(esPar(n)?"Es par":"Es impar");

        //System.out.println(esBisiesto(n)?"Es bisiesto":"No es bisiesto");




    }

}
