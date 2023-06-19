#include<stdio.h>
void main()
{
int i,j,k,c[2][2];
		int a[2][2]={1,2,3,4};
		int b[2][2]={5,6,7,8};
for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
		c[i][j]=0;    
for(k=0;k<2;k++)    
{    
c[i][j]+=a[i][k]*b[k][j];    
}    
		}
	}
	
		 printf("the multiply is :\n");
		 	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
		printf("%d\t",c[i][j]);
		}
		printf("\n");    

}

}
