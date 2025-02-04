package stringejercicios;

public class E0606 {
    public static void main(String[] args) {
        
        String str = "Álvaro Pérez";
        String noVocals = sinVocales(str);
        System.out.println(noVocals);
    }


    static String sinVocales(String cad){
        
        String noVocals = "";
        char[] vocals = new char[]{'a','e','i','o','u','á','é','í','ó','ú','Á','É','Í',};

        boolean isVocal = false;

        for ( int i = 0; i < cad.length(); i++ ){
            isVocal = false;
            if ( Character.isLetter((int)cad.charAt(i)) ){
                for (char v : vocals) {
                    if (v == cad.charAt(i)){
                        isVocal = true;
                        break;
                    }
                }
                if (isVocal == false){
                    noVocals += cad.charAt(i);
                }
            }
        }

        return noVocals;
    }
}
