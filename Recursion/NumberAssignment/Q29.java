import java.util.Scanner;

public class Q29 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");

        int n = sc.nextInt();

        System.out.println("Enter r : ");

        int r = sc.nextInt();

        int res = getPermutation(n, r);
        System.out.println("Arrangements are : "+res);

    }

    public static int getPermutation(int n, int r) {
        if (r > n) {
            System.out.println("Arrangements are not possible");
            return 0;
        }

        int perm = 1;

        for(int i = 0; i< r;i ++)
            perm = perm * (n - i);
        return perm;
    }

}




/**
import java.util.Scanner;
public class Q29{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");

        int n = sc.nextInt();
        
        System.out.println("Enter r : ");

        int r = sc.nextInt();
        
        int numerator = getPermutation(n);

        int denominator = getPermutation(n - r);
        
        System.out.println("Number of arrangeents : "+numerator/denominator);
    }

    public static int getPermutation(int n) {
        if(n > 0)
            return n * getPermutation(n - 1);
        else
            return 1;
    }

}
 */
