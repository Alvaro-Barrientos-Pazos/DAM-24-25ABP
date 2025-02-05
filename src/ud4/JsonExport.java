package ud4;

public class JsonExport {
    public static void main(String[] args) {
        String abc = "ABCD";
        String asd = "AABC";
        String bsd = "BABC";
        String zvc = "ZZBC";

        System.out.println(asd.compareTo(abc));
        System.out.println(asd.compareTo(zvc));
        System.out.println(abc.compareTo(zvc));
        System.out.println(bsd.compareTo(zvc));
        System.out.println(zvc.compareTo(abc));
        System.out.println(zvc.contains("C"));
    }
}
