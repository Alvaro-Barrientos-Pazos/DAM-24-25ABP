package ud2.funciones.recursivas;

public class testing {

    public static String reverse(String str) {
        // Base case: if the string is empty or has only one character, return the string itself
        if (str.isEmpty()) {
            return str;
        }
        // Recursive case: reverse the substring and add the first character to the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello"));  // Output: "olleh"
    }

}
