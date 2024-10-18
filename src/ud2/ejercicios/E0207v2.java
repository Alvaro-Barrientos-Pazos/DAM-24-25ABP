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

        double temp;
        double bNum = n1;  // Biggest Number
        double mNum = n2;  // Middle Number
        double sNum = n3;  // Smallest Number

        if (mNum > bNum){
            temp = bNum;
            bNum = mNum;
            mNum = temp;
        }

        if (sNum > bNum){
            temp = bNum;
            bNum = sNum;
            sNum = temp;
        }

        if (sNum > mNum){
            temp = mNum;
            mNum = sNum;
            sNum = temp;
        }
        
        System.out.println("El orden de mayor a menor es: "+bNum+" "+mNum+" "+sNum);
        System.out.println("El orden de menor a mayor es: "+sNum+" "+mNum+" "+bNum);
    } 

}
