#include<stdio.h>
void main()
{

		int i,j,c[2][2];
		int a[2][2]={1,2,3,4};
		int b[2][2]={5,6,7,8};
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	
		 printf("the sum is ");
		 	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
		printf("%d\t",c[i][j]);
		}
	}
}

