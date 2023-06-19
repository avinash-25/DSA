#include<stdio.h>
#include<stdlib.h>

int main()
{
	int n ,*p,sum=0;
	printf("enter size of array : ");
	scanf("%d",&n);
	    printf("Enter %d elements into the array:\n", n);

	p=(int*)malloc(n*sizeof(int));

	for(int i=0;i<n;i++)
		scanf("%d",p+i);
		for(int i=0;i<n;i++)
		{
			sum+=*(p+i);
		}
		free(p);
		printf("\nthe sum of elements using malloc is : %d",sum);
		
}
