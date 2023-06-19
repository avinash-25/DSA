#include <stdio.h>
main(){
    int n, i, max;
    printf("Enter size of array: ");
    scanf("%d", &n);
    int a[n];
    printf("Enter array elements: ");
    for(i=0; i<n; i++){
   	scanf("%d", &a[i]);
    }
    printf("The array is ");
    for (i=0; i<n; i++){
   	printf("%d ", a[i]);
    }
    max=a[0];
    for(i=0; i<n-1; i++){
    	if(a[i]>max){
        	max=a[i];
    	}
    }
    int count[max+1];
    for(i=0; i<=max; i++){
    	count[i]=0;
    }
    for(i=0; i<n; i++){
    	count[a[i]]++;
    }
    for(i=1; i<=max; i++){
    	count[i]+=count[i-1];
    }
    int sort[n];
    for(i=n-1; i>=0; i--){
    	sort[count[a[i]]-1]=a[i];
    	count[a[i]]--;
    }
    for(i=0; i<n; i++){
    	a[i]=sort[i];
    }
    printf("\nThe sorted array is ");
    for (i=0; i<n; i++){
   	 printf("%d ", a[i]);
}}
