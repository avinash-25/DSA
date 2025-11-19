
class Q25 {
    public static void main(String[] args) {
        int OrignalArr[] = { 10, 20, 30, 40, 50, 60, 70 };

        boolean b = leftReverse(OrignalArr);
        System.out.println(b);
    }

    public static boolean leftReverse(int[] a) {
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
