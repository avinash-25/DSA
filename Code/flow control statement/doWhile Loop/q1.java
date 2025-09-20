import java.util.Scanner;

class askToFindFactorial{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do { 
           System.out.println("Enter number to find factorial : ");
           int n = sc.nextInt();
           System.out.println("Fcatorial of "+n+" is "+fact(n));
           System.out.println("If you want to continue then enter 'y' or 'Y'....!!");
           ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }

    public static int fact(int n){
            int value = 1;
            for(int i=1; i<= n ; i++){
                value *= i;
            }
            return value;
        }
}