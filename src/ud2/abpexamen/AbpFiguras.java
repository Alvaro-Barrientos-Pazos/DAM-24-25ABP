/* Autor: Álvaro Barrientos Pazos */


package ud2.abpexamen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AbpFiguras {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        figuras();
    }

    static void figuras(){
        int input = -1;
        boolean isLoop = true;

        int nInvalidInputs = 0; 


        do {

            System.out.println("Introduce el índice del programa que desea ejecutar: ");
            System.out.println("1. Triángulo \n2. Rectángulo\n0. Salir");
            isLoop = false;

            try {
                input = sc.nextInt();    
            }
            catch (InputMismatchException e){
                System.out.println("Opción inválida");
                nInvalidInputs++;
                isLoop = true;
            }

            if (nInvalidInputs >= 3 || input == 0){
                System.out.println("El programa a terminado");
                return;
            }

            switch (input) {

                case 1:
                    triangulo();
                    break;
                case 2:
                    rectangulo();
                    break;
            
                default:
                    System.out.println("Opción inválida");    
                    nInvalidInputs++;
                    isLoop = true;
                    break;
            }

        }while(isLoop);

        sc.close();
    }


    static void triangulo(){
        System.out.println("Programa: Triángulo");
        
        int y = -1;
        boolean isLoop = true;

        do {
            System.out.print("Introduce un valor entre 2 y 20: ");
            isLoop = false;

            try {
                y = sc.nextInt();    
            }
            catch (InputMismatchException e){
                System.out.println("Opción inválida");
                isLoop = true;
            }
        
        } while(isLoop);


        for (int i = 0; i<y; i++){
            System.out.println();

            for (int j = 0; j<y-i; j++){
                System.out.print("*");
            }
        }

    }
        

    static void rectangulo(){
        System.out.println("Programa: Rectángulo");
 
        System.out.println("Introduce el valor de x: ");
        int y = getValidInput();

        System.out.println("Introduce el valor de y: ");
        int x = getValidInput();


        for (int i = 0; i<y; i++){
            System.out.println();

            for (int j = 0; j<x; j++){
                System.out.print("*");
            }
        }

    }
    
    static int getValidInput(){
        int input = -1;
        boolean isLoop = true;

        do {
            System.out.print("Introduce un valor entre 2 y 20: ");
            isLoop = false;

            try {
                input = sc.nextInt();    
            }
            catch (InputMismatchException e){
                System.out.println("Opción inválida");
                isLoop = true;
            }
        
            if (input< 2 || input >20){
                System.out.println("Opción inválida");
                isLoop=true;
            }

        } while(isLoop);    

        return input;

    }



}
