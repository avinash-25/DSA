public class Fibonacci {
    static int[] fibMemory;

    public static void main(String[] args) {
        int n = 45;

        fibMemory = new int[n + 1];
        fibMemory[0] = 0;
        fibMemory[1] = 1;

        int val = fib(n);

        System.out.println(n + " th fibonacci term is " + val);
    }

    public static int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        if (fibMemory[n] != 0)
            return fibMemory[n];

        fibMemory[n] = fib(n - 1) + fib(n - 2);

        return fibMemory[n];
    }

}
