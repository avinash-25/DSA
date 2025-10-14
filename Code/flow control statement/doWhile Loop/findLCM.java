//! Write a java prgram to print a LCM of three numbers

import java.util.Scanner;

class LCM{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter the Third Number : ");
        int c  = sc.nextInt();

        int lcm = findLCM(a, b, c);
        System.out.println("LCM is : "+lcm);
        
    }

//todo:  Best Approach

   public static int findLCM(int a, int b, int c){
        int lcm = 0;
        int biggestNum = (a>b && a>c)? a : (b>c && b>c)? b : c;

        for(int i=biggestNum; ;i+=biggestNum){
            if(i%a == 0 && i%b == 0 && i%c == 0){
                lcm = i;
                return i;
            }
        }
    }
}
 
 //? Not efficient way
/**
    public static int findLCM(int a, int b, int c){
        int lcm = 0;

        for(int i=1; ;i++){
            if(i%a == 0 && i%b == 0 && i%c == 0){
                lcm = i;
                return i;
            }
        }
    }
 */
