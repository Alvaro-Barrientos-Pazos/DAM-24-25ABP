package practicas;

public class ConjugarVerbos {

    public static void main(String[] args) {
        conjugarTiempoVerbal("vivir","futuro simple");
    }


    static String[] forgeVerb(String pVerb, String[] arr){
        String[] verbT = new String[6];

        //   0   1   2     3      4    5
        // {"o","as","a","amos","áis","an"}

        // Viv
        // viv + arr[0]  o =   vivo
        // viv + arr[1]  as =  vivas
        // viv + arr[2]  a =   viva
       
        for (int i = 0; i < arr.length; i++) {
            verbT[i] = pVerb + arr[i];
        } 
        
        return verbT;
    }


    static void printVerbsAndPronouns(String[] verbPresent){
        final String[] pronouns = new String[]{"Yo","Tú","Él/Ella/Usted","Nosotros/Nostoras","Vosotros/Vosotras","Ellos/Ellas/Ustedes"};


        // pronouns[0] = yo + " " + vivo
        // verbPresent[0] = vivo

        for (int i = 0; i < pronouns.length; i++) {
            System.out.printf("%s %s\n",pronouns[i],verbPresent[i]);
        }
    }


    static String[] conjugarTiempoVerbal(String verbo, String tiempoVerbal){

        if (verbo.isEmpty()){
            return null;
        }
            

            
        tiempoVerbal = tiempoVerbal.toLowerCase();

        String[]result = switch (tiempoVerbal) {
            case "presente simple" -> conjugarPresente(verbo);
            
            case "preterito perfecto simple" -> conjugarPPsimple(verbo);

            case "futuro simple" -> conjugarFsimple(verbo);
        
            default -> null;
        };

        printVerbsAndPronouns(result);
        
        return result;
    }


    static String[] conjugarPPsimple(String verbo){

        final String[] ar = new String[]{"é","aste","ó","amos","ásteis","aron"};
        final String[] er = new String[]{"í","iste","ó","imos","ísteis","eron"};

        String pVerb = verbo.substring(0, verbo.length()-2);
        String sVerb = verbo.substring(verbo.length()-2,verbo.length() );

        return switch (sVerb) {

            case "ar" -> forgeVerb(pVerb, ar);
            
            case "er","ir" -> forgeVerb(pVerb, er);

            default -> null;
        };
    }


    static String[] conjugarFsimple(String verbo){

        final String[] ar = new String[]{"aré","arás","ará","aremos","aréis","arán"};
        final String[] er = new String[]{"eré","erás","erá","eremos","eréis","erán"};
        final String[] ir = new String[]{"iré","irás","irá","iremos","iréis","irán"};

        String pVerb = verbo.substring(0, verbo.length()-2);
        String sVerb = verbo.substring(verbo.length()-2,verbo.length() );

        return switch (sVerb) {

            case "ar" -> forgeVerb(pVerb, ar);
            
            case "er" -> forgeVerb(pVerb, er);
            
            case "ir" -> forgeVerb(pVerb, ir);

            default -> null;
        };
    }


    static String[] conjugarPresente(String verbo){

        final String[] ar = new String[]{"o","as","a","amos","áis","an"};
        final String[] er = new String[]{"o","es","e","emos","éis","en"};
        final String[] ir = new String[]{"o","es","e","imos","ís","en"};
        
        // 12345
        // 01234
        // Viv

        //pVerb = Viv
        //sVerb = ir

        String pVerb = verbo.substring(0, verbo.length()-2);
        String sVerb = verbo.substring(verbo.length()-2,verbo.length() );



        return switch (sVerb) {

            case "ar" -> forgeVerb(pVerb, ar);
            
            case "er" -> forgeVerb(pVerb, er);
            
            case "ir" -> forgeVerb(pVerb, ir);

            default -> null;
        };
    }


}
