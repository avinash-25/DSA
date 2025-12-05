public class P5 {
    public static void main(String[] args) {
        String s1 = "cdc";
        String s2 = new String("cde");

        String s3 = "abcde";

        String s4 = s3.substring(2).intern(); // in heap
        // * intern : check in scp if exists then return their add if not then create a
        // * */ new then return their add.
        System.out.println(s1 == s2);
        System.out.println(s1 == s4);
        System.out.println(s2 == s4);

    }
}
