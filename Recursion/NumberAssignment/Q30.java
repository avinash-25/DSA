import java.util.Scanner;

public class Q30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");

        int n = sc.nextInt();

        System.out.println("Enter r : ");

        int r = sc.nextInt();

        int res = getCombinatio(n, r);
        System.out.println("Combinations are : "+res);

    }

    public static int getCombinatio(int n, int r) {
        if (r > n) {
            System.out.println("Selection  are not possible");
            return 0;
        }

        int comb = 1;
        
        for(int i = 0; i< r;i ++)
            comb = comb * (n - i)/(i+1);
        return comb;
    }

}



/**
 import java.util.Scanner;
public class Q30{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");

        int n = sc.nextInt();
        
        System.out.println("Enter r : ");

        int r = sc.nextInt();
        int numerator = getFactorial(n);

        int denominator = getFactorial(n - r);

        int rFact = getFactorial(r);
        
        System.out.println("Number of Combination: "+numerator/(rFact*denominator));
    }

    public static int getFactorial(int n) {
        if(n > 0)
            return n * getFactorial(n - 1);
        else
            return 1;
    }

}
 */
