
import java.util.Scanner;

public class Q24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        int a = sc.nextInt();

        String result = getDecimal(a);
        System.out.println("HCH is: "+result);
    }
    

    public static String getDecimal(int n) {
        int dec = 0;
        int twoMultiple = 1;

        while (n > 0) {
            int rem = n % 10;
            if (rem > 1)
                return "Invalid input";

            dec = dec + twoMultiple * rem;

            n /= 10;
            twoMultiple *= 2;

        }
        return "Decimal value is " + dec;
    }
}
