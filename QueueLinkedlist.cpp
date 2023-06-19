#include<stdio.h>
#include<stdlib.h>
struct node
{

	int data;
	struct node *next;

};
struct node *new_node;
struct node *front=NULL;
struct node *rear=NULL;
struct node *temp;


void enqueue()
{
	    new_node=(struct node*) malloc(sizeof(struct node));
        printf("enter data : ");
        scanf("%d",&new_node->data);
        new_node->next=NULL;
        if(rear==NULL)
        {
        	front=new_node;
        	rear=new_node;
        	rear->next=NULL;
        	front->next=NULL;
        	printf("data inserted %d",new_node->data);

		}
		else
		{
		rear->next=new_node;
        rear=new_node;
        rear->next=NULL;
        printf("data inserted %d",new_node->data);
        }
	
}


void dequeue()
{
	struct node *item;
	item=front;
	if(front==rear)
	{
		printf("data deleted %d",item->data);
		front=NULL;
		rear=NULL;
		free(item)
	}
    else
    {
    printf("data deleted %d",item->data);
    front=front->next;
    free(item);
    }
}

void display()
   { 
   temp=front; 
	while(temp!=NULL)
	{
		printf("\nData is %d",temp->data);
        temp=temp->next;
	}
   }
   
   void peek()
   {
   			printf("\nData is %d",front->data);

   }
int main()
{
	int s;
	here:
	printf("\nEnter your choice");
	printf("\n1 Insert an element");
	printf("\n2 Delete an element");
	printf("\n3 Display the elements");
	printf("\n4 Display the first elements");
	printf("\n5 exit \n");
    scanf("\n %d",&s);
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
			peek();
			break;
		case 5:
			return 1;
		default:
		     printf("Enter valid choice");
		     
	}
	goto here;
}


