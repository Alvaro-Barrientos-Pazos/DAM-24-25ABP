/* 
 * Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique. 
 * Para distinguir un caso de otro se le pasará como opción un número: 1 (para el área) o 2 (para el volumen). 
 * Además, hay que pasarle a la función el radio de la base y la altura.
        área = 2pi * radio * (altura + radio)
        volumen = pi * radio2 * altura
*/

package ud2.funciones;

import java.util.Scanner;

public class E0403 {

    public static void main(String[] args) {
        
        boolean isLooping = false;
        Scanner sc = new Scanner(System.in);

        double radius, height;

        do {
            
            System.out.print("Introduce el radio del cilindro: ");
            radius = sc.nextDouble();
            
            System.out.print("Introduce la altura del cilindro: ");
            height = sc.nextDouble();

            System.out.println("Escoge un programa:\n1: area de un cilindro\n2: volumen de un cilindro");

            switch (sc.nextInt()) {
                case 1:
                    System.out.printf("El area del cilindro es: %.2f\n",areaCilindro(radius,height));
                    sc.close();
                    break;

                case 2:
                    System.out.printf("El volumen del cilindro es: %.2f\n",volumenCilindro(radius,height));
                    sc.close();
                    break;
            
                default:
                    isLooping = true;
                    System.out.println("La opción seleccionada no es valida.\n");
                    break;
            }

        } while (isLooping);

    }

    static double areaCilindro(double radius,double height){
        return 2 * Math.PI * (height+radius);
    }

    static double volumenCilindro(double radius,double height){
        return Math.PI * (radius*radius) * height ;
    }


}
