#include<stdio.h>

int main()
{ 
int i,j;
	int r1,c1,sum=0;
	int a[r1][c1];
	
	printf("Enter row and column of first matrix : ");
	scanf("%d%d",&r1,&c1);
			
	printf("\nEnter  %d X %d Matrix : ",r1,c1);
	
	for(i=0;i<r1;i++)
	{ 
	 for(j=0;j<c1;j++)
	 {
	 	scanf("%d",&a[i][j]);
	 }
	}
	
	  for(i=0;i<r1;i++)
		{
		sum = 0; 
		 for(j=0;j<c1;j++)
		 {
		   sum = sum + a[i][j];
//		   printf("\nSum = %d",sum);
		 }
	  printf("\nsum of row %d is %d",i+1,sum);
		}
		 
		
}
