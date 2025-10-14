
import java.util.Scanner;

public class Q25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        int a = sc.nextInt();

        String result = getOctal(a);
        System.out.println("HCH is: "+result);
    }
    

    public static String getOctal(int a) {
        String oct = "";

        while (a > 0) {
            oct = a % 8 + oct;
            a /= 8;
        }
        return oct;
    }
}
