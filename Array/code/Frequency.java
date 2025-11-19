class Frequency {
    public static void main(String[] args) {
        int a[] = { 12, 2000, 12, 18, 15, 18, 12, 12 };
        generateFrequencyArray(a);

    }

    public static void generateFrequencyArray(int[] a) {
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
            System.out.println(a[i] + " is : " + count + " times");
        }
    }
}