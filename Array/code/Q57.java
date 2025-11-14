class Q57 {
    public static void main(String[] args) {
        int a[] = { 7, 8, 6, 6, 7, 10, 10, 7, 7, 5, 6, 8 };
        int max = generateFrequencyArray(a);
        System.out.println("Maxm Element are : " + max);

    }

    public static int generateFrequencyArray(int[] a) {
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
        int maxm = -1;
        int val = 0;
        for (int i = 0; i < frq.length; i++) {
            if (frq[i] > maxm) {
                maxm = frq[i];
                val = i + min;
            }
        }
        System.out.println("Element is : " + val);
        return maxm;

    }
}