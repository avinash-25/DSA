#include<stdio.h>
void main()
{
	int n ,a[6],c,i,mid,lb,ub;
	printf("enter the total no of element : ");
	scanf("%d" ,&n);
	printf("enter array elements : ");
	for(i=0;i<n;i++)
		scanf("\n%d",&a[i]);
	printf("enter the value to be searched : ");
	scanf("%d",&c);
	lb=0;
	ub=n-1;
	mid=(lb+ub)/2;
	while(lb<=ub)
	{
		if(a[mid]<c)	
		lb=mid+1;
	else if(a[mid]==c)
	{
		printf("%d no found at location %d",c,mid+1);
		break;
	}
	else
	ub=mid-1;
mid=(lb+ub)/2;
}
if(lb>ub)
printf("the no not found",i);
}

