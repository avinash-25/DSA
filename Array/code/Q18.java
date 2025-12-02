
class Q18 {
    public static void main(String[] args) {
        int OrignalArr[] = { 10, 20, 30, 40, 30, 20, 10 };

        boolean b = isPalindrome(OrignalArr);
        System.out.println(b);
    }

    public static boolean isPalindrome(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            if (a[start] != a[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
}
