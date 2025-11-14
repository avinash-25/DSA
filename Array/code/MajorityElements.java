class majorElement {
    public int majorityElement(int[] a) {
        int max = a[0], min = a[0];

        for (int x : a) {
            if (x > max)
                max = x;
            else if (x < min)
                min = x;
        }
        int[] freq = new int[max - min + 1];

        for (int x : a) {
            freq[x - min]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > a.length / 2)
                return i + min;
        }
        return -1;
    }
}