public class Q46 {
    static int OrignalArr[] = { 5, 5, 5, 5, 5, 5, 5 };

    public static void main(String[] args) {

        int num = secondSmallest(OrignalArr);
        System.out.println("Second Smallest number is : " + num);

    }

    public static int secondSmallest(int[] a) {
        int small = Integer.MAX_VALUE;
        int secondSmall = small;

        for (int x : a) {
            if (x < small) {
                secondSmall = small;
                small = x;
            } else if (x < secondSmall && x != small) {
                secondSmall = x;
            }
        }

        if (secondSmall != Integer.MAX_VALUE)
            return secondSmall;
        else
            return small;
    }
}
