
import java.util.Scanner;

public class Q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        if(a < 0)
            a = -a;

        int digitSum = getCount(a);
        System.out.println("Total Sum : "+digitSum);
    }
    

    public static int getCount(int a) {
        int sum = 0;
        if(a>0)
            return (a%10) + getCount(a / 10);
        else
            return sum;
    }
}
