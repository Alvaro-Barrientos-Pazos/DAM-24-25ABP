/* Autor: Álvaro Barrientos Pazos */

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

    static int totalChicles (int ownedGum, int FreeWrapperLimit,  int nExtraGums){

        if (nExtraGums>=FreeWrapperLimit){
            return -1;
        }

        if (FreeWrapperLimit == 0){
            return ownedGum;
        }

        int total    = ownedGum;
        int wrappers = ownedGum;
        int extraGum = 0;

        while (wrappers >= FreeWrapperLimit) {
            extraGum = (wrappers/FreeWrapperLimit)*nExtraGums;
            total += extraGum;
            wrappers = (wrappers/FreeWrapperLimit);    
        }

        return total;
        


    }

}
