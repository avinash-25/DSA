#include<stdio.h>
#include<stdlib.h>

int main()
{
	int n ,*p,sum=0,size,i,j;
	printf("enter size of array : ");
	scanf("%d",&n);
	printf("Enter %d elements into the array:\n", n);

	p=(int*)malloc(n*sizeof(int));

	for(i=0;i<n;i++)
		scanf("%d",p+i);
	
		for(i=0;i<n;i++)
			sum+=*(p+i);
		printf("\nthe sum of elements before reallocation is : %d",sum);
		printf("\nEnter the size you want to increase: ");
    scanf("%d",&size);
    p=(int *)realloc(p,size * sizeof(int));
    printf("\nEnter new elements: ");
    for(int j=i;j<n+size;j++){
        scanf("%d",p+j);
    }
    printf("\nAll Elements: ");
    for(j=0;j<n+size;j++){
        printf("%d ",*(p+j));
    }
  
    for(j=i;j<n+size;j++){
        sum+=*(p+j);
    }
    free(p);
    printf("\nSum of elements after reallocation: %d",sum);
    return 0;
		
}
