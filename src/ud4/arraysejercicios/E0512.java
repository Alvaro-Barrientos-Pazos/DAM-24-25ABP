package ud4.arraysejercicios;

public class E0512 {
    public static void main(String[] args) {
        

        int[][] arr = new int[5][5];

        for (int i = 0; i<arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                arr[i][j]= 10 * i+j;
            }

        }


    }
}
