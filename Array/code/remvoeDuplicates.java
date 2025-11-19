class removeDuplicates {
    public static void main(String[] args) {
        int a[] = { 12, 2000, 12, 18, 15, 18, 12, 12 };
        removeDuplicate(a);

    }

    public static void removeDuplicate(int[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int count = 1;

            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                    a[j] = a[n - 1];
                    n--;
                    j--;
                }
            }
            int arr[] = new int[n];
            for (int k = 0; k < n; k++) {
                arr[k] = a[k];
            }

            for (i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }

        }
    }
}