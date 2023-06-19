#include<stdio.h>
int main()
{
	int a[10],n,count=0,flag[10];
	printf("enter thye size of elements : ");
	scanf("%d",&n);
	printf("enter array elemnts |: ");
	for(int i=0;i<n;i++)
	scanf("%d",&a[i]);
	for(int i=0;i<n-1;i++)
	{
		for(int j=i+1;j<n;j++)
		if(a[i]==a[j])
		{
			flag[count]=a[j];
			count++;
		}
	}
	for(int i=0;i<count;i++)
	printf(" %d ",flag[i]);
}
	
