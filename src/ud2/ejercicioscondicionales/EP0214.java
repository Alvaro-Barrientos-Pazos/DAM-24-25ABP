/*
Escribe un programa que solicite al usuario un número comprendido entre 1 y 99. 
El programa debe mostrario con letras, por ejemplo, para 56, se verá: “cincuenta y seis”.

 */

package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0214 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número entero entre el 1 y el 99");
        String nString = sc.nextLine();

        char cUnidad = nString.charAt(1);
        char cDecena;
        String unidadString = " Error ";
        String decenaString = " Error ";
        
        switch (cUnidad) {
            case '1': unidadString = "uno";    break;
            case '2': unidadString = "dos";    break;
            case '3': unidadString = "tres";   break;
            case '4': unidadString = "cuatro"; break;
            case '5': unidadString = "cinco";  break;
            case '6': unidadString = "seis";   break;
            case '7': unidadString = "siete";  break;
            case '8': unidadString = "ocho";   break;
            case '9': unidadString = "nueve";  break;

        }

        // El número no contiene decenas 
        if (nString.length() == 1){
            System.out.println("El nombre del número es: "+unidadString);
        }

        else{
            cDecena = nString.charAt(0);
        
            // El número contiene y la unidad es 0
            if (cUnidad == '0') {
                switch (cDecena) {
                    case '1': decenaString = "diez";      break;
                    case '2': decenaString = "veinte";    break;
                    case '3': decenaString = "treinta";   break;
                    case '4': decenaString = "cuarenta";  break;
                    case '5': decenaString = "cincuenta"; break;
                    case '6': decenaString = "sesenta";   break;
                    case '7': decenaString = "setenta";   break;
                    case '8': decenaString = "ochenta";   break;
                    case '9': decenaString = "noventa";   break;
    
                }
                System.out.println("El nombre del número es: "+decenaString);
    
            }

            else {
                switch (cDecena) {
                    case '1': decenaString = "dieci";  
                        if (cUnidad == '6'){
                            unidadString = "séis";
                        }
                        break;
                    case '2': decenaString = "veinti";      break;
                    case '3': decenaString = "treinta y ";  break;
                    case '4': decenaString = "cuarenta y ";  break;
                    case '5': decenaString = "cincuenta y "; break;
                    case '6': decenaString = "sesenta y ";   break;
                    case '7': decenaString = "setenta y ";   break;
                    case '8': decenaString = "ochenta y ";   break;
                    case '9': decenaString = "noventa y ";   break;
                }

                System.out.println("El nombre del número es: "+decenaString+unidadString);   
            }
        }
    }
}
