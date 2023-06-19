#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
        struct node *prev;

};

int main()
{
	int choice=1;
	struct node *new_node;
	struct node *start = NULL;
	struct node *tail=NULL;
	struct node *temp;



	while(choice==1)
   {
      
       new_node=(struct node*) malloc(sizeof(struct node));
       printf("enter data : ");
       scanf("%d",&new_node->data);     
       new_node->next=NULL;
       new_node->prev=NULL;

       
       if(start==NULL)
       {
       		start=new_node;
        	tail=new_node;                           //creation of node
        	new_node->next=start;
        	new_node->prev=start;

       }
       else
       {
       		tail->next=new_node;
       		new_node->prev=tail;
         	new_node->next=start;  
			start->prev=new_node;     
            tail=new_node;
       }
   
      printf("do you want to add new node : ");
      scanf("%d",&choice);
   }
    printf("\nData before insertion");

   temp=start; 
   while (temp->next!=tail->next)
   {
		printf("\nData is %d",temp->data);                                //traversing and printing 
    	temp=temp->next;
   }
   printf("\nData is %d",temp->data);  
   

   new_node=(struct node*)malloc(sizeof(struct node));
   printf("\nEnter Data");
   scanf("%d",&new_node->data);
   new_node->next=start;
   new_node->prev=tail;
   tail->next=new_node;
   start->prev=new_node;
   start=new_node;
   
   
   printf("\nData after insertion at Beginning ");
   
   temp=start; 
   while (temp->next!=tail->next)
   {
		printf("\nData is %d",temp->data);                                //traversing and printing 
    	temp=temp->next;
   }
   printf("\nData is %d",temp->data);  
}
