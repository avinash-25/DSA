public class ReverseString {
    public static void main(String[] args) {
        String s = "Mohan"; // *output: nahoM

        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        String rev = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            rev = c + rev;
        }
        return rev;
    }
}
