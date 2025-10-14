
import java.util.Scanner;

public class Q26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        int a = sc.nextInt();

        String result = getDecimal(a);
        System.out.println("Result is: "+result);
    }
    

    public static String getDecimal(int a) {
        String dec = "";

        while (a > 0) {
            dec = a % 10 + dec;
            a /= 10;
        }
        return dec;
    }
}
