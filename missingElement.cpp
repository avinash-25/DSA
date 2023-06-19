#include<stdio.h>
int main()
{
	int n,a[10];
	printf("enter the size of array :");
	scanf("%d",&n);
	printf("enter array elemnts: ");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	
int sum=0,temp=0;
for(int i=1;i<=n;i++)
{
	sum+=i; 
	
}
for(int i=0;i<4;i++) 
{
   temp+=a[i];	
}
printf("misssing element : %d",sum-temp); 


}


