#include<stdio.h>
int main()
{ 
int i,j;
	int r1,c1,sum=0,flag;
	int a[10][10];
	
	printf("Enter row and column of matrix : ");
	scanf("%d%d",&r1,&c1);
	if(r1==c1)	
	{			
	printf("\nEnter  %d X %d Matrix : ",r1,c1);
		for(i=0;i<r1;i++)
	{ 
	 for(j=0;j<c1;j++)
	 {
	 	scanf("%d",&a[i][j]);
	 }
	}
	  for(int i=0;i<r1;i++)
		{ 
		 for(int j=0;j<c1;j++)
		 {
			if(i==j)
			{
		if(a[i][j]==1)
		flag=1;
		else 
		flag=0;
	}
}
}

if(flag==1){
	printf("matrix is identity");
}
	else
	printf("matrix is not identity");
}
else
{
	printf("rows and columns doesnt match");
}
}



