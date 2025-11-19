class storePalindrome {
    public static void main(String[] args) {
        int n = 200;
        Soln(n);

    }

    public static int Soln(int n) {
        int[] primes = new int[n];
        int index = 0;

        for (int i = 2;; i++) {
            if (isPrime(i))
                primes[index++] = i;

            if (index >= n) {
                for (int x : primes)
                    System.out.println(primes[x] + " ");
                return 1;
            }

        }
    }

    public static boolean isPrime(int a) {
        if (a <= 1)
            return false;
        if (a == 2)
            return true;
        if (a % 2 == 0)
            return false;

        for (int i = 3; i * i <= a; i += 2) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

}