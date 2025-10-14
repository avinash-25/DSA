
import java.util.Scanner;

public class Q23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        int a = sc.nextInt();

        String result = getBinary(a);
        System.out.println("HCH is: "+result);
    }
    

    public static String getBinary(int a) {
        String bin = "";

        while (a > 0) {
            bin = a % 2 + bin;
            a /= 2;
        }
        return bin;
    }
}
