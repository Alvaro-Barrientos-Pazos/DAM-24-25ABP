// 4 num
// 3 letras (sin vocales, ñ, q)

import java.util.Arrays;

public class Matriculas {

    static char[] blackList = new char[] { 'a', 'e', 'i', 'o', 'u', 'q', 'ñ' };
    static char[] whiteList = new char[] { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'r', 's', 't',
            'v', 'w', 'x', 'y', 'z' };

    public static void main(String[] args) {
        String matricula1 = "12A4BBB";
        String matricula2 = "1234BB.";
        String matricula3 = "9999BBZ";

        // boolean result = esMatriculaValida(matricula1);
        // boolean result = esMatriculaValida(matricula2);
        boolean result = esMatriculaValida(matricula3);
        System.out.println(result);

        String nextMatricula = siguienteMatricula(matricula3);

        System.out.println(nextMatricula);

        comparaMatriculas(matricula1,matricula3);

    }


    static int comparaMatriculas(String m1, String m2){

        if (m1.equals(m2)){
            return 0;
        }

        boolean isOlder = true;

        for (int i = 4; i < m1.length(); i++) {
            if (m1.charAt(i) < m2.charAt(i)){
                isOlder = false;
                break;
            }



        }

        return 0;

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
            letters = Integer.toString(num)+letters;
        }

        return letters;

    }

    static String addToLetter(int num, String letters) {

        if (letters.equals("ZZZ")){
            return "0000BBB";
        }

        String numString = "0000";

        char[] arr = letters.toCharArray();

        boolean isFlag = false;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (isFlag) {
                break;
            }

            for (int j = 0; j < whiteList.length; j++) {
                if (arr[i] == whiteList[whiteList.length-1]) {
                    continue;
                }

                if (arr[i] == whiteList[j]) {
                    arr[i] = whiteList[(j + 1) % whiteList.length];
                    if (j + 1 < whiteList.length) {
                        isFlag = true;
                        break;
                    }

                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        return numString+String.copyValueOf(arr).toUpperCase();
    }
}
