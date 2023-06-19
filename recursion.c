#include<stdio.h>
int binarysearch(int a[],int lb,int ub,int c )
{
		if(lb<=ub)
	{
		int mid=(lb+ub)/2;
		if(a[mid]<c)	
		    return binarysearch(a,mid+1,ub,c);
		
	    else if(a[mid]==c)
	        return mid;
       	else
        	return binarysearch(a,lb,mid-1,c);
    }
    else
        return -1;
}
int main()
{
	int arr[6],i,n,c;
	printf("enter the total no of element : ");
	scanf("%d" ,&n);
	printf("enter array elements : ");
	for(i=0;i<n;i++)
		scanf("\n%d",&arr[i]);
	printf("enter the value to be searched : ");
	scanf("%d",&c);
	int result = binarysearch(arr, 0,n-1,c);
	if(result == -1)
	printf("Element is not present in array");
	else
	printf("Element is present at index %d", result);
    return 0;
}


