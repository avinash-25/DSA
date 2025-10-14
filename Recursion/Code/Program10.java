
import java.util.Scanner;


public class Program10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int a = sc.nextInt();
        int big = a;
        char c;

        do {

            System.out.println("Enter the Next Number : ");
            int b = sc.nextInt();

            big = getBig(a, b);
            System.out.println("Press Y/y to continue : ");
            c = sc.next().charAt(0);

        } while (c == 'Y' || c == 'y');

        System.out.println("Biggest Number is : " + big);
    }

        public static int getBig(int n1,int n2){

            return n1>n2?n1:n2;
        }
}
