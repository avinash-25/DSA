import java.util.*;

class HappyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        HappyNumber obj = new HappyNumber();
        boolean result = obj.isHappy(n);

        System.out.println("Is Happy Number? " + result);
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = getSquareSum(slow); // move 1 step
            fast = getSquareSum(getSquareSum(fast)); // move 2 steps
        } while (slow != fast);

        return slow == 1; // if we stop at 1 → happy, else → loop
    }

    private int getSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }
}
