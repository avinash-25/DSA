#include<stdio.h>
	int n=9;
	int stack[10];
	int top=-1;
void push()
{
	
	int x;
	printf("\nenter the value to be inserted : ");
	scanf("%d",&x);
	if(top==n-1)
	printf("stack overflow");
	else
	{
	  top++;
	  stack[top]=x;
    }
      printf("%d Inserted",stack[top]);
}

void pop()
{
	int item;
	if(top == -1)
    printf("\nUnderflow");
    else
    {
    	item=stack[top];
     	top--;
    	printf("elemnt deleted %d",item);
    }
}

void display()
{
	 printf("items are : ");
     for(int i=top;i>=0;i--)
     printf("\n%d",stack[i]);
}
int main()
{
	int s;
	printf("Operations on stack using Array")
	here:
	printf("\n1 Insert an element");
	printf("\n2 Delete an element");
	printf("\n3 Display the elements");
	printf("\n4 exit \n");
	printf("\nEnter your choice : ");
    scanf("\n %d",&s);
	switch(s)
	{
		case 1:
			push();
			break;
		case 2:
			pop();
			break;
		case 3:
			display();
			break;
		case 4:
			return 1;
		default:
		     printf("enter valid choice");
		     
	}
	goto here;
}


