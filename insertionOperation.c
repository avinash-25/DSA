#include<stdio.h>
void main()
{
	int n ,a[10],c,i,j,pos;
	printf("enter the total no of element : ");
	scanf("%d" ,&n);
	printf("enter array elements : ");
	for(i=0;i<n;i++)
		scanf("\n%d",&a[i]);
	printf("enter the element to be inserted: ");
	scanf("%d" ,&c);
	printf("enter the position to which element has to be inserted : ");
	scanf("%d" ,&pos);
		for(i=n-1;i>=pos;i--)
		{
			a[i+1]=a[i];
			
		}
			a[pos]=c;
			for(i=0;i<=n;i++)
	printf("%d ",a[i]);
}
	
