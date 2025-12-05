public class Palindrome {
    public static void main(String[] args) {
        String s1 = "Madam";
        String s2 = "racear";

        if (isPalindrome(s2))
            System.out.println("It is palindrome");
        else
            System.out.println("It is not palindrome");

        if (isPalindrome(s1))
            System.out.println("It is palindrome");
        else
            System.out.println("It is not palindrome");
    }

    public static boolean isPalindrome(String s) {
        return new StringBuilder(s).reverse().toString().equalsIgnoreCase(s);
    }
}
