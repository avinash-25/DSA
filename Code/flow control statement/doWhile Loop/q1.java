import java.util.Scanner;

class askToFindFactorial{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number to find factorial : ");
        n = sc.nextInt();
        char ch;
    }

    public static int fact(int n){
        do { 
            int value = 1;
            for(int i=1; i< n ; i++){
                value *= i;
            }
            System.out.println("factorial of "+n+" is "+value);
            value = 1;
            

        } while (ch == 'y' || ch == "Y");
    }
}