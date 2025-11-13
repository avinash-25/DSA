import java.util.*;

class UserMainCode {
    /**
     * Rearranges the characters in a string based on a custom priority:
     * 1. Max Frequency (Descending)
     * 2. Digit > Uppercase > Lowercase
     * 3. Lexicographical order (Ascending)
     * * @param i1 The length of the string (unused in this implementation but kept for signature)
     * @param i2 The input string containing digits, uppercase, and lowercase letters
     * @return The rearranged string
     */
    public String rearrangeString(int i1, String i2) {
        StringBuilder res = new StringBuilder();
        Map<Character, Integer> fm = new HashMap<>();

        // 1. Calculate frequencies
        for (char c : i2.toCharArray()) {
            fm.put(c, fm.getOrDefault(c, 0) + 1);
        }

        while (!fm.isEmpty()) {
            // 2. Find max frequency
            int mf = Collections.max(fm.values());

            // 3. Collect all characters with max frequency
            List<Character> cand = new ArrayList<>();
            for (char c : fm.keySet()) {
                if (fm.get(c) == mf) {
                    cand.add(c);
                }
            }

            // 4. Sort candidates based on priority rules
            Collections.sort(cand, (a, b) -> {
                // Digit > Non-Digit
                if (Character.isDigit(a) && !Character.isDigit(b)) return -1;
                if (!Character.isDigit(a) && Character.isDigit(b)) return 1;

                // Uppercase > Lowercase (only if both are letters)
                if (Character.isUpperCase(a) && Character.isLowerCase(b)) return -1;
                if (Character.isLowerCase(a) && Character.isUpperCase(b)) return 1;

                // Lexicographical order (default tie-breaker)
                return a.compareTo(b);
            });

            // 5. Append batch to result
            for (char c : cand) {
                res.append(c);
            }

            // 6. Decrement frequencies and remove if count is zero
            for (char c : cand) {
                int f = fm.get(c) - 1;
                if (f == 0)
                    fm.remove(c);
                else
                    fm.put(c, f);
            }
        }

        return res.toString();
    }
}

// Wrapper class to run the code
class Solution {
    public static void main(String[] args) {
        UserMainCode code = new UserMainCode();
        
        String input1 = "aBcCdDeE12312";
        String output1 = code.rearrangeString(input1.length(), input1);
        System.out.println("Input: " + input1);
        System.out.println("Output: " + output1); 
        // Expected Output: 112233AaBbCcDdEe (Each char count is 1 or 2, max freq is 2. 
        // Digits (1,2) come first, then Uppercase (A,B), then Lowercase (a,b). All sorted lexicographically.)

        System.out.println("---");

        String input2 = "AabbbCC11";
        String output2 = code.rearrangeString(input2.length(), input2);
        System.out.println("Input: " + input2);
        System.out.println("Output: " + output2); 
        // Counts: b=3, C=2, 1=2, A=1, a=1. Max freq is 3 (b). 
        // 1st batch (Freq 3): b
        // 2nd batch (Freq 2): 1, 1, C, C (Digits 1,1 first, then Upper C,C)
        // 3rd batch (Freq 1): A, a (Upper A first, then Lower a)
        // Expected Output: b11CCAa
    }
}