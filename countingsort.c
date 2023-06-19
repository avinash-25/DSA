#include<stdio.h>
void main()
{
	int n,i,max;
	printf("enter the total no of element : ");
	scanf("%d" ,&n);
	 int a[n];
	printf("enter array elements : ");
	for(i=0;i<n;i++)
	scanf("\n%d",&a[i]);
		  
	   printf("The array is ");
    for (i=0; i<n; i++){
   	printf("%d ", a[i]);
    }
max=a[0];
for(i=0;i<n;i++)
{
	if(a[i]>max)
	{
		max=a[i];
	}
}
	int count[max+1]; 
  for (i = 0; i <= max; i++)   
  {  
    count[i] = 0; 
  }  
	for(i=0;i<n;i++)
	{
		count[a[i]]++;
	}
		for(i=1;i<=max;i++)
    {
	count[i]=count[i]+count[i-1];	
	}
	int output[n];
	 for(i=n-1;i>=0;i--)
	
	{
		output[count[a[i]]-1]=a[i];
		count[a[i]]--;
	}
	   for(i = 0; i<n; i++) {  
      a[i] = output[i]; 
  }
    printf("\nThe sorted array is ");
  
	for (i = 0; i < n; i++)  
        {
		printf("%d ", a[i]);  	}
}
	
