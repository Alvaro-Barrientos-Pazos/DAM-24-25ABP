package ud5.e0706;

import java.time.LocalDate;

public class Texto {

    int maxLength;
    LocalDate creationDate;
    LocalDate modificationDate;
    String text = "";


    public Texto(int maxLength){
        this.maxLength = maxLength;
        creationDate = LocalDate.now();
        modificationDate = LocalDate.now();
    }


    public int addTrailLetter(char letter){
        if (text.length() < maxLength){
            text+= letter;
            modificationDate = LocalDate.now();
            return 0;
        }

        return -1;
            
    }


    public int addLeadingLetter(char letter){
        if (text.length() < maxLength){
            text = letter+text;
            modificationDate = LocalDate.now();
            return 0;
        }
        return -1;

    }

    public int addString(String string){
        if ((text.length() + string.length()) <= maxLength){
            text+= string;
            modificationDate = LocalDate.now();
            return 0;
        }
        return -1;

    }


    public int countVocals(){
        int counter = 0;

        String tmp = text.toLowerCase();

        for (int i = 0; i < tmp.length(); i++) {
            counter += switch (tmp.charAt(i)){
                case 'a','e','i','o','u' -> 1;
                default -> 0;
            };
        }

        return counter;
    }


    @Override
    public String toString() {
        return text;
    }



}
