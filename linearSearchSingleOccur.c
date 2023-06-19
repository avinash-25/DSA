void main()
{
	int n ,a[10],c,i,flag=0;
	printf("enter the total no of element : ");
	scanf("%d" ,&n);
	printf("enter array elements : ");
	for(i=0;i<n;i++)
		scanf("\n%d",&a[i]);
	printf("enter the value to be searched : ");
	scanf("%d",&c);
		printf("Linear search with single  occurence ");
	for(i=0;i<n;i++)
	{
		if(a[i]==c)
		{
			printf("\n Number found at location :  %d",i);
			flag++;
		break;
		}
	}
		if(flag==0)
		{
			printf("Number not found");
		}
	}
