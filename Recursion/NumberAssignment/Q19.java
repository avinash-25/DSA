import java.util.Scanner;
public class Q19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hexadecimal to convert in to Decimal : ");

        int num = sc.nextInt();
        
        boolean res = checkAutomorphic(num);
        System.out.println(res);
    }

    public static boolean checkAutomorphic(int n) {
        String orignalVal = String.valueOf(n);
        int len = orignalVal.length();

        int val = n * n;

        String sqVal = String.valueOf(val);

        return true;
    }
}
