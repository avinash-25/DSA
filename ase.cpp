#include<stdio.h>
#include<stdlib.h>
struct node 
{
	int data;
	struct node *next,*prev;
};
int main()
{
	struct node *start=NULL;
	struct node *temp;
	struct node *temp1,*temp2;
	struct node *newnode;
	int choice=1;
	while(choice==1)
{
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("enter data : ");
	scanf("%d",&newnode->data);
	newnode->next=NULL;
	newnode->prev=NULL;
	if (start==NULL)
	{
		start=newnode;
		temp=newnode;
	}
	else
	{
		temp->next=newnode;
		newnode->prev=temp;
		temp=newnode;	
	}
	printf("Add more? :");
	scanf("%d",&choice);
}
temp=start;
while(temp!=NULL)
{
	printf("\n data is %d",temp->data);
	temp=temp->next;
}
int pos,i=1;
//	printf("\nenter position: ");
//	scanf("%d",&pos);
newnode=(struct node*)malloc(sizeof(struct node));
	printf("enter data : ");
	scanf("%d",&newnode->data);
	newnode->next=NULL;
	if (start==NULL)
	{
		start=newnode;
		temp=newnode;
	}
	else
	{
		temp=start;
while(temp->next!=NULL)
{
	temp=temp->next;
}
temp->next=newnode;
newnode->prev=temp;
temp=newnode;
}
    printf("\nAfter insertion  at begin");    

temp=start;
while(temp!=NULL)
{
	printf("\n data is %d",temp->data);
	temp=temp->next;
	
}
}

