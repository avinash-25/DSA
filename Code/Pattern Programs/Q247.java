/*

*/
import java.util.Scanner;
class Q247{
	public static void main(String[] args) {
       		 Scanner sc=new Scanner(System.in);
     		 System.out.println("Enter the Rows: ");
     		 int n=sc.nextInt();
      		 printPattern(n);
 	 }
	public static void printPattern(int n){
		int star=1;	int num=n*(n+1)/2;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=star;j++){
				if(i%2==1)
					System.out.printf("%-4d",num--);
				else
					System.out.printf("%-4d",num++);
			}
		if(i%2==1)
			num=num-i;
		else
			num=num-(i+1);
			
		star++;
		System.out.println();
		}
	}

}