public class reverseWord {
    public static void main(String[] args) {
        String s = "Java is      good    .";
        // * good is Java

        System.out.println(reverse(s));
    }

    public static String reverse(String s) {
        String word = "";
        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ')
                temp += c;
            if (c == ' ' || i == s.length() - 1) {
                word = temp + " " + word;
                temp = "";
            }
        }
        return word;
    }
}
