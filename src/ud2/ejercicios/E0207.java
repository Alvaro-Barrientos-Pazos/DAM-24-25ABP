/*
Pedir tres números y mostrarlos ordenados de mayor a menor

*/

package ud2.ejercicios;

import java.util.Scanner;

public class E0207 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d1;
        double d2;
        double d3;

        System.out.println("Introduce un valor para el primer número: ");
        d1 = sc.nextDouble();

        System.out.println("Introduce un valor para el segundo número: ");
        d2 = sc.nextDouble();

        System.out.printf("Introduce un valor para el tercer número: ");
        d3 = sc.nextDouble();
        sc.close();

        double bNum = d1;
        double mNum = d2;
        double sNum = d3;

        if ( d2 > bNum ){
            bNum = d2;
            mNum = d1;
            
            if ( d3 > bNum ){
                bNum = d3;
                mNum = d2;
                sNum = d1;
            }
        }
        else if ( d3 > bNum ){
            bNum = d3;
            mNum = d1;
            sNum = d2;
        }
        else if ( d3 > d2 ){
            mNum = d3;
            sNum = d2;
        }

        System.out.println("El orden de mayor a menor es: "+bNum+" "+mNum+" "+sNum);
        System.out.println("El orden de menor a mayor es: "+sNum+" "+mNum+" "+bNum);
    }

}
