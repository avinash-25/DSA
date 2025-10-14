
import java.util.Scanner;

public class Power1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter a : ");
        int a = sc.nextInt();

         System.err.println("Enter b : ");
        int b = sc.nextInt();

        int result = getPower(a,b);
        System.out.println("Power of: "+a+" to : "+b+" is : "+result);
    }
    

    public static int getPower(int a, int b) {
        if(b>0)
            return a * getPower(a, --b);
        else
            return 1;
    }
}
