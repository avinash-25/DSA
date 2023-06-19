#include<stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node *next;
};

int main()
{
	struct node *tail=NULL;
	struct node *temp;
	struct node *newnode;
	struct node *prev;
	int choice=1;
	
	while(choice==1)
	{
		newnode=(struct node*)malloc(sizeof(struct node));
		printf("\nEnter data : ");
		scanf("%d",&newnode->data);
		newnode->next=NULL;
		if(tail==NULL)
		{
			tail=newnode;
			newnode->next=tail;
		}
		else
		{
			newnode->next=tail->next;
			tail->next=newnode;
			tail=newnode;
		}
		printf("Do you want to add any choice : ");
		scanf("%d",&choice);
	}
	
	printf("\nData before Deletion:  ");
	temp=tail->next;
	while(temp->next!=tail->next)
	{
		printf("\ndata is : %d",temp->data);
		temp=temp->next;
	}
	printf("\nData is : %d",temp->data);
	

	temp=tail->next;
	while(temp->next!=tail->next)
	{
		prev=temp;
		temp=temp->next;
	}
	prev->next=tail->next;
	tail=prev;
	free(temp);
		printf("\nData after Deletion:  ");
	temp=tail->next;
	while(temp->next!=tail->next)
	{
		printf("\ndata is : %d",temp->data);
		temp=temp->next;
	}
	printf("\nData is : %d",temp->data);
	
}
	
	

