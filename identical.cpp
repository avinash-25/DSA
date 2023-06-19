#include<stdio.h>
int main()
{

		int i,j,flag,r1,r2,c1,c2;

		printf("Enter row and column of first matrix : ");
	scanf("%d%d",&r1,&c1);
		printf("Enter row and column of second matrix : ");
	scanf("%d%d",&r2,&c2);
	if(r1==r2&&c1==c2)
	{
		int b[r2][c2],a[r1][c1];	
	printf("\nEnter  %d X %d Matrix : ",r1,c1);
		for(int i=0;i<r1;i++)
	{ 
	 for(int j=0;j<c1;j++)
	 {
	 	scanf("%d",&a[i][j]);
	 }
	}
	printf("Enter Second %d X %d Matrix : ",r2,c2);
	
	for(int i=0;i<r2;i++)
	{ 
	 for(int j=0;j<c2;j++)
	 {
	 	scanf("%d",&b[i][j]);
	 }
	}
    	
	{
	for(i=0;i<r1;i++)
	{
		for(j=0;j<c1;j++)
		{
			if(a[j][i]==b[i][j])
	           	flag =0;
		    else
	            flag =1;
		}
	}
}

if(flag==0){
	printf("matrix is identical");
}
	else
	printf("matrix is not identical");

}
else
{
	printf("rows and columns doesnt match");
}
}


