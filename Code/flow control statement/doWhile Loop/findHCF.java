//! Write a java prgram to print a LCM of three numbers
/*
HCF can be either equal to or smaller than or less than that.
*/

import java.util.Scanner;

class HCF{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter the Third Number : ");
        int c  = sc.nextInt();

        int lcm = findHCF(a, b, c);
        System.out.println("LCM is : "+lcm);
        
    }

//todo:  Best Approach

   public static int findHCF(int a, int b, int c){
        int hcf = 1;
        int small = (a<b && a<c)? a : (b<c && b<c)? b : c;

        for(int i = small; ; i--){
            if(a%i == 0 && b%i == 0 && c%i == 0){
                hcf = i;
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
