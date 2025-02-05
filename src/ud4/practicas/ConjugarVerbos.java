package ud4.practicas;

import java.util.Arrays;

public class ConjugarVerbos {

    public static void main(String[] args) {
        conjugarTiempoVerbal("vivir","preterito Perfecto simple");
    }


    static String[] forgeVerb(String pVerb,String[] arr){
        String[] verbT = new String[6];
       
        for (int i = 0; i < arr.length; i++) {
            verbT[i]=pVerb+arr[i];
        } 
        
        return verbT;
    }


    static void printVerbs(String[] verbPresent){
        final String[] pronouns = new String[]{"Yo","Tú","É/Ella/Usted","Nosotros/Nostoras","Vosotros/Vosotras","Ellos/Ellas/Ustedes"};

        for (int i = 0; i < pronouns.length; i++) {
            System.out.println(pronouns[i]+" "+verbPresent[i]);
        }

    }


    static String[] conjugarTiempoVerbal(String verbo, String tiempoVerbal){
        
        final int P_SIMPLE = 0;
        final int PP_SIMPLE = 1;
        final int F_SIMPLE = 2;

        tiempoVerbal = tiempoVerbal.toLowerCase();

        int verbTime = -1;

        switch (tiempoVerbal) {
            case "presente simple":
                verbTime = P_SIMPLE;
                break;
            
            case "preterito perfecto simple":
                verbTime = PP_SIMPLE;
                break;

            case "futuro simple":
                verbTime = F_SIMPLE;
                break;
        
            default:
                return null;
        }


        switch (verbo.substring(verbo.length()-2, verbo.length())) {

            case "ar","er","ir":
                break;

            default:
                return null;
        }

        String[] result = null;

        if (verbTime == P_SIMPLE)
            result = conjugarPresente(verbo);
        else if (verbTime == PP_SIMPLE)
            result = conjugarPPsimple(verbo);
        else if (verbTime == F_SIMPLE)
            result = conjugarFsimple(verbo);

            printVerbs(result);
        
        return null;
    }


    static String[] conjugarPPsimple(String verbo){
        final String[] ar = new String[]{"é","aste","ó","amos","ásteis","aron"};
        final String[] er = new String[]{"í","iste","ó","imos","ísteis","eron"};

        String[] verbPP = new String[6];
        
        String pVerb = verbo.substring(0, verbo.length()-2);

        String[] verbSuffixes = null;

        switch (verbo.substring(verbo.length()-2, verbo.length())) {

            case "ar":
                verbSuffixes = ar.clone();
                break;
            
            case "er","ir":
                verbSuffixes = er.clone();
                break;

            default:
                return null;
        }

        for (int i = 0; i < verbPP.length; i++) {
            verbPP[i]=pVerb+verbSuffixes[i];
        }

        //System.out.println(Arrays.toString(verbPP));
        return verbPP;
    }


    static String[] conjugarFsimple(String verbo){
        final String[] ar = new String[]{"é","aste","ó","amos","ásteis","aron"};

        String[] verbPP = new String[6];
        String pVerb = verbo.substring(0, verbo.length()-2);

        for (int i = 0; i < verbPP.length; i++) {
            verbPP[i]=pVerb+ar[i];
        }

        //System.out.println(Arrays.toString(verbPP));
        return verbPP;
    }

    static String[] conjugarPresente(String verbo){

        final String[] ar = new String[]{"o","as","a","amos","áis","an"};
        final String[] er = new String[]{"o","es","e","emos","éis","en"};
        final String[] ir = new String[]{"o","es","e","imos","ís","en"};

        String[] verbPresent = new String[6];
        
        String pVerb = verbo.substring(0, verbo.length()-2);
        String sVerb = verbo.substring(verbo.length()-2, verbo.length());

        String[] verbSuffixes = null;

        if(sVerb.equals("ar")){
            verbSuffixes = ar.clone();
        }
        else if (sVerb.endsWith("er")){
            verbSuffixes = er.clone();
        }
        else if (sVerb.endsWith("ir")){
            verbSuffixes = ir.clone();
        }

        if (sVerb.isEmpty()){
            return null;
        }

        for (int i = 0; i < verbPresent.length; i++) {
            verbPresent[i]=pVerb+verbSuffixes[i];
        }

        //System.out.println(Arrays.toString(verbPresent));

        return verbPresent;
    }


}
