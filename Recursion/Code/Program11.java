
import java.util.Scanner;

public class Program11 {

    static Scanner sc = new Scanner(System.in);
    static int big = 0;

    public static void main(String[] args) {
        
        getBig();
        System.out.println("Biggest NUmber is : "+big);
    }

    public static void getBig() {
        System.out.println("Enter the number : ");
        int a = sc.nextInt();
        big = big > a ? big : a;

        System.out.println("Press y/y to continue... ");
        char c = sc.next().charAt(0);

        if (c == 'y' || c == 'Y') {
            getBig();
        }

    }
}
