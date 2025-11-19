public class Q3 {

    public static void main(String[] args) {
        String[] arr = { "apple", "cat", "hello", "world" };

        printLengths(arr);
    }

    public static void printLengths(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Length of " + arr[i] + " is " + arr[i].length());
        }
    }
}