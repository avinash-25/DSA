public class Program14 {
    public static void main(String[] args) {
        int result = getSum(5);
        System.out.println("Sum of all number is : "+result);
    }
    

    public static int getSum(int n) {
        if (n > 1) {
            return n*(n+1) + getSum(n - 1);
        }
        else {
            return n*(n+1);
        }
    }
}
