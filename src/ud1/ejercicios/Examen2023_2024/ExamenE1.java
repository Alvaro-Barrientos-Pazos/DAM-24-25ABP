/* 
Examen DAM Curso 2023 - 2024  Ejercicio 1

Un grupo de persoas salen a comer juntas. Al terminar piden la cuenta conjunta. Haz un programa que tenga como entrada el número de personas y el importe total 
de la comida y que tenga como salida la cantidad a pagar por cada comensal. Tanto el importe de la comida como el importe a pagar por cada comensal podrán tener 
hasta 2 decimales.
 */

package ud1.ejercicios.Examen2023_2024;

import java.util.Scanner;

public class ExamenE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nPersonas;
        double impTotal;


        System.out.print("Introduce el número de comensales: ");
        nPersonas = sc.nextInt();

        System.out.print("Introduce el importe total en euros a distribuir entre los comensales: ");
        impTotal = sc.nextDouble();
        sc.close();

        System.out.printf("Cada comensal deberá pagar un total de: %.2f euros", (impTotal/nPersonas));


        
    }

}
