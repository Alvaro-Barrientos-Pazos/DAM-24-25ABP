/*
Pedir tres números y mostrarlos ordenados de mayor a menor

*/

package ud2.ejercicios;

import java.util.Scanner;

public class E0207 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1;
        double n2;
        double n3;

        System.out.println("Introduce un valor para el primer número: ");
        n1 = sc.nextDouble();

        System.out.println("Introduce un valor para el segundo número: ");
        n2 = sc.nextDouble();

        System.out.printf("Introduce un valor para el tercer número: ");
        n3 = sc.nextDouble();
        sc.close();

        double bNum = n1;
        double mNum = n2;
        double sNum = n3;

        if ( n2 > bNum ){
            bNum = n2;
            mNum = n1;
            
            if ( n3 > bNum ){
                bNum = n3;
                mNum = n2;
                sNum = n1;
            }
            else if (n3 > mNum){
                mNum = n3;
                sNum = n1;
            }

        }
        else if ( n3 > bNum ){
            bNum = n3;
            mNum = n1;
            sNum = n2;
        }
        else if ( n3 > n2 ){
            mNum = n3;
            sNum = n2;
        }

        System.out.println("El orden de mayor a menor es: "+bNum+" "+mNum+" "+sNum);
        System.out.println("El orden de menor a mayor es: "+sNum+" "+mNum+" "+bNum);
    }

}
