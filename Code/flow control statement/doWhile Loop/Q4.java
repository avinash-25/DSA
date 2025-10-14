import java.util.Scanner;

class Q4{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int sum = 0;

        do { 
            sum+= a;
           System.out.println("Enter number : ");
           a = sc.nextInt();
        } while (a != 0 && a > 0);

        System.err.println("Sum : "+sum);
    }
}