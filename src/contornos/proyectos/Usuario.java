package contornos.proyectos;

import java.util.Scanner;

import contornos.proyectos.Cartera;

public class Usuario {

    public static Cartera wallet;
    public static String name;
    public static String email;    

    public static Scanner sc = new Scanner(System.in);    


    public static boolean isValidInputChar(char confirm_char ){
        sc.nextLine();

        char inputChar = '\0';
        
        boolean isLoop = true;

        do {
            try {
                inputChar = sc.nextLine().charAt(0);
                
            } catch (Exception e) {
                System.out.println("Error: El input es invalido");
            }
        }while(isLoop);

        if (inputChar == confirm_char){
            return true;
        }

        else{

        }
        return false;
        
        
    }

    public static String cambiar_nombre(String new_name){
        if (new_name == name){
            System.out.println("Has introducido el mismo nombre");
        }
        else{
            System.out.println("Quieres confirmar el cambio al nombre: "+new_name);
            System.out.print("(s)i (n)o: ");
        }
        
        name = new_name;
        return  name;
    }

    public static String cambiar_email(String new_email){
        name = new_email;
        return  name;
    }


}
