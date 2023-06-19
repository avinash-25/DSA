#include<stdio.h>
#include<stdlib.h>
struct node
{

	int data;
	struct node *next;

};
struct node *new_node;
struct node *top;
struct node *temp;


void push()
{
	    new_node=(struct node*) malloc(sizeof(struct node));
        printf("enter data : ");
        scanf("%d",&new_node->data);
        new_node->next=top;
        top=new_node;
        printf("data inserted %d",new_node->data);
	
}


void pop()
{
	struct node *item;
    item=new_node;
    printf("data deleted %d",item->data);
    top=top->next;
    free(item);
    

}

void display()
   { 
   temp=top; 
	while(temp!=NULL)
	{
		
	    printf("\nData is %d",temp->data);
        temp=temp->next;
		
	}
   }
int main()
{
	int s;
	printf("Operations on stack using Linked List");
	here:
	printf("\n1 Insert an element");
	printf("\n2 Delete an element");
	printf("\n3 Display the elements");
	printf("\n4 exit \n");
	printf("\nEnter your choice");
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
		     printf("Enter valid choice");
		     
	}
	goto here;
}


