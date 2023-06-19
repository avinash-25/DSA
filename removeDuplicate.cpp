#include<stdio.h>
int main()
{
	int a[10],n;
	printf("enter the size of array : ");
	scanf("%d",&n);
	printf("enter array elemnts : ");
	for(int i=0;i<n;i++)
	scanf("%d",&a[i]);
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){		
		if(a[i]==a[j]){
			for(int k=j;k<n-1;k++){
	              a[k]=a[k+1];
	           }
			n--;
			j--;
		}}}
	printf (" \n Array elements after deletion of the duplicate elements: ");  
		for(int i=0;i<n;i++)
		printf(" %d ", a[i]); 	
}
