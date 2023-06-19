#include<stdio.h>
void main()
{
	int n ,a[6],c,i,j,temp,flag;
	printf("enter the total no of element : ");
	scanf("%d" ,&n);
	printf("enter array elements : ");
	for(i=0;i<n;i++)
		scanf("\n%d",&a[i]);
	for(i=0;i<n-i;i++)
	{
		flag=0;
		for(j=0;j<n-i-1;j++)
		{
		
		if(a[j]>a[j+1])
		{
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			flag=1;
		}
	}
	if(flag==0)
	break;
	}
	printf("Bubble Sort \n");
		for(i=0;i<n;i++)
	printf("%d ",a[i]);
}

