/*
Haz un programa que pida por teclado un número de año y que muestre un mensaje indicando 
si el año es bisiesto o no. Investiga el agoritmo para calcular si un año es bisiesto o no.

“Año bisiesto es el divisible entre 4, salvo que sea año secular es decir divisible por 100,
en cuyo caso también ha de ser divisible entre 400.”

    Ejemplos:
    Son bisiestos: 4, 40, 120, 144, 400, 800, 2024. 
    No son bisiestos: 3, 100, 2100

 */

package ud2.ejercicios;

import java.util.Scanner;

public class Bisiesto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Introduce un número de años: ");
        int Years = sc.nextInt();
        sc.close();

        if (Years%4 == 0 && Years%100 != 0 || Years%400 == 0){
            System.out.println("El año es bisiesto");
        }
        else{
            System.out.println("El año no es bisiesto");
        }
    }
}