/* 
 * NumerosEnTexto. Adapta el ejercicio propuesto EP0214 para imprimir por pantalla los
    todos los números del 1 al 99 en formato en formato numérico y en formato texto. Por ejemplo:
        … 
        88. ochenta y ocho
        89. ochenta y nueve
        90. noventa
        …
*/

package ud2.ejerciciosbucles;

//import java.util.Scanner;

public class EP0214v2 {
    public static void main(String[] args) {
        
        for (int i= 1; i<100; i++){
            System.out.printf("%d. %s\n",i,numeroEnTexto(i));
        }
        
    }

    static String numeroEnTexto(int input){

        String cUnits =""; 
        String cTens ="";
        
        if (input > 9) {
            switch (input) {
                case 10: cTens = "diez";         break;
                case 11: cTens = "once";         break;
                case 12: cTens = "doce";         break;
                case 13: cTens = "trece";        break;
                case 14: cTens = "catorce";      break;
                case 15: cTens = "quince";       break;
                case 16: cTens = "dieciséis";    break;
                case 17: cTens = "diecisiete";   break;
                case 18: cTens = "dieciocho";    break;
                case 19: cTens = "diecinueve";   break;
                case 20: cTens = "veinte";       break;
                case 30: cTens = "treinta";      break;
                case 40: cTens = "cuarenta";     break;
                case 50: cTens = "cincuenta";    break;
                case 60: cTens = "sesenta";      break;
                case 70: cTens = "setenta";      break;
                case 80: cTens = "ochenta";      break;
                case 90: cTens = "noventa";      break;
            
                default:
                    switch (input/10) {
                        case 2: cTens = "veinti";        break;
                        case 3: cTens = "treinta y ";    break;
                        case 4: cTens = "cuarenta y ";   break;
                        case 5: cTens = "cincuenta y ";  break;
                        case 6: cTens = "sesenta y ";    break;
                        case 7: cTens = "setenta y ";    break;
                        case 8: cTens = "ochenta y ";    break;
                        case 9: cTens = "noventa y ";    break; 
                    }
                    break;
            }
        }

        if ( input/10 != 1 && input%10 != 0 ) {

            switch (input%10) {
                case 1: cUnits = "uno";               break;
                case 2: cUnits = "dos";               break;
                case 3: cUnits = "tres";              break;
                case 4: cUnits = "cuatro";            break;
                case 5: cUnits = "cinco";             break;
                case 6: cUnits = "seis";              break;
                case 7: cUnits = "siete";             break;
                case 8: cUnits = "ocho";              break;
                case 9: cUnits = "nueve";             break;    
            }
        }
        return cTens+cUnits;
     }




}
