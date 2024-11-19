package ud2.practicas;

public class buggazo {

    public static void main(String[] args) {

        int rand = 0;

        for (int i=0; i< 20; i++){
            rand = (int)(Math.random()*(200-1+1)+1);
            System.out.println(rand);
        }
        
    }


    static int resta (int a){

        return a-10;
    }

    
    static int resta (int a, int b){

        return a-b;
    }








}






