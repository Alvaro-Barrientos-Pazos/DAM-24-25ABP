package ud4.stringejercicios;

import java.util.Scanner;

public class ClaseCharacter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str;
        char c;

        while(true){
            str = sc.nextLine();
            

            if (str.equals("")){
                System.out.println("El caracter está vacio");
            }
            else{
                c = str.charAt(0);

                if(Character.isWhitespace(c)){
                    System.out.println("El caracter es un espacio");
                }
    
                else{
    
                    if (Character.isDigit(c))
                    System.out.println("Es dígito");
        
                    if (Character.isLetter(c))
                        System.out.println("Es una letra");
            
                    if (Character.isLetterOrDigit(c))
                        System.out.println("Es letra o dígito");
            
                    if (Character.isUpperCase(c))
                        System.out.println("Está en mayúsculas: "+Character.toLowerCase(c));
            
                    else if (Character.isLowerCase(c))
                        System.out.println("Está en minúsculas: "+Character.toUpperCase(c));
    
                }
            }
            

        }

    }
}
