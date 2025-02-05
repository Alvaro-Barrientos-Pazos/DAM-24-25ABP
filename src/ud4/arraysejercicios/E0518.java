package arraysejercicios;

public class E0518 {
    public static void main(String[] args) {
        int[] arr = new int[]{16, 3, 2, 13, 5, 10, 11, 8, 9, 6, 7, 12, 4, 15, 14, 1};

        boolean result = isMagicSquare(4, arr);

        System.out.println("\n"+result);

    }



    static boolean isMagicSquare(int sideLength, int[]a){
        int mc = 0;
        int mod = 0;
        int index = 0;
        int sum = 0;
        int lDiagonal = 0, rDiagonal = 0;

        // Sumatorio de las filas y columnas
        for (int i= 0; i< a.length; i++) {
            
            mod = i%sideLength;

            if (mod == 0) {

                if (i >= sideLength){

                    if (sum != 0 && mc != sum){
                        return false;
                    }

                    sum = 0;
                    index+=1;
                    System.out.println();

                }
                
            }

            System.err.printf(" %02d ",+a[i]);

            if (i >= sideLength){
                sum+=a[i];
            }
            else{
                mc+=a[i];
            }

            
        }

        if (mc != sum){
            return false;
        }

        // Sumatorio de las diagonales
        for (int i = 0; i< sideLength; i++){
            lDiagonal+= a[i*sideLength+i];
            rDiagonal+= a[(i*sideLength)+sideLength-i-1];
        }

        if (mc != lDiagonal || mc != rDiagonal){
            return false;
        }

        return true;
    }


}
