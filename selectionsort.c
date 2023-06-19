
#include <stdio.h>

int main() {
int a[10];
int n=5,min,i,j,temp;
printf("enter the total no of element : ");
	scanf("%d" ,&n);
	printf("enter array elements : ");
	for(i=0;i<n;i++)
		scanf("\n%d",&a[i]);
	for(i=0;i<n-1;i++)
    {
     min=i;
    for(j=i+1;j<n;j++)
    {
       if(a[j]<a[min]) 
       {
           min=j;
       }
    }
   
    if(min!=i)
    {
        temp=a[i];
        a[i]=a[min];
        a[min]=temp;
    }
    }
    	printf("Selection Sort \n");
     for(i=0;i<n;i++)
     printf("%d ",a[i]);

}
