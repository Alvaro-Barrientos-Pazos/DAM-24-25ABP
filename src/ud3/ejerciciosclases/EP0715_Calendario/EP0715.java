package ud3.ejerciciosclases.EP0715_Calendario;

import java.util.Scanner;

public class EP0715 {
    public static void main(String[] args) {
        Calendario cal = new Calendario(1920, 2, 29);

        if (cal.getDate() == null){
            return;
        }

        cal.mostrar();

        int input =-1;

        Scanner sc = new Scanner(System.in);

        do{
        

            System.out.println("Introduce: (1)Dia (2)Mes (3)Año");
            input = sc.nextInt();


            switch (input){
                case 1:
                cal.incrementarDia();
                break;
            case 2:
                cal.incrementarMes();
                break;
            case 3: 
                cal.incrementarAño(1);
                break;
            }


            cal.mostrar();
                


        }while(input!=-1);


    }
}
