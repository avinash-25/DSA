#include<stdio.h>
int main()
{ 
int i,j;
	int r1,c1,sum=0,flag=0;
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

	  for(int i=0;i<r1;i++)
		{ 
		 for(int j=0;j<c1;j++)
			{
		if(a[i][j]==0)
		flag++;
	}
}
int temp=(r1*c1)/2;
 int temp2 = r1*c1;
  
  if(temp2%2 == 0)
    {
    if(flag>=temp)
     printf("\nMatrix is sparse");
    else
     printf("\nMatrix is not sparce");
    }
  else
    {
     if(flag>temp)
     printf("\nMatrix is sparse");
    else
     printf("\nMatrix is not sparse");
	}

}



