#include <stdio.h>
void counting_sort(int a[],int n,int pos)
{
    int count[10]={0};
    for(int i=0;i<n;i++)
    {
        count[(a[i]/pos)%10]++;
    }
    for(int i=1;i<10;i++)
    {
        count[i]=count[i]+count[i-1];
    }
    int o[n];
    for(int i=n-1;i>=0;i--)
    {
        o[count[(a[i]/pos)%10]-1]=a[i];
        count[(a[i]/pos)%10]--;
    }
    for(int i=0;i<n;i++)
a[i]=o[i];    
}
int main() {
    int a[10],n,max;
    printf("enter the no of elements : ");
    scanf("%d",&n);
    printf("enter the array elements : ");
    for(int i=0;i<n;i++)
    scanf("%d ",&a[i]);
    max=a[0];
    for(int i=0;i<n;i++)
{
    if(a[i]>max)
    {
        max=a[i];
    }
}
    int pos;
    for(pos=1;max/pos>0;pos=pos*10)
    {
        counting_sort(a,n,pos);
    }
    printf("Sorted array: ");
    for(int i=0;i<n;i++){
        printf("%d ",a[i]);
    }
}

