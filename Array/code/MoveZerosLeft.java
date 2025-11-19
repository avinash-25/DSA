class MoveZerosLeft {
    public static void main(String[] args) {
        int a[] = { 0, 1, 2, 0, 0, 1, 0, 0 };
        Soln(a);

    }

    public static void Soln(int[] a) {
        int countZero = 0;
        for (int x : a) {
            if (x == 0)
                countZero++;
        }

        for (int i = 0; i < a.length; i++) {
            if (i < countZero)
                a[i] = 0;
            else
                a[i] = 1;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }
}