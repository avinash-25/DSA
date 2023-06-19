#include<stdio.h>
void main()
{
	int n ,a[6],c,i,j,temp;
	printf("enter the total no of element : ");
	scanf("%d" ,&n);
	printf("enter array elements : ");
	for(i=0;i<n;i++)
		scanf("\n%d",&a[i]);
	for(i=1;i<n;i++)
	{
	temp=a[i];
	j=i-1;
		while(j>=0 && a[j]>temp)
		{
		
			a[j+1]=a[j];
			j=j-1;
		}
	a[j+1]=temp;
		
	}
		printf("Insertion Sort \n");
		for(i=0;i<n;i++)
	printf("%d ",a[i]);
}

