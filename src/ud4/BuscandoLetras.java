package ud4;

import java.util.Arrays;

public class BuscandoLetras {

    public static void main(String[] args) {
        String cadena = "HolaooH";
        char testChar = 'z';
        //testChar = 'o';
        
        int[]results = buscarLetra(cadena,testChar);

        System.out.println(Arrays.toString(results));

    }


    public static int[] buscarLetra(String cadena, char letra){

        // Si no queremos distinguir entre mayúsculas y minúsculas
        cadena = cadena.toLowerCase(); 
        
        char[] arrChar = cadena.toCharArray();
        int[] indexes = new int[arrChar.length];
        int counter = 0;


        for (int i=0;i< arrChar.length; i++) {
            if (arrChar[i] == letra){
                indexes[counter] = i;
                counter++;
            }
        }
        return Arrays.copyOf(indexes, counter);
    }



}
