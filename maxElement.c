#include<stdio.h>
void main()
{
	int n ,a[10],i,max=a[0];
	printf("enter the total no of element : ");
	scanf("%d" ,&n);
	printf("enter array elements : ");
	for(i=0;i<n;i++)
		scanf("\n%d",&a[i]);
		for(i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
	    }
			printf("Largest element in teh array : %d",max);
	} 

