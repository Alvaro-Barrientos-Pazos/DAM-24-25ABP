/* 
 * NumerosEnTexto. Adapta el ejercicio propuesto EP0214 para imprimir por pantalla los
    todos los números del 1 al 99 en formato en formato numérico y en formato texto. Por ejemplo:
        … 
        88. ochenta y ocho
        89. ochenta y nueve
        90. noventa
        …
*/

package pruebas;

//import java.util.Scanner;

public class NumerosALetras_9999 {
    public static void main(String[] args) {
        for (int i= 1; i<10000; i++){
            System.out.printf("%d. %s\n",i,numeroEnTexto(i));
        }
        
    }


    static String numeroEnTexto(int input){

        String cUnits     =""; 
        String cTens      ="";
        String cHundreds  ="";
        String cThousands ="";

        cUnits = UnitsToText(input%10);

        int tens = input%100;
        if (tens > 9 && tens < 20){
            cUnits = "";
            switch (tens) {
                case 10 -> cTens = "diez";
                case 11 -> cTens = "once";
                case 12 -> cTens = "doce"; 
                case 13 -> cTens = "trece";
                case 14 -> cTens = "catorce";
                case 15 -> cTens = "quince"; 
                case 16 -> cTens = "dieciséis";          
                case 17 -> cTens = "diecisiete";         
                case 18 -> cTens = "dieciocho";          
                case 19 -> cTens = "diecinueve";
           } 
        }
        else {
            switch (tens) {
                case 20 -> cTens = "veinte";             
                case 30 -> cTens = "treinta";            
                case 40 -> cTens = "cuarenta";           
                case 50 -> cTens = "cincuenta";          
                case 60 -> cTens = "sesenta";            
                case 70 -> cTens = "setenta";            
                case 80 -> cTens = "ochenta";            
                case 90 -> cTens = "noventa";            
            
                default -> {
                    switch (tens/10) {
                        case 2 ->  cTens = "veinti";        
                        case 3 ->  cTens = "treinta y ";    
                        case 4 ->  cTens = "cuarenta y ";   
                        case 5 ->  cTens = "cincuenta y ";  
                        case 6 ->  cTens = "sesenta y ";    
                        case 7 ->  cTens = "setenta y ";    
                        case 8 ->  cTens = "ochenta y ";    
                        case 9 ->  cTens = "noventa y ";     
                    };
                }
            }
        }
        

        int hundreds = input%1000;

        cHundreds = switch (hundreds) {
            case 100 -> "cien";          
            case 200 -> "doscientos";    
            case 300 -> "trescientos";   
            case 400 -> "cuatrocientos"; 
            case 500 -> "quinientos";    
            case 600 -> "seiscientos";   
            case 700 -> "setecientos";   
            case 800 -> "ochocientos";   
            case 900 -> "novecientos";
            
            default-> {
                yield switch (hundreds/100) {
                    case 1 -> "ciento ";          
                    case 2 -> "doscientos ";    
                    case 3 -> "trescientos ";   
                    case 4 -> "cuatrocientos "; 
                    case 5 -> "quinientos ";    
                    case 6 -> "seiscientos ";   
                    case 7 -> "setecientos ";   
                    case 8 -> "ochocientos ";   
                    case 9 -> "novecientos ";
                    default -> "";
                };
            }
        };

        cThousands = UnitsToText(input/1000);
        cThousands = cThousands == "uno"? "mil ": cThousands+" mil ";

        return cThousands+cHundreds+cTens+cUnits;
     }

     
     static String UnitsToText(int input){

        return switch (input) {
            case 1 ->"uno";      
            case 2 ->"dos";               
            case 3 ->"tres";              
            case 4 ->"cuatro";            
            case 5 ->"cinco";             
            case 6 ->"seis";              
            case 7 ->"siete";             
            case 8 ->"ocho";              
            case 9 ->"nueve"; 
            default ->"";                
        };

     }


}
