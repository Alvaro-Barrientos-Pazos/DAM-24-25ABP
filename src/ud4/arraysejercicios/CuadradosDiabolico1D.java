package ud4.arraysejercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.junit.jupiter.api.Test;

public class CuadradosDiabolico1D {

    static int mc = 0;

    @Test
    static void testCuadradoDiabolico() {

        String result = magicSquareCheck(3, new int[]{4, 9, 2, 3, 5, 7, 8, 1, 6});
        System.out.printf("%s\n\n",result);
        assertEquals("ESOTERICO", result);

        result = magicSquareCheck(2, new int[]{1,2,3,4});
        System.out.printf("\n%s\n\n",result);
        assertEquals("NO", result);

        result = magicSquareCheck(4, new int[]{16, 3, 2, 13, 5, 10, 11, 8, 9, 6, 7, 12, 4, 15, 14, 1});
        System.out.printf("%s\n\n",result);
        assertEquals("ESOTERICO", result);


        // Este test es incorrecto esta matriz 3x3 es diabólica con una constante de 75 y esotérica con una segunda constante de 100
        // 75 * 4 / 3 = 100
        //result = magicSquareCheck(3, new int[]{28, 21, 26, 23, 25, 27, 24, 29, 22});
        //System.out.printf("%s\n\n",result);
        //assertEquals("DIABOLICO", result);

        result = magicSquareCheck(3, new int[]{2, 8, 1, 6, 3, 5, 7, 4, 9});
        System.out.printf("\n%s\n\n",result);
        assertEquals("NO", result);

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] matrix;
        int sideLength = -1;
        String strInput = "";

        boolean IsValidInput = false;


        System.out.println("Cuadrado Diabólico");

        do {
            System.out.println("(A)utomático");
            System.out.println("(M)anual");
    
            strInput = sc.nextLine();
            
            switch (strInput.toLowerCase().charAt(0)) {
                case 'a':
                    IsValidInput = true;
                    sideLength = 0;
                    break;
            
                case 'm':
                    IsValidInput = true;
                    break;

                default:
                    break;
            }
            

        }while(IsValidInput == false);


        if (sideLength == 0){
            testCuadradoDiabolico();
        }
        else{

            IsValidInput = false;

            do{
                System.out.println("Introduce la longitud del lado del cuadrado, debe ser un número entero mayor que 1 pero menor que 1025)");
                
                try {
                    sideLength = sc.nextInt();    
                } catch (InputMismatchException e) {
                    System.out.println("Solo se aceptan números enteros entre 2 y 1024");
                }
                finally{
                    if (sideLength < 2 || sideLength > 1024){
                        System.out.println("El rango de números validos es de 2 a 1024");
                    }
                    else{
                        IsValidInput = true;
                    }
                }           

            }while(IsValidInput == false);
                
            IsValidInput = true;

            String str = "";
            String[] strArr;

            System.out.println("Introduce los números que componen la matriz separados por un espacio y en una sola linea\nejemplo: 16 3 2 13 5 10 11 8 9 6 7 12 4 15 14 1\n");
            
            str = sc.nextLine();

            strArr = str.split(" ");
            matrix = new int[strArr.length];

            for (int i = 0; i < strArr.length; i++) {
                matrix[i] = Integer.parseInt(strArr[i]);
            }

            System.out.printf("Input: %s\n",str);
            System.out.println("\nResultado: " + magicSquareCheck(sideLength, matrix) );
                
        }

    }


    static String magicSquareCheck(int sideLength, int[]a){

        boolean isMagic = isMagicSquare(sideLength, a);

        if (isMagic){
            System.out.println("\nmc: "+mc);
            if (isMagicSquareIsoteric(sideLength, a)){
                return "ESOTERICO";
            }
            return "DIABOLICO";
        }

        return "NO";

        
    }

    static boolean isMagicSquare(int sideLength, int[]a){
        
        mc = 0;
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

            System.err.print(" "+a[i]+" ");

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

    
    static boolean isMagicSquareIsoteric(int sideLength, int[]a){

        int corner = 0, middle = 0, center = 0;
        int mid = (sideLength/2);

        boolean isEven = sideLength%2 == 0;

        corner+= a[0];
        corner+= a[sideLength-1];
        corner+= a[sideLength*(sideLength-1)];
        corner+= a[sideLength*(sideLength-1)+(sideLength-1)];

        if (corner != (4. * mc)/sideLength){
            return false;
        }

        center+= a[sideLength*mid+mid];

        middle+= a[mid];
        middle+= a[sideLength*mid];
        middle+= a[sideLength*mid+(sideLength-1)];
        middle+= a[sideLength*(sideLength-1) + mid];
        

        if (isEven){

            middle+= a[mid-1];
            middle+= a[sideLength*(mid-1)];
            middle+= a[sideLength*(mid-1)+(sideLength-1)];
            middle+= a[(sideLength*(sideLength-1) + mid)-1];

            center+= a[sideLength*mid+mid-1];
            center+= a[sideLength*(mid-1)+mid-1];
            center+= a[sideLength*(mid-1)+mid];

            if (center == corner && corner * 2 == middle){
                return true;
            }

        }

        else if (center * 4 == corner && corner == middle){
            return true;
        }

        return false;

    }


}
