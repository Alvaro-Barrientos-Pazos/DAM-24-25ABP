// Álvaro Barrientos Pazos

/*
    Diseña un programa que calcule el área y el perímetro de un terreno con la forma de la figura a partir de los datos de largo y ancho que se introducirán por teclado en metros.
    Utiliza para los cálculos las fórmulas de área y perímetro de un círculo:
    
        Área círculo = 𝑃𝐼 * 𝑅cuadrado
        Perímetro círculo = 2 * 𝑃𝐼 * 𝑅
        Siendo R el radio del círculo
    
    En dicho terreno se pretende organizar una media maratón, es decir, una carrera en la que los participantes deberán correr una distancia de 21097 metros. 
    El programa deberá calcular y mostrar el número de vueltas completas que deberán dar los participantes y el número de metros “sobrantes” redondeando hacia arriba.
 */

package ud1.xxxexamen;

import java.util.Scanner;

public class AreaPerimetroVueltas {

    public static void main(String[] args) {

        final int METROS_MARATON = 21097;

        Scanner sc = new Scanner(System.in);

        double ancho, largo;
        double areaCirculo;
        double periCirculo; // Perímetro Círculo

        double areaRect;
        double areaTotal;
        double periTotal; // Perímetro Total

        double vueltas;
        int resto;

        System.out.println();

        System.out.print("Introduce la medida del largo: ");
        largo = sc.nextDouble();

        System.out.print("Introduce la medida del ancho: ");
        ancho = sc.nextDouble();
        sc.close();

        // el ancho es el mismo tamaño que el diametro del medio circulo por lo tanto
        // para sacar el radio hay que sacar la mitad diviendo entre 2
        double r = ancho / 2;

        areaCirculo = Math.PI * (r * r); // Dos medio circulos son un circulo // r*r = r^2 = Math.pow(r,2)

        // Restamos el ancho pues es el diametro de el circulo y hay dos medios circulos
        // a los lados es decir dos radios que al juntarse son el diametro del circulo.
        double lRect = (largo - ancho);
        areaRect = lRect * ancho;

        areaTotal = areaCirculo + areaRect;

        System.out.printf(
                "\nLa piesta esta compuesta de:\n  %.3fm2 de Área de circulo\n  %.3fm2 de Área de rectangulo\n  El area total es de: %.3fm2\n",
                areaCirculo, areaRect, areaTotal);

        // Dos medio circulos son un circulo
        periCirculo = 2 * Math.PI * r;

        // No hace falta calcular el perimetro del rectangulo ya que los laterales estan
        // sustituidos por medio circulos sumamos al perimetro del circulo el largo del rectangulo lRect.
        periTotal = periCirculo + lRect * 2;

        // Para saber cuantas vueltas se necesitan dividimos, los metros del maraton y
        // los metros de cada vuelta (perimetro) de la pista.
        // necesitamos redondear para arriba en caso de que el resultado tenga
        // decimales, porq significaria que necesitamos hacer parte de la siguiente vuelta.
        // de esta forma damos a entender que hay que hacer una vuelta mas y 
        // a continuacion calcularemos cuantos metros de esa ultima vuelta han sobrado.
        vueltas = (int) Math.ceil(METROS_MARATON / periTotal);
        String vueltaMensaje = vueltas > 1 ? "vueltas" : "vuelta"; // Pijadas

        // Para calcular cuantos metros han sobrado, necesitamos multiplicar el numero
        // de vueltas que necesitamos para terminar el maraton por el numero de metros
        // de cada vuelta (perimetro) y les restamos los metros del maraton. 
        // Ya que este numero siempre sera igual o mas pequeño que los metros recorridos por los corredores.
        resto = (int) (vueltas * periTotal - METROS_MARATON);

        System.out.printf(
                "\nEl perimetro de la pista es de: %.3fm\n  Fue necesario hacer: %d %s\n  En la última vuelta sobraron: %dm de pista\n",
                periTotal, (int) vueltas, vueltaMensaje, resto);
    }
}
