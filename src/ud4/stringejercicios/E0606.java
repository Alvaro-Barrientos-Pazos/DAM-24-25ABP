package stringejercicios;

public class E0606 {
    public static void main(String[] args) {
        
        String str = "Álvaro Pérez";
        sinVocales(str);
    }


    static String sinVocales(String cad){
        
        String noVocals = "";

        for ( int i = 0; i < cad.length(); i++ ){

            if ( Character.isLetter((int)cad.charAt(i)) ){
                System.out.print( cad.charAt(i) );
                System.out.print( "\t" + (int)cad.charAt(i) + "\t" );
                System.out.println( Character.isUnicodeIdentifierStart( (int)cad.charAt(i) ) );
            }
        }

        return noVocals;
    }
}
