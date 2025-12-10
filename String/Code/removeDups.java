public class removeDups {
    public static void main(String[] args) {
        String s = "AaBbcfsdSs";

        frequency(s.toLowerCase());

    }

    public static void frequency(String s) {
        int[] frq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            // char c = s.charAt(i);
            // frq[c]++;
            frq[s.charAt(i) - 97]++;
        }

        String res = "";

        for (int i = 0; i < frq.length; i++) {
            if (frq[i] > 0) {
                res = res + (char) (i + 97);
            }
        }
        System.out.println("Result is : " + res);
    }

}
