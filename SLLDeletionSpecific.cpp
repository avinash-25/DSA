
#include <stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};

int main()
{
	int pos;int i=1;
   int choice=1;
    struct node *new_node;
    struct node *temp1;
       struct node *start=NULL;
       struct node *temp;
           struct node *prev_node;

   while(choice)
   {
      
       new_node=(struct node*) malloc(sizeof(struct node));
       printf("enter data : ");
       scanf("%d",&new_node->data);
       new_node->next=NULL;
       if(start==NULL)
       {
         start=new_node;                             //creation of node
           temp=new_node;
       }
       else
       {
           temp->next=new_node;
           temp=new_node;
       }
   
      printf("do you want to add new node : ");
      scanf("%d",&choice);
   }
   printf("Data before Deletion : ");
   temp=start;
   while (temp!=NULL)
   {
    printf("\nData is %d",temp->data);                                //traversing and printing 
    temp=temp->next;
   }
 printf("\nEnter the position  to delete : ");
           scanf("%d",&pos);
   
   temp=start;
   while (i<pos-1)
   {
   temp=temp->next;
   i++;
   }
   temp1=temp->next;
   temp->next=temp1->next;
   free(temp1);
    
    printf("Data after Deletion at pos %d",pos);
    temp=start;
   while (temp!=NULL)
   {
    printf("\nData is %d",temp->data);                                //traversing and printing 
    temp=temp->next;
   }
}
