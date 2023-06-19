#include<stdio.h>     
int queue[3];
int n=10;
int rear=-1;
int front=-1;

void enqueue()
{
	int x;
	printf("\nenter the element : ");
	scanf("%d",&x);
	if(rear==n-1)
	printf("queue overflow");
	else if(rear==-1&&front==-1)
	{
		front=0;
		rear=0;
		queue[rear]=x;
		printf("\nElement Inserted %d",queue[rear]);

	}
	else
	{
		rear++;
		queue[rear]=x;
		printf("\nElement Inserted %d",queue[rear]);

	}
}

void dequeue()
{
	if(rear==-1&& front==-1)
	printf("queue is empty");
	else if(front==rear)
	{
		printf("\ndeleted item is %d",queue[front]);
		front=rear=-1;
	}
	else
	{
		printf("deleted item is %d",queue[front]);
		front++;
	}
}

void display()
{
	printf("Elements are : ");
	for(int i=front;i<=rear;i++)
	printf("\n%d ",queue[i]);	
}


int main()
{
	int s;
	printf("Operations on Queue using Array");
	here:
		printf("\n1 Insert");
		printf("\n2 delete");
		printf("\n3 display");
		printf("\n4 Exit");
		printf("\nEnter your choice : ");
		scanf("\n%d",&s);
		switch(s)
		{
			case 1:
				enqueue();
				break;
			case 2:
				dequeue();
				break;
			case 3:
			    display();
				break;
			case 4:
			    return 1;
			default:
			printf("enter valid choice ");	
		}
		goto here;	
}
