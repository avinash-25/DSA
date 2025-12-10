public class getMax {
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

        char max = s.charAt(0);
        int freq = 1;

        for (int i = 0; i < frq.length; i++) {
            if (frq[i] > freq) {
                max = (char) (i + 97);
                freq = frq[i];
            }
        }
        System.out.println("Maximum times occurance is : " + max);
    }

}
