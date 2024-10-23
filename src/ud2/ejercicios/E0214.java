/*
Crear una aplicación que solicite al usuario una fecha (día, mes, año) 
y muestre la fecha correspondiente al día siguiente.
*/

package ud2.ejercicios;

import java.util.Scanner;

public class E0214 {

  public static void main(String[] args) {
    
    int dia,mes,anho;

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce el día de la fecha: ");
    dia = sc.nextInt();
    System.out.print("Introduce el mes de la fecha: ");
    mes = sc.nextInt();
    System.out.print("Introduce el año de la fecha: ");
    anho = sc.nextInt();

    dia+=1;

    boolean bisiesto = false;

    if (anho%4 == 0 && anho%100 != 0 || anho%400 == 0){
        bisiesto = true;
    }

    // Es un coñazo checkear otra vez por fechas invalidas sin funciones asi que solo compruebo lo basico, se quedan fuera los febreros y los meses de 30 dias. Demasiado escribir.
    if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anho < 1 ){
        System.out.println("La fecha es invalida"); 
    }
    else{
        switch (mes) {         
            case 2:
                if (dia > 28 || (dia>29 && bisiesto)){
                    dia = 1;
                    mes += 1;
                }
                break;

            case 4,6,9,11:
                if (dia > 30){
                    dia = 1;
                    mes += 1;
                }
                break;

            case 1,3,5,7,8,10,12:
                if (dia>31){
                    dia = 1;
                    mes += 1;
                }
                break;
            
        }
    }

    if (mes > 12){
        anho+=1;
    }
    

  }


}
