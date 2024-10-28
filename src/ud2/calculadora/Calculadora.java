package ud2.calculadora;

import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) {
        
        Calculadora.print_main_menu();
        
        Scanner sc = new Scanner(System.in);
        int idPrograma = sc.nextInt();

        switch (idPrograma) {
            case 1:
                aritmetica_calculadora(sc);
                break;
            case 2:
                imc_calculadora(sc);
                break;
            case 3:
                descuento_calculadora(sc);
                break;
            case 4:
                par_impar(sc);
                break;
            case 5:
                cajero_automatico(sc);
                break;
            case 6:
                System.out.println("El programa se cerrará");
                return;
        
            default:
                System.out.printf("No existe ningún programa asociado a la id: %d",idPrograma);
                sc.close();
                return;
        }

    }

    public static void print_main_menu() {
        System.out.println("\n - Bienvenido al Sistema de Calculadora Interactiva - \n");
        System.out.println("1. Realizar operación matemática (+, -, *, /)");
        System.out.println("2. Calcular el IMC (Índice de Masa Corporal)");
        System.out.println("3. Calcular descuento sobre un producto");
        System.out.println("4. Verificar si un número es par o impar");
        System.out.println("5. Simulación de cajero automático");
        System.out.println("6. Salir");
    }

    public static void aritmetica_calculadora(Scanner sc) {
        System.out.println(" - Calculadora Matemática - ");

        
        double a,b, resultado = 0;
        char operador;

        System.out.println("Introduce el valor de los operandos");
        System.out.print("A: ");
        a = sc.nextDouble();

        System.out.print("B: ");
        b = sc.nextDouble();

        System.out.println("Introduce un operador valido:  Sumar: '+'  Restar: '-'  Multiplicar: '*'  Dividir:'/'");
        sc.nextLine();
        operador = sc.nextLine().charAt(0);
        sc.close();

        switch (operador) {

            case '+': 
                resultado = a+b; 
                break;

            case '-': 
                resultado = a-b; 
                break;

            case '*': 
                resultado = a*b; 
                break;

            case '/': 
                resultado = a/b; 
                break;
        
            default:
                System.out.println("Error: No se introdujo ningun operador valido");
                return;
        }

        System.out.printf("%.2f %c %.2f = %.2f",a,operador,b,resultado);
        return;
    }

    public static void imc_calculadora(Scanner sc){
        System.out.println(" - Índice de Masa Corporal - ");

        double alturaMetros,pesoKg, imc;

        System.out.println("Introduce el valor de los siguientes datos:");
        System.out.print("Altura en metros: ");
        alturaMetros = sc.nextDouble();

        System.out.print("Peso en Kg: ");
        pesoKg = sc.nextDouble();
        sc.close();

        imc = pesoKg / (alturaMetros*alturaMetros);

        String mensaje;

        if (imc < 18.5) {
            mensaje = "Poco peso";
        } else if (imc >= 18.5 && imc < 24.9) {
            mensaje = "Peso normal";
        } else if (imc >= 25 && imc < 29.9) {
            mensaje = "Sobrepeso";
        } else {
            mensaje = "Obesidad";
        }

        System.out.printf("IMC: %.2f [%s]",imc,mensaje);
        return;
    }

    public static void descuento_calculadora(Scanner sc){
        System.out.println(" - Calculadora de descuentos - ");

        double precio, perc_descuento, descuento;

        System.out.println("Introduce el coste el producto");
        precio = sc.nextDouble();
        System.out.println("Elige dentro del rango 0-100 el porcentaje del descuento: ");
        perc_descuento = sc.nextDouble();

        descuento = precio*(perc_descuento*0.01);

        System.out.printf("Un descuento del %.2f%% a %.2f€ sería de %.2f€ el precio final del producto quedaría en %.2f€",perc_descuento,precio,descuento,precio-descuento);
        return;
    }


    public static void par_impar(Scanner sc){
        System.out.println(" - Par o Impar - ");
        
        System.out.print("Introduce un número: ");
        double n = sc.nextDouble();
        sc.close();

        String mensaje;

        if (n%2==0){
            mensaje = "es par";
        }
        else{
            mensaje = "es impar";
        }

        System.out.printf("El número %.2f %s",n,mensaje);

        return;
    }

    public static void cajero_automatico(Scanner sc){
        
        final int CIEN      = 100;        
        final int CINCUENTA = 50;        
        final int VEINTE    = 20;
        final int DIEZ      = 10;
        final int CINCO     = 5;
        
        int importe;

        System.out.println("El dinero se repartida en billetes de: 100, 50, 20, 10 y 5 euros");
        System.out.print("Introduce el importe a extraer: ");
        importe = sc.nextInt();
        sc.close();

        int b100 = importe/CIEN;
        importe = importe%CIEN;

        int b50 = importe/CINCUENTA;    
        importe = importe%CINCUENTA;           

        int b20 = importe/VEINTE;
        importe = importe%VEINTE;

        int b10 = importe/DIEZ;
        importe = importe%DIEZ;

        int b5 = importe/CINCO;

        System.out.printf("billetes de 100:%d\nbilletes de 50:\t%d\nbilletes de 20:\t%d\nbilletes de 10:\t%d\nbilletes de 5:\t%d\n",b100,b50,b20,b10,b5);

        String mensaje = importe%5 == 0 ? "No sobra nada" : "No es posible extraer el de: " + importe%5 + " euros";
        
        System.err.println(mensaje);
        return;
    }

}
