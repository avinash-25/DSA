import java.util.Scanner;
public class Q2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");

        int num = sc.nextInt();
        
        getNum(num);
    }

    public static void getNum(int n) {
        if (n >= 1) {
            System.out.println(n);
            getNum(n - 1);
        }
    }

}
