import java.util.Scanner;

public class Q31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");

        int n = sc.nextInt();

        getPascalRow(n);

    }

    public static void getPascalRow(int n) {
        int comb = 1;
        System.out.print(comb+" ");

        for (int i = 0; i < n; i++) {
            comb = comb * (n - i) / (i + 1);
            System.out.print(comb+" ");
        }
    }

}



