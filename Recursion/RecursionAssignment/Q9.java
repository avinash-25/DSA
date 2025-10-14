
import java.util.Scanner;

public class Q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int a = sc.nextInt();
        if(a < 0)
            a = -a;

        int count = getCount(a);
        System.out.println("Total Digit : "+count);
    }
    

    public static int getCount(int a) {
        if(a>0)
            return 1 + getCount(a / 10);
        else
            return 0;
    }
}
