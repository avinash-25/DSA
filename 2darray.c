#include<stdio.h>
void main()
{
		int i,j,r,c,a[6][6];
	printf("enter the rows : ");
	scanf("%d" ,&r);
	printf("enter the coloumns : ");
		scanf("%d" ,&c);
	printf("enter array elements : ");
	for(i=0;i<r;i++)
	{
		for(j=0;j<c;j++)
		{
			scanf("\n%d",&a[i][j]);
		}
	}
	
		  
	printf("The array is \n");
    for (i=0; i<r; i++){
    	
   		for(j=0;j<c;j++)
		{
			
			printf("\t%d",a[i][j]);
		}
		printf("\n");
    }
}

