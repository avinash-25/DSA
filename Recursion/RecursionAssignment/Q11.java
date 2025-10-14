
import java.util.Scanner;

public class Q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        if(a < 0)
            a = -a;

        int reverseNum = getReverse(a,0);
        System.out.println("Total Sum : "+reverseNum);
    }
    

    public static int getReverse(int a,int rev) {
        if (a == 0)
            return rev;
        rev = rev * 10 + (a % 10);
        return getReverse(a / 10, rev);
    }
}
