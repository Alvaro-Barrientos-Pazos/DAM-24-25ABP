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
    sc.close();

    // Datos modificados
    int mDia  = dia+1;
    int mMes  = mes;
    int mAnho = anho;

    boolean bisiesto = false;
    

    if (anho%4 == 0 && anho%100 != 0 || anho%400 == 0){
        bisiesto = true;
    }

    if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anho < 1 || (mes == 2 && dia>29 && bisiesto)|| (mes == 2 && dia>28)){
        System.out.println("La fecha es invalida"); 
    }
    else{
        switch (mes) {         
            case 2:
                if ((mDia > 28 && !bisiesto) || (mDia>29 && bisiesto)){
                    mDia = 1;
                    mMes++;
                }


            case 4,6,9,11:
                if (mDia > 30){
                    if (mDia > 31){
                        System.out.println("La fecha es invalida");
                        break;
                    }
                    mDia = 1;
                    mMes++;
                }
                

            case 1,3,5,7,8,10,12:
                if (mDia > 31){
                    mDia = 1;
                    mMes++;
                    
                    if (mMes > 12){
                        mAnho++;
                        mMes = 1;
                    }
                }

                
            default:
                System.out.printf("El día siguiente a %d / %d / %d sería: %d / %d / %d \n",dia,mes,anho,mDia,mMes,mAnho);
                break;
        }
        
        
    }

    

  }

}
