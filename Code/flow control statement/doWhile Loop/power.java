import java.util.Scanner;

class Power{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        do { 
           System.out.println("Enter first number : ");
           int a = sc.nextInt();
           System.out.println("Enter second number : ");
           int b = sc.nextInt();
           System.out.println("Power of "+a+" to the "+b+" is "+getPower(a,b));
           System.out.println("If you want to continue then enter 'y' or 'Y'....!!");
           ch = sc.next().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }

    public static int getPower(int a, int b){
            int value = 1;
            for(int i=1; i<= b ; i++){
                value *= a;
            }
            return value;
        }
}