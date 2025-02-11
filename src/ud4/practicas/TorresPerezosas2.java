package practicas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class TorresPerezosas2 {


    @Test
    public void testMatriculas() {

        assertEquals(6,calculateCellsValue());
    }

    static final int[][] blockedCells= new int[][] {{0,1},{1,1}};

    static int[][] map = new int[][]{
        {0,0,0},
        {0,0,0},
        {0,0,0},
    };

    // 0 X 0
    // 0 X 0
    // 0 0 0

    static int[][] map2 = new int[][]{
        {1,1,1,0,0},
        {0,0,0,0,0},
        {0,0,0,0,0},
        {0,1,0,0,0},
        {0,1,0,0,0},
    };

    static int[][] map3 = new int[][]{
        {0,0,0,0,0},
        {1,1,0,0,1},
        {0,0,0,0,1},
    };

    static int[][] map4 = new int[][]{
        {0,1,0},
        {0,1,0},
        {0,0,0},
        {0,1,0},
        {0,0,0},
        {0,0,0},
    };


    static int[][] currMap = map.clone();
    //static int[][] currMap = map2.clone();
    //static int[][] currMap = map3.clone();
    //static int[][] currMap = map4.clone();

    public static void main(String[] args) {
        System.out.println( calculateCellsValue() );
        
    }

    static int calculateCellsValue(){
        
        int n = 0;

        for (int i = map.length-1; i >= 0; i--) {

            for (int j = 0; j < map.length; j++) {
                if (j == 0 || i == map.length-1){
                    map[i][j] = 1;    
                }
                    
                if (i>0)
                    // i = Y -1  // j = X
                    map[i-1][j] += map[i][j];
                
                if (j < map.length-1)
                    // i = Y  // j = X +1
                    map[i][j+1] += map[i][j];
            
            printMap();
            }
        }

        return map[0][map.length-1];
    }  


    static void printMap(){
        
        for (int i = 0; i < map.length; i++){
            for (int j = 0; j < map.length; j++){
                System.err.print(map[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n");
    }

}
