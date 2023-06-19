#include<stdio.h>
int main()
{
	int n ,a[10],i,sl,max;
	sl=max=0;
	printf("enter the total no of element : ");
	scanf("%d" ,&n);
	printf("enter array elements : ");
	for(i=0;i<n;i++)
		scanf("\n%d",&a[i]);
		for(i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				sl=max;
				max=a[i];
			}
			else if (a[i]<max && a[i]>sl)
			{
				sl=a[i];
			}
		}
			printf("Second Largest element in the array : %d",sl);
	}
