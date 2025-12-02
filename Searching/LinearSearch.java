public class LinearSearch {
    public static void main(String[] args) {
        int[] a = { 8, 20, 10, 15, 12, 30, 25, 40 };

        int key = 15;

        int index = search(a, key);

        if (index >= 0)
            System.out.println("Element Found at index : " + index);
        else
            System.out.println("Element Not Found");

    }

    public static int search(int[] a, int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key)
                return i;
        }
        return -1;
    }
}
