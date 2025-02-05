package arraysEstadisticas;

public class MatricesTriangulares {

    public static Boolean esTriangular(int[][] t){
        int length = t.length;

        for (int i = 0; i < t.length; i++){
            if (t[i].length != t.length){
                return false;
            }
        }

        boolean isTri1 = true;
        boolean isTri2 = true;

        for (int i = 0; i < t.length; i++){
            for (int j = 0; j < i; j++){
                if (t[i][j] != 0){
                    isTri1 = false;
                }
            }
        }


        for (int i = 0; i < t.length; i++){
            for (int j = 0; j < i; j++){
                if (t[i][j] == 0){
                    isTri2 = false;
                }
            }
        }
        
        return true;
    }
}
