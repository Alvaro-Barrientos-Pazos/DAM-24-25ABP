package ud4.practicas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class TorresPerezosas {



    @Test
    public void testMatriculas() {
    
        assertEquals(4,countPaths(currMap.length-1, 0));
    }

    static final int LENGTH = 3;
    static final int[][] blockedCells= new int[][] {{0,1},{1,1}};

    static int[][] map = new int[][]{
        {0,1,0},
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



    //static int[][] currMap = map.clone();
    //static int[][] currMap = map2.clone();
    //static int[][] currMap = map3.clone();
    static int[][] currMap = map2.clone();


    public static void main(String[] args) {
        System.out.println( countPaths(currMap.length-1, 0) );
    }

    static int countPaths(int y, int x){
        if (y==0 && x == currMap[0].length-1)
            return 1;
        
        if (y < 0 || x >= currMap[0].length)
            return 0;
        
        if (currMap[y][x] == 1)
            return 0;
        
        int topPaths   = countPaths(y-1,x);
        int rightPaths = countPaths(y,x+1);
        
        
        return topPaths + rightPaths;
    }  

}
