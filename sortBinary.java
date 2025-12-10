class sortBinary {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 0 };

        sortBinaryDescending(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void sortBinaryDescending(int[] arr) {
        int ones = 0;

        for (int num : arr) {
            if (num == 1)
                ones++;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i < ones) ? 1 : 0;
        }
    }
}