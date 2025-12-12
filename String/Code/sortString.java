public class sortString {
    public static void main(String[] args) {
        String s = "ZZZYYEEAAABBBBDDDDEEE";

        frequency(s.toLowerCase());

    }

    public static void frequency(String s) {
        int[] frq = new int[26];

        String res = "";

        for (int i = 0; i < s.length(); i++) {
            frq[s.charAt(i) - 97]++;
        }

        for (int i = 0; i < frq.length; i++) {
            while (frq[i]-- > 0) {
                res = res + (char) (i + 97);
            }
        }
        System.out.println("String Sorted : " + res);
    }

}
