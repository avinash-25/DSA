public class Sorting {

    public static void main(String[] args) {

        int[] a = { 8, 6, 8, 5, 5, 8, -2, 5, 5, 5, 5, 5, 6, 10, 8, 7, 5 };

        System.out.print("\nOriginal Array: ");
        printArray(a);

        // ? 1. Bubble Sort

        int[] b1 = a.clone();
        System.out.println("\n1. BUBBLE SORT:");
        bubbleSort(b1);
        printArray(b1);

        // ? 2. Selection Sort

        int[] b2 = a.clone();
        System.out.println("\n2. SELECTION SORT:");
        selectionSort(b2);
        printArray(b2);

        // ? 3. Insertion Sort

        int[] b3 = a.clone();
        System.out.println("\n3. INSERTION SORT:");
        insertionSort(b3);
        printArray(b3);

        // ? 4. Merge Sort

        int[] b4 = a.clone();
        System.out.println("\n4. MERGE SORT:");
        mergeSort(b4, 0, b4.length - 1);
        printArray(b4);

        System.out.println();
    }

    public static void printArray(int[] a) {
        for (int val : a) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // ! Merge Sort
    public static void mergeSort(int[] a, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;

            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);

            merge(a, start, mid, end);
        }
    }

    public static void merge(int[] a, int start, int mid, int end) {
        int[] merged = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (a[i] <= a[j])
                merged[k++] = a[i++];
            else
                merged[k++] = a[j++];
        }

        while (i <= mid)
            merged[k++] = a[i++];
        while (j <= end)
            merged[k++] = a[j++];

        for (int x = 0; x < merged.length; x++) {
            a[start + x] = merged[x];
        }
    }

    // ! Insertion Sort
    public static void insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
    }

    // ! Selection Sort
    public static void selectionSort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = a[minIndex];
            a[minIndex] = a[i];
            a[i] = temp;
        }
    }

    // ! Bubble Sort
    public static void bubbleSort(int[] a) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }
}

// ? second loop condition (j < n - 1 - i)
/*
 * Because in every iteration loop will run -1 times less then previous one
 * because afterwards elements are already sorted
 *
 */