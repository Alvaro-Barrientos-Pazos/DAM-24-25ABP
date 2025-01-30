package ud4;

import java.util.Arrays;

import org.junit.Test;

public class Matriculas {

    static char[] blackList = new char[] { 'a', 'e', 'i', 'o', 'u', 'q', 'ñ' };
    static char[] whiteList = new char[] { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'r', 's', 't',
            'v', 'w', 'x', 'y', 'z' };

    //@Test

    public static void main(String[] args) {
        String matricula1 = "12A4BBB";
        String matricula2 = "9999BZZ";
        String matricula3 = "9999DBB";

        // boolean result = esMatriculaValida(matricula1);
        // boolean result = esMatriculaValida(matricula2);
        boolean result = esMatriculaValida(matricula2);
        System.out.println(result);

        String nextMatricula = siguienteMatricula(matricula3);

        System.out.println(nextMatricula);

        int resultComparation = comparaMatriculas(matricula2, matricula3);
        System.out.println("Comparation: " + resultComparation);

    }

    static int comparaMatriculas(String m1, String m2) {

        final int M1 = -1;
        final int M2 = 1;

        if (m1.equals(m2)) {
            return 0;
        }

        if (m1.substring(4, 7).equals(m2.substring(4, 7))) {
            if (Integer.parseInt(m1.substring(0, 4)) > Integer.parseInt(m2.substring(0, 4))) {
                return M1;
            }
            return M2;
        }

        int m1Total = 0, m2Total = 0;

        for (int i = 0; i < 3; i++) {
            m1Total += (int) m1.charAt(m1.length() - 1 - i) * Math.pow(whiteList.length+blackList.length, i);
            m2Total += (int) m2.charAt(m1.length() - 1 - i) * Math.pow(whiteList.length+blackList.length, i);
        }

        System.out.println(m1Total);
        System.out.println(m2Total);

        if (m1Total > m2Total) {
            return M1;
        } else {
            return M2;
        }

    }

    static boolean esMatriculaValida(String matricula) {

        if (matricula.length() != 7) {
            return false;
        }

        matricula = matricula.toLowerCase();

        for (int i = 0; i < matricula.length(); i++) {
            if (i < 4 && !Character.isDigit(matricula.charAt(i))) {
                return false;
            }
            if (i >= 4 && i < 7) {
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
        matricula = matricula.toLowerCase();

        int num = Integer.parseInt(matricula.substring(0, 4));
        String letters = matricula.substring(4, 7);

        if (num == 9999) {
            letters = addToLetter(num, letters);
        } else {
            num++;
            letters = Integer.toString(num) + letters;
        }

        return letters;
    }


    static String addToLetter(int num, String letters) {

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
                        return numString + String.copyValueOf(arr).toUpperCase();
                    }

                    break;
                }
            }
        }

        return numString + String.copyValueOf(arr).toUpperCase();
    }
}