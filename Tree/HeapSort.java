public class HeapSort {
    public static void main(String[] args) {
        int[] a = { 10, 22, 20, 40, 20, 50, 48 };

        System.out.println("Before Heapify : ");

        for (int i : a) {
            System.out.print(i + " ");
        }

        maxheap(a);

        System.out.println();
        System.out.println("After Heap sort : ");

        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void maxheap(int[] a) {
        int n = a.length;
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(a, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            swap(a, 0, i);
            heapify(a, i, 0);
        }
    }

    public static void heapify(int[] a, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && a[left] > a[largest])
            largest = left;

        if (right < n && a[right] > a[largest])
            largest = right;

        if (largest != i) {
            swap(a, i, largest);
            heapify(a, n, largest);
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
