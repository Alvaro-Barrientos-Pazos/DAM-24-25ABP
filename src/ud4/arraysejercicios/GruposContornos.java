package ud4.arraysejercicios;

import java.util.Arrays;
import java.util.Random;

public class GruposContornos {
    

    
    public static void main(String[] args) {

        String[] groups = {
            "Alejandro - Celia",
            "Israel - Hugo",
            "Jorge - Adrián",
            "David B. - Carlos",
            "Pablo - Antonio",
            "Álvaro - Pablo C.",
            "Yago - Eva",
            "Arón - André",
            "Hugo C. - José",
            "Rocío - Saúl - Álvaro"
        };


    }


    static void desordenar(int t[]){
            
        Random rng = new Random();
        
        int rng_value = 0;
        int tmp = 0;

        for (int i = t.length-1; i > 0; i--){
            rng_value = rng.nextInt(i+1);
            tmp = t[i];
            t[i] = t[rng_value ];
            t[rng_value] = tmp;
        }

        System.out.println(Arrays.toString(t));

    }


}
