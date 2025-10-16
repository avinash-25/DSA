import java.util.Scanner;

public class PascalTringle{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");

        int n = sc.nextInt();

        printPascalTringle(n);

    }

    public static void printPascalTringle(int n) {
        int space = n;

        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            
            getPascalRow(i);
            space--;
            System.out.println();



        }
    }
    
        public static void getPascalRow(int n) {
        int comb = 1;
        System.out.print("    "+comb);

        for (int i = 0; i < n; i++) {
            comb = comb * (n - i) / (i + 1);
            System.out.print("    "+comb);
        }
    }

}



