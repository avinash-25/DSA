public class firstNonRepeating {
    public static void main(String[] args) {
        String s = "AAABBBBDDDDEEE";

        frequency(s.toLowerCase());

    }

    public static void frequency(String s) {
        int[] frq = new int[26];
        boolean flag = false;

        for (int i = 0; i < s.length(); i++) {
            frq[s.charAt(i) - 97]++;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (frq[c - 97] == 1)
                flag = true;
        }
        if (flag)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }

}
