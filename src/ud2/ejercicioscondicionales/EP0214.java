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
        String input = sc.nextLine();
        sc.close();

        boolean hasTens = input.length()>1;

        char cUnits = input.charAt(hasTens? 1:0 );
        char cTens;
        String nString = "Error";
        

        switch (cUnits) {
            case '1': nString = "uno";    break;
            case '2': nString = "dos";    break;
            case '3': nString = "tres";   break;
            case '4': nString = "cuatro"; break;
            case '5': nString = "cinco";  break;
            case '6': nString = "seis";   break;
            case '7': nString = "siete";  break;
            case '8': nString = "ocho";   break;
            case '9': nString = "nueve";  break;

        }

        if (hasTens){
            cTens = input.charAt(0);

            switch (cTens) {
                case '1': nString = cUnits == '0'? "diez": cUnits == '6'?"dieciséis":"dieci" + nString;  break;
                case '2': nString = cUnits == '0'? "veinte":"veinti" + nString;                          break;
                case '3': nString = cUnits == '0'? "treinta":"treinta y " + nString;                     break;
                case '4': nString = cUnits == '0'? "cuarenta":"cuarenta y " + nString;                   break;
                case '5': nString = cUnits == '0'? "cincuenta":"cincuenta y " + nString;                 break;
                case '6': nString = cUnits == '0'? "sesenta":"sesenta y " + nString;                     break;
                case '7': nString = cUnits == '0'? "setenta":"setenta y " + nString;                     break;
                case '8': nString = cUnits == '0'? "ochenta":"ochenta y " + nString;                     break;
                case '9': nString = cUnits == '0'? "noventa":"noventa y " + nString;                     break;

            }
         }
        System.out.println("El nombre del número es: " + nString);
     }
}

