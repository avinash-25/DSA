import java.util.Scanner;
public class Q3{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to print Table : ");

        int num = sc.nextInt();
        
        printTable(num);
    }

    public static void printTable(int n) {
        int i = 1;
        if (i <= 10) {
            printTable(n * i++);
            System.out.println(n);
        }
        
    }

}
