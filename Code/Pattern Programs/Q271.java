/*

*/
import java.util.Scanner;
class Q271{
	public static void main(String[] args) {
       		 Scanner sc=new Scanner(System.in);
     		 System.out.println("Enter the Rows: ");
     		 int n=sc.nextInt();
      		 printPattern(n);
 	 }
	public static void printPattern(int n){
		int mid=n/2+1; int sSpace=n/2;		int eStar=2*n+mid;
		int midSStar=n+2;	int midEStar=2*n-1;
		for(int i=1;i<=n;i++){
			//Part-1
			for(int j=1;j<=mid;j++){
				if(j<=sSpace)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			//part-2
			for(int j=mid+1;j<=n+1;j++){
				if(i==1 || j==n+1 && i<=mid)
					System.out.print("@ ");
				else
					System.out.print("  ");
			}
			//Part-3
			for(int j=n+2; j<=2*n-1;j++){
				if(i>mid && j>=midSStar && j<=midEStar)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			//Part-4
			for(int j=2*n;j<=5*n/2;j++){
				if(i==1 || j==2*n && i<=mid)
					System.out.print("@ ");
				else
					System.out.print("  ");
			}
			//part-5
			for(int j=2*n+mid;j<=eStar;j++){
				System.out.print("* ");
			}
		if(i<mid){
			sSpace--;	eStar++;
		}else{
			sSpace++;	eStar--;
		}
		if(i>mid){
			midSStar++;	midEStar--;
		}
		System.out.println();
		}

	}

}













