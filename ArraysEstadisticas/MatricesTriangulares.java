package ArraysEstadisticas;

public class MatricesTriangulares {

    public static Boolean esTriangular(int[][] t){
        int length = t.length;

        for (int i = 0; i < t.length; i++){
            if (t[i].length != t.length){
                return false;
            }
        }
        
        return true;
    }
}
