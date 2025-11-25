public class Sorting {
    public static void main(String[] args) {

        int[] a = { 10, 8, 6, 4 };

        System.out.println("\n1. BUBBLE SORT..!\n");

        System.out.print("Elements are : ");
        for (int i : a) {
            System.out.print(i + " ");
        }
        bubbleSort(a);

        System.out.println("\n\n2. SELECTION SORT..!\n");
        selectionSort(a);

    }

    // ! Selection sort

    public static void selectionSort(int a[]) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            int min = a[i];
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < min) {
                    min = a[j];
                    minIndex = j;
                }
            }
            a[minIndex] = a[i];
            a[i] = min;
        }
        System.out.println();

        System.out.print("Elements are sorted : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    // ! Bubble sort

    public static void bubbleSort(int a[]) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < n - 1 - i; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    flag = false;
                }
            }
            if (flag)
                break;
        }
        System.out.println();

        System.out.print("Elements are sorted : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

// ? second loop condition (j < n - 1 - i)
/*
 * Because in every iteration loop will run -1 times less then previous one
 * because afterwards elements are already sorted
 * 
 */