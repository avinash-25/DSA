#include<stdio.h>
int main()
{ 
int i,j;
	int r1,c1,flag=0,k=0;
	int a[10][10];
	
	printf("Enter row and column of matrix : ");
	scanf("%d%d",&r1,&c1);
	for(i=0;i<r1;i++)
	{ 
	 for(j=0;j<c1;j++)
	 {
	 	 printf("Enter the value for a[%d][%d] : ",i,j);
	 	scanf("%d",&a[i][j]);
	 }
	}
for(int i=0;i<r1;i++)
		{ 
		 for(int j=0;j<c1;j++)
			{
		if(a[i][j]!=0)
		flag++;
	}
}
int m[3][flag];
 
	  for(int i=0;i<r1;i++)
		{ 
		 for(int j=0;j<c1;j++)
			{
				if(a[i][j]!=0)
			{
					m[0][k]=i;
				m[1][k]=j;
				m[2][k]=a[i][j];
				k++;
			}
           }
        }               
             printf("row triplet form :\n");
             {
             	 for(int i=0;i<3;i++)
		{ 
		 for(int j=0;j<flag;j++)
			{
				printf("%d ",m[i][j]);
			}
			printf("\n");
}
}
}



