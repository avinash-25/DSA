
#include<stdio.h>
#include<stdlib.h>

struct node
{
	int data ;
	struct node *next;
};
int main()
{
	int choice=1,swap=0;
	struct node *newNode;
	struct node *temp;
	struct node *secondNode;
    struct node *start=NULL;


	while(choice)
	{
	newNode=(struct node*)malloc(sizeof(struct node));
	printf("Enter data : ");
	scanf("%d",&newNode->data);
	newNode->next=NULL;
	if(start==NULL)
	{
		start=newNode;
		temp=newNode;
	}
	else
	{
		temp->next=newNode;
	    temp=newNode;
	}
	
	printf("Press 1 to add new Node else Press 0 : ");
	scanf("%d",&choice);
}       

       printf("\n\nData Before sort :- ");
     temp=start;
	while(temp!=NULL)
	{
		printf("\nData is -> %d",temp->data);
		temp=temp->next;
	}
	temp=start;
	
	while(temp!=NULL)
	{
		secondNode=temp->next;
		while(secondNode!=NULL)
		{
		if(temp->data>secondNode->data) 
		{
			swap=temp->data;
			temp->data=secondNode->data;
			secondNode->data=swap;
	    }
			secondNode=secondNode->next;
	    }
		temp=temp->next;
	}
		printf("\nData after sort :- ");

	     temp=start;
	while(temp!=NULL)
	{
		printf("\nData is -> %d",temp->data);
		temp=temp->next;
	}
}
	

