public class P6 {
    public static void main(String[] args) {
        String s1 = "Madam";
        StringBuilder sb = new StringBuilder(s1);
        StringBuilder sb1 = sb.reverse();
        System.out.println(sb1);
        sb.deleteCharAt(2);
        System.out.println(sb);

    }
}
