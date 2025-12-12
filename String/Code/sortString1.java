public class sortString1 {
    public static void main(String[] args) {
        String s = "abcAbCZzYsSwqJfBlOhJd";

        sort(s);

    }

    public static void sort(String s) {
        int[] up = new int[26];
        int[] low = new int[26];

        String res = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 65 && c <= 90)
                up[c - 65]++;
            else if (c >= 97 && c <= 122)
                low[c - 97]++;
        }

        for (int i = 0; i < 26; i++) {
            while (up[i]-- > 0)
                res = res + (char) (i + 65);
            while (low[i]-- > 0)
                res = res + (char) (i + 97);

        }
        System.out.println("String Sorted : " + res);
    }

}
