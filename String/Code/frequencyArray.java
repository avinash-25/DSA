public class frequencyArray {
    public static void main(String[] args) {

    }

    public static void frequency(String s) {
        int[] frq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 65 && c <= 90)
                frq[c - 65]++;
            else if (c >= 97 && c <= 122)
                frq[c - 97]++;
        }
    }

}
