/*
En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los animales. El número de animales que alimentar (todos de la misma especie) es numAnimales, 
y sabemos que cada animal come una media de kilosPorAnimal.

Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos de alimento suficiente para cada animal. En caso negativo, ha de calcular cuál 
es la ración que corresponde a cada uno de los animales. Nota: Evitar que la aplicación realice divisiones por cero.

 */
package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double comidaDiaria;
        int numAnimales;
        double kilosPorAnimal;
        double consumoDiarioAjustado;

        
        System.out.println("Introduce el número de kilos de comida que se compran diariamente: ");
        comidaDiaria = sc.nextDouble();

        System.out.println("Introduce el número de animales: ");
        numAnimales = sc.nextInt();

        System.out.println("Introduce la cantidad de kilos que consume un animal al día: ");
        kilosPorAnimal = sc.nextDouble();


        if (numAnimales <= 0){
            System.out.println("No hay animales a los que alimentar");
            if (comidaDiaria <= 0){
                System.out.println("No hay alimento para los animales");
            }
            return;
        }
        if (comidaDiaria <= 0){
            System.out.println("No hay alimento para los animales");
            return;
        }

        
        if (comidaDiaria > numAnimales * kilosPorAnimal){
            System.out.println("Hay comida suficiente para todos los animales");
        }
        else {
            consumoDiarioAjustado = comidaDiaria / numAnimales; 
            System.out.println("No hay suficiente comida para todos los animales");
            System.out.printf("Los animales solo podrán consumir: %.2f Kg al día\n",consumoDiarioAjustado);
        }
              


    }

}
