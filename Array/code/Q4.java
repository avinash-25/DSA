public class Q4 {

    public static void main(String[] args) {
        String[] arr = { "apple", "cat", "hello", "world", "Avinash" };

        printLengths(arr);
    }

    public static void printLengths(String[] arr) {
        int max = -1;
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= max) {
                max = arr[i].length();
                str = arr[i];
            }
        }
        System.out.println("Largest String : " + str);
        System.out.println("Length : " + max);
    }
}
