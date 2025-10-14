public class Program12 {
    public static void main(String[] args) {
        int result = getSum(50);
        System.out.println("Sum of all number is : "+result);
    }
    

    public static int getSum(int n) {
        if (n > 1) {
            return n + getSum(n - 1);
        }
        else {
            return n;
        }
    }
}
