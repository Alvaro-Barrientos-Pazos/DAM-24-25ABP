package stringejercicios;

public class E0605 {
    public static void main(String[] args) {
        
        String str = invertirCadena("Tool");
        System.out.println(str);
    }

    static String invertirCadena(String cad){
        String invertedString = "";
        
        for (int i = cad.length()-1; i >= 0 ; i--){
            invertedString += cad.charAt(i);
        }

        return invertedString;
    }
}
