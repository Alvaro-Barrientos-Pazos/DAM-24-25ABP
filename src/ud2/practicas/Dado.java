package ud2.practicas;

public class Dado {

    public static void main(String[] args) {
        final int NUM_LANZAMIENTOS = 1000;

        d6(NUM_LANZAMIENTOS);
        

    }

    static void d6(int rolls){
        
        double one=0,two=0,three=0,four=0,five=0,six=0;
        int result=0;

        for (int i=0; i<rolls;i++){
            result = (int)(Math.random() * 6)+1;
            
            switch(result){
                case 1 -> one++;
                case 2 -> two++;
                case 3 -> three++;
                case 4 -> four++;
                case 5 -> five++;
                case 6 -> six++;
            } 
        }

        System.out.printf("Ha salido 1: %d veces ( %.2f %%)\n",(int)one,(one/rolls)*100);
        System.out.printf("Ha salido 2: %d veces ( %.2f %%)\n",(int)two,(two/rolls)*100);
        System.out.printf("Ha salido 3: %d veces ( %.2f %%)\n",(int)three,(three/rolls)*100);
        System.out.printf("Ha salido 4: %d veces ( %.2f %%)\n",(int)four,(four/rolls)*100);
        System.out.printf("Ha salido 5: %d veces ( %.2f %%)\n",(int)five,(five/rolls)*100);
        System.out.printf("Ha salido 6: %d veces ( %.2f %%)\n",(int)six,(six/rolls)*100);

    }


}
