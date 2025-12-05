
import java.util.Scanner;

class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a : ");
        int a = sc.nextInt();

        System.out.println("Enter b : ");
        int b = sc.nextInt();
        if (a < 0)
            a = -a;

        int result = getHCF(a, b);
        System.out.println("HCH is: " + result);
    }

    public static int getHCF(int a, int b) {
        if (b == 0)
            return a;

        return getHCF(b, a % b);
    }
}
