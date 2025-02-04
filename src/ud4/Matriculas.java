import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Matriculas {

    static char[] blackList = new char[] { 'A', 'E', 'I', 'O', 'U', 'Q', 'Ñ' };
    static char[] whiteList = new char[] { 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'S', 'T','V', 'W', 'X', 'Y', 'Z' };
    static String whiteList2 = "BCDFGHJKLMNPRSTVWXYZ";

    static final int N_NUMBERS = 4;
    static final int N_LETTERS = 3;
    static final int PLATE_SIZE = N_NUMBERS + N_LETTERS;

    static final int M1 = -1;
    static final int M2 = 1;
    
    @Test
    public void testMatriculas() {

        assertEquals(false,esMatriculaValida("12A4BBB"));
        assertEquals(false,esMatriculaValida("123BBB"));
        assertEquals(false,esMatriculaValida("123BBQ"));
        assertEquals(false,esMatriculaValida("1234BB"));
        assertEquals(false,esMatriculaValida("1234BB."));
        assertEquals(false,esMatriculaValida("1234BB."));
        assertEquals(false,esMatriculaValida("1234B B"));

        assertEquals(true,esMatriculaValida("1001BZB"));
        assertEquals(true,esMatriculaValida("1001FZB"));


        assertEquals("1002FZB",siguienteMatricula("1001FZB"));
        assertEquals("1000FZB",siguienteMatricula("0999FZB"));
        assertEquals("0000FZC",siguienteMatricula("9999FZB"));
        assertEquals("0000FFB",siguienteMatricula("9999FDZ"));
        assertEquals("0000RBB",siguienteMatricula("9999PZZ"));
        assertEquals("0000BBB",siguienteMatricula("9999ZZZ"));

        assertEquals(M1,comparaMatriculas("1001FZB","1001BZB"));
        assertEquals(M1,comparaMatriculas("9999ZBB","9999YZZ"));
        assertEquals(M2,comparaMatriculas("9998ZBB","9999ZBB"));
        assertEquals(M2,comparaMatriculas("0000ZBB","9999ZBB"));
        assertEquals(M1,comparaMatriculas("0000ZBD","9999ZBB"));

    }



    public static void main(String[] args) {
        String matricula1 = "9999ZBB";
        String matricula2 = "9999BZZ";

        boolean result = esMatriculaValida(matricula2);
        System.out.println(result);

        String nextMatricula = siguienteMatricula(matricula1);

        System.out.println(nextMatricula);

        int resultComparation = comparaMatriculas(matricula2, matricula1);
        System.out.println("Comparation: " + resultComparation);

    }

    // Ver.1
    static int comparaMatriculas2(String m1, String m2) {

        if (m1.equals(m2)) {
            return 0;
        }

        if (m1.substring(N_NUMBERS, PLATE_SIZE).equals(m2.substring(N_NUMBERS, PLATE_SIZE))) {
            
            int num1 = Integer.parseInt(m1.substring(0, N_NUMBERS));
            int num2 = Integer.parseInt(m2.substring(0, N_NUMBERS));

            return num1 > num2? M1 : M2;
        }

        int m1Total = 0, m2Total = 0;

        for (int i = 0; i < N_LETTERS; i++) {
            m1Total += (int) m1.charAt(m1.length() - 1 - i) * Math.pow(whiteList.length+blackList.length, i);
            m2Total += (int) m2.charAt(m1.length() - 1 - i) * Math.pow(whiteList.length+blackList.length, i);
        }

        System.out.println(m1Total);
        System.out.println(m2Total);

        return m1Total > m2Total ? M1 : M2;
    }


    static int comparaMatriculas(String m1, String m2) {

        if (m1.equals(m2)) {
            return 0;
        }

        if (m1.substring(N_NUMBERS, PLATE_SIZE).equals(m2.substring(N_NUMBERS, PLATE_SIZE))) {
            
            int num1 = Integer.parseInt(m1.substring(0, N_NUMBERS));
            int num2 = Integer.parseInt(m2.substring(0, N_NUMBERS));

            return num1 > num2? M1 : M2;
        }

        for (int i = N_LETTERS+1; i < PLATE_SIZE; i++) {
            char c1 = m1.charAt(i);
            char c2 = m2.charAt(i);
    
            if (c1 != c2) {
                return c1 > c2 ? M1 : M2;
            }
        }
        
        return -2;
    }


    static boolean esMatriculaValida(String matricula) {

        if (matricula == null || matricula.length() != PLATE_SIZE){
            return false;
        }

        matricula = matricula.toUpperCase();

        for (int i = 0; i < matricula.length(); i++) {
            if (i < N_NUMBERS && !Character.isDigit(matricula.charAt(i))) {
                return false;
            }
            if (i >= N_NUMBERS && i < PLATE_SIZE) {
                if (!Character.isLetter(matricula.charAt(i))) {
                    return false;
                }

                for (char c : blackList) {
                    if (matricula.charAt(i) == c) {
                        return false;
                    }
                }
            }
        }

        return true;

    }


    static String siguienteMatricula(String matricula) {
        matricula = matricula.toUpperCase();

        int num = Integer.parseInt(matricula.substring(0, N_NUMBERS));
        String letters = matricula.substring(N_NUMBERS, PLATE_SIZE);

        if (num == 9999) {
            letters = addToLetter(num, letters);
        } else {
            num++;
            letters = Integer.toString(num) + letters;
        }

        return letters;
    }


    //Ver.1
    static String addToLetter2(int num, String letters) {

        if (letters.equals("ZZZ")) {
            return "0000BBB";
        }

        String numString = "0000";

        char[] arr = letters.toCharArray();

        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < whiteList.length; j++) {
                if (arr[i] == whiteList[j]) {
                    arr[i] = whiteList[(j + 1) % whiteList.length];
                    
                    if (j + 1 < whiteList.length) {
                        return numString + String.copyValueOf(arr);
                    }

                    break;
                }
            }
        }

        return numString + String.copyValueOf(arr);
    }


    static String addToLetter(int num, String letters) {

        if (letters.equals("ZZZ")) {
            return "0000BBB";
        }

        String numString = "0000";

        char[] arr = letters.toCharArray();

        int index;

        for (int i = arr.length - 1; i >= 0; i--) {
            index = whiteList2.indexOf(letters.charAt(i));
            arr[i] = whiteList2.charAt((index + 1) % whiteList.length);

            if (index + 1 < whiteList.length) {
                return numString + String.copyValueOf(arr);    
            }
        }

        return numString + String.valueOf(arr);
    }
}