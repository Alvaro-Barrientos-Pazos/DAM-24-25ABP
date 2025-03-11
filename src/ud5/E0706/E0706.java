package ud5.e0706;

public class E0706 {
    public static void main(String[] args) {
        

        Texto text = new Texto(5);

        text.addLeadingLetter('A');
        text.addLeadingLetter('B');
        text.addTrailLetter('C');
        text.addString("EZ");
        text.addString("HGF");
        text.addLeadingLetter('0');

        System.out.println("nVocals: "+text.countVocals());

        System.out.println(text.toString());

    }
}
