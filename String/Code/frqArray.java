public class frqArray {
    public static void main(String[] args) {
        String s = "ahjb@3%$*&!123@";

        frequency(s);

    }

    public static void frequency(String s) {
        int[] frq = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            frq[c]++;
        }

        for (int i = 0; i < frq.length; i++) {
            if (frq[i] > 0) {
                System.out.println((char) i + " " + frq[i] + " times");
            }
        }
    }

}
