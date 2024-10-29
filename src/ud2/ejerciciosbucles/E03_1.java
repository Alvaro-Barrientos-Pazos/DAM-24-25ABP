/*
    Diseña una aplicación que muestre la edad máxima y mínima de un grupo de alumnos. 
    El usuario introducirá las edades y terminrá escribiendo un -1.
*/

package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E03_1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Añade la edad de un alumno (El programa terminará al introducir un número negativo)");
        int input = sc.nextInt();
        int edadMin = input;
        int edadMax = input;

        // input != 1   Si somos estrictos con el enunciado
        while (input >= 0) {
            
            if (input > edadMax){
                edadMax = input;
            }
            else if (input < edadMin){
                edadMin = input;
            }

            System.out.printf("El más mayor de los alumnos tiene %d años\nEl más joven de los alumnos tiene: %d años\n",edadMax,edadMin);
            input = sc.nextInt();
        }
        sc.close();
        
    }

}
