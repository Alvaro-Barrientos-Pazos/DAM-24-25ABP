package ud4;

import java.util.Arrays;

public class BuscandoLetras {

    public static void main(String[] args) {
        String cadena = "HolaooH";
        
        //int[]results = buscarLetra(cadena,'o');
        int[]results = buscarLetra(cadena,'z');

        System.out.println(Arrays.toString(results));

    }


    public static int[] buscarLetra(String cadena, char letra){
        
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
