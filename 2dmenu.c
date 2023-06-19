#include<stdio.h>

int main()
{

	
	int i,j,d,k,c[2][2],m;
		int a[2][2]={1,2,3,4};
		int b[2][2]={5,6,7,8};

	printf("1 for sum\n"); 
	printf("2 for subtract\n"); 
	printf("3 for multiply\n"); 
	printf("enter your choice : ");
	scanf("%d",&d);    
switch(d){    
case 1:    

	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			c[i][j]=a[i][j]+b[i][j];
		}
	}
	
		 printf("the sum is : \n ");
		 	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
		printf("%d\t",c[i][j]);
		}
		printf("\n");    

	}



break;    
case 2:    
	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
			c[i][j]=a[i][j]-b[i][j];
		}
	}
	
		 printf("the difference is : \n");
		 	for(i=0;i<2;i++)
	{
		for(j=0;j<2;j++)
		{
		printf("%d\t",c[i][j]);
		}
		printf("\n");    

	}
break;    
case 3:    

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
break;    
default:    
printf("print valid choice");       

}
return m;  
}    
