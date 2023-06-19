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
	if(r1==c1)
	{
		{
	  for(int i=0;i<r1;i++)
		{ 
		 for(int j=0;j<c1;j++)
		 {
			if(i==j)
			{
			if(a[i][j]==1)
			{
		flag=1;
		else 
		flag=0;
	}
}
else
{
	  printf("\nNumber of rows and columns are not same.");
}

if(flag==1){
	printf("matrix is identity");
}
	else
	printf("matrix is not identity");
}
}
