class Program1 {
    public static void main(String[] args) {

        String s1 = "abcdE";

        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(1, 4));

        System.out.println(s1.contains("cd"));

        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }

        char[] c = s1.toCharArray();

        for (char ch : s1.toCharArray()) {
            System.out.print(ch + " ");
        }
    }
}
