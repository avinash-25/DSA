import java.util.Scanner;
public class Q6{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");

        int num = sc.nextInt();
        
        int result = getSum(num);
        System.out.println("Sum of Squares : "+result);
    }

    public static int getSum(int n) {
        if(n == 1 )
            return 1;

        return n*n*n + getSum(n - 1);
        
    }

}
