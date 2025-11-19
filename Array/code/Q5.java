public class Q5 {

    public static void main(String[] args) {
        String[] arr = { "apple", "cat", "hello", "world", "abcd" };

        printLengths(arr);
    }

    public static void printLengths(String[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() % 2 == 0) {
                count++;
                System.out.println(arr[i] + " ");
            }
        }
        System.out.println("Count is : " + count);
    }
}
