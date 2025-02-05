
public class JsonExport {
    public static void main(String[] args) {
        String abcd = "ABCD";
        String aabc = "AABC";
        String babc = "BABC";
        String zzbc = "ZZBC";

        System.out.println(aabc.compareTo(abcd));
        System.out.println(aabc.compareTo(zzbc));
        System.out.println(abcd.compareTo(zzbc));
        System.out.println(babc.compareTo(zzbc));
        System.out.println(zzbc.compareTo(abcd));
    }
}
