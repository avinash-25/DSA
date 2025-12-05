public class P9 {
    public static void main(String[] args) {
        String s1 = "Madam";

        System.out.println(getReverse(s1));
    }

    public static String getReverse(String s) {
        // StringBuilder sb = new StringBuilder(s);
        // sb.reverse();
        // return sb.toString();

        return new StringBuilder(s).reverse().toString();
    }
}
