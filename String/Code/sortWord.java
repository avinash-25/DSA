
public class sortWord {
    public static void main(String[] args) {
        String[] arr = { "banana", "apple", "orange", "grape", "kiwi" };
        sort(arr);
        System.out.println("Sorted String is : ");

        for (String str : arr) {
            System.out.print(" " + str);
        }
    }

    public static void sort(String[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            boolean flag = true;

            for (int j = 0; j < n - 1; j++) {
                if (a[j].compareTo(a[j + 1]) > 0) {
                    String temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag)
                break;
        }
    }
}
