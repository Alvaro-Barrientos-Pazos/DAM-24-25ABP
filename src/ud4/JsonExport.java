import java.util.Arrays;

public class JsonExport {
    public static void main(String[] args) {
        String abcd = "ABCDZZZZ";
        String aabc = "AABC";
        String babc = "BABCZZZZ";
        String zzbc = "ZZBCAAAA";

        System.out.println(aabc.compareTo(abcd));
        System.out.println(aabc.compareTo(zzbc));
        System.out.println(abcd.compareTo(zzbc));
        System.out.println(babc.compareTo(zzbc));
        System.out.println(zzbc.compareTo(abcd));

        boolean result = babc.regionMatches(3, aabc, 3, 1);
        System.out.println(result);

        int charInt = ((int) abcd.charAt(0)) - abcd.compareTo(zzbc);

        System.out.println(abcd.charAt(0));
        System.out.println(Character.toChars(charInt));

        String test = "arranarcar";
        System.out.println(test.lastIndexOf("ar", test.length() - 2));

        System.out.println(test.startsWith("ar", test.length() - 2));

        int[] asd = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] asd2 = new int[9];
        int[][] arr = new int[][] {{2,3,1},{3,1,2},{1,3,2}};

        System.out.println("Yolo1");
        //Arrays.sort(arr);
        System.out.println("Yolo2");

        System.out.println(Arrays.toString(arr));

        System.arraycopy(asd, 0, asd2, 0, asd.length);

        System.out.println(Arrays.toString(asd2));

        System.arraycopy(asd, 5, asd2, 4, asd.length - 5);

        //asd2[asd.length - 1] = 0;
        asd2 = Arrays.copyOf(asd2,asd2.length-1);
        System.out.println(Arrays.toString(asd2));


        // Arrays.fill(asd, 123);
        // Arrays.fill(asd,0,5, 123);

        // int[]asd2 = new int[8];

        // int offset = asd2.length-asd.length;
        // System.arraycopy(asd, 0, asd2, offset, asd.length);
        // System.out.println(offset);
        // System.out.println(Arrays.toString(asd2));
    }
}
