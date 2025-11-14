class RemoveDuplicates {
    public static void main(String[] args) {
        int a[] = { 7, 8, 6, 6, 5, 7, 10, 10, 7, 7, 5, 6, 8 };
        generateFrequencyArray(a);

    }

    public static void generateFrequencyArray(int[] a) {
        int max = a[0];
        int min = a[0];

        for (int x : a) {
            if (x > max)
                max = x;
            else if (x < min)
                min = x;
        }
        int[] frq = new int[max - min + 1];

        for (int x : a) {
            frq[x - min]++;
        }

        for (int i = 0; i < frq.length; i++) {
            if (frq[i] > 0)
                System.out.println(i + min);
        }
    }
}