
import java.util.Scanner;


public class Q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter Number to find factorial : ");
        int num = sc.nextInt();

        int result = getFactorial(num);
        System.out.println("Factorial of: "+num+" is : "+result);
    }
    

    public static int getFactorial(int n) {
        if (n < 0)
            return 0;
        if (n == 0)
            return 1;
        if (n > 1) {
            return n * getFactorial(n - 1);
        }
        else {
            return 1;
        }
    }
}
