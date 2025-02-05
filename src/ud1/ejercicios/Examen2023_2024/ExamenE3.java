/* 
Examen DAM Curso 2023 - 2024  Ejercicio 2

Escribe un programa que lea 3 números por teclado e indique si están ordenados o no, de menor a mayor, y de mayor a menor.

 */

package ud1.ejercicios.examen2023_2024;

import java.util.Scanner;

public class ExamenE3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int d1, d2, d3;
        int esMayoraMenor;
        boolean estaOrdenado = false;


        System.out.print("Introduce el primer dígito: ");
        d1 = sc.nextInt();

        System.out.print("Introduce el segundo dígito: ");
        d2 = sc.nextInt();

        System.out.print("Introduce el tercero dígito: ");
        d3 = sc.nextInt();

        System.out.print("¿Que orden quieres comprobar?\n\"mayor a menor\" = 0\n\"menor a mayor\" = 1\n");
        esMayoraMenor = sc.nextInt();
        sc.close();


        // Comparamos si el usuario está preguntando 
        estaOrdenado = esMayoraMenor == 0 ? 
                        d1>d2 && d2>d3 ? true : false
                        
                        : d2<d3 && d1<d2 ? true : false;


        String mVerdad = estaOrdenado == true ? "Está ordenado": "No está ordenado";
        String mOrden  = esMayoraMenor == 0 ? "de mayor a menor": "de menor a mayor";

        System.out.printf("%s %s",mVerdad,mOrden);


        
    }

}
