#include<stdio.h>
int main()
{ 
int i,j;
	int r1,c1,sum=0;
	int a[10][10];
	
	printf("Enter row and column of matrix : ");
	scanf("%d%d",&r1,&c1);
			
	printf("\nEnter  %d X %d Matrix : ",r1,c1);
	
	for(i=0;i<r1;i++)
	{ 
	 for(j=0;j<c1;j++)
	 {
	 	scanf("%d",&a[i][j]);
	 }
	}
	printf("\nThe Diagonals elements of a matrix are :: \n\n");
	if(r1==c1)
	{
		for(i=0;i<r1;i++)
	{ 
	 for(j=0;j<c1;j++)
	 {
	 	
	if(i==j)
	{
		printf("%d",a[i][j]);
	}
	else
	printf("\t");
}
}
}
}
