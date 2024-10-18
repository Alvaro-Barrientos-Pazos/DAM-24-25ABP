/*
Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. 
Hay que tener en cuenta que existen meses con 28, 30 y 31 días 
(no se considerarán los años bisiestos).

*/

package ud2.ejercicios;

import java.util.Scanner;

public class E0212 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un el día de la fecha: ");
        byte dia = sc.nextByte();

        System.out.print("Introduce un el mes de la fecha: ");
        byte mes = sc.nextByte();

        System.out.print("Introduce un el año de la fecha: ");
        int anho = sc.nextInt();
        sc.close();

        String mensaje = "La fecha %d/%d/%d es ";

        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anho < 1 ){
            mensaje+="invalida";
        }
        else{
            switch (mes) {         
                case 2:
                    if (dia > 28){
                        mensaje+="invalido"; 
                        break;
                    }
    
                case 4,6,9,11:
                    if (dia > 30){
                        mensaje+="invalido"; 
                        break;
                    }
                
                default:
                    mensaje+="valida";
                    break;
            }
        }
        
        System.out.printf(mensaje,dia,mes,anho);
        

             
    }
}
