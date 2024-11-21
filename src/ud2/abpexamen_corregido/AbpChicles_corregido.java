/* Autor: Álvaro Barrientos Pazos */


// error = -1

package ud2.abpexamen_corregido;

public class AbpChicles_corregido {

    public static void main(String[] args) {
        System.out.println(totalChicles(25,5, 1));
        System.out.println(totalChicles(5,5, 1));
        System.out.println(totalChicles(100,10, 1));
        System.out.println(totalChicles(100,0, 0));
        System.out.println(totalChicles(20,2, 5));
        System.out.println(totalChicles(10,-1, 0));
        
    }


    static int totalChicles (int nComprados, int nEnvoltorios,  int nRegalo){

        if ( nRegalo > nEnvoltorios ){
            return -1;
        }

        if ( nEnvoltorios == 0 ){
            return nComprados;
        }

        int total  = nComprados;
        int extras = nComprados;
        int buffer = 0;

        while( extras>=nEnvoltorios ) {
            buffer = (extras/nEnvoltorios) * nRegalo;
            total += buffer;
            extras = extras/nEnvoltorios;
        };

        return total;

    }

}
