package aguas;

/*

X   
X0000X

X00X0X

X00X0X

*/


public class aguas {

    static char mtx[][];
    public static void main(String[] args) {
        
        int arr[] = new int[] {4,0,3,6,1,3};

        int min=0, max=0, counter=0;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                
            }



        }
        
        //setMtxHeight(arr);
    }

    static void setMtxHeight(int arr[]){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                mtx[i][j] = 'X';
                
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(mtx[i][j]);
            }
        }
    }
}
