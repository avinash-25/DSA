#include<stdio.h>
void main()
{
	int n ,a[10],c,i,j,pos;
	printf("enter the total no of element : ");
	scanf("%d" ,&n);
	printf("enter array elements : ");
	for(i=0;i<n;i++)
		scanf("\n%d",&a[i]);
	
		for(i=pos-1;i<n-1;i++)
		{
			a[i]=a[i+1];
	}
		n--;
	
		
	printf("Array after Deletion : ");	
	for(i=0;i<4;i++)
	printf("%d ",a[i]);
}
	
