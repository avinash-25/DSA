import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = { 8, 20, 10, 15, 12, 30, 25, 40 };
        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        int key = 15;
        System.out.println("Key : " + key);

        int index = search(a, key);

        int index1 = searchUsingRecursion(a, key, 0, a.length - 1);

        if (index1 >= 0)
            System.out.println("Element Found at index using recursion : " + index);
        else
            System.out.println("Element Not Found using recursion");

        if (index >= 0)
            System.out.println("Element Found at index : " + index);
        else
            System.out.println("Element Not Found");

    }

    public static int search(int[] a, int key) {
        int start = 0;
        int end = a.length - 1;
        int mid = start + (end - start) / 2;

        while (start <= end) {
            if (a[mid] == key)
                return mid;
            else if (a[mid] > key)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static int searchUsingRecursion(int a[], int key, int start, int end) {

        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (a[mid] == key)
                return mid;
            else if (a[mid] > key)
                return searchUsingRecursion(a, key, start, mid - 1);
            else
                return searchUsingRecursion(a, key, mid + 1, end);
        }
        return -1;
    }
}
