/*
    Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos de un centro educativo. 
    Se introducirán datos hasta que uno de ellos sea negativo, y se mostrará: 
        la suma de todas las edades introducidas, 
        la media, 
        el número de alumnos 
        y cuántos son mayores de edad.

*/

package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0302 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la edad de un alumno: ");
        int input = sc.nextInt();

        int sumatorio=0, nAlumnos=0, nAdultos=0;

        while (input > 0) {

            nAlumnos++;
            sumatorio += input;
            
            if (input >= 18){
                nAdultos++;
            }

            System.out.println("\n--------------------------------------------");
            System.out.println("Suma total   media   nº Alumnos   nº Adultos");
            System.out.println("--------------------------------------------");
            System.out.printf("%5d%13.2f%8d%13d",sumatorio,sumatorio/(double)nAlumnos,nAlumnos,nAdultos);
            
            System.out.print("\n\nIntroduce la edad de un alumno: ");
            input = sc.nextInt();
        }
        sc.close();
    }
}
