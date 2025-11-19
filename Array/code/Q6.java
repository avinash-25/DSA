public class Q6 {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 3, 6 };

        buildResult(arr);
    }

    public static int sumOfArr(int[] a) {
        int sum = 0;
        for (int x : a) {
            sum += x;
        }
        return sum;
    }

    public static void buildResult(int[] arr) {
        int sum = sumOfArr(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(sum - arr[i] + " ");
        }

    }
}
