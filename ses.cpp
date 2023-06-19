
#include <stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
};

int main()
{
   int choice=1;
    struct node *new_node;
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
   temp=start;
   while (temp!=NULL)
   {
    printf("\nData is %d",temp->data);                                //traversing and printing 
    temp=temp->next;
   }
   temp=start;
   while (temp->next!=NULL)
   {
  
   prev_node=temp;
   temp=temp->next;
   prev_node->next=NULL;
   free(temp);
}
    printf("\nAfter Deletion at End");    
   temp=start;
   while (temp!=NULL)
   {
    printf("\nData is %d",temp->data);                                //traversing and printing 
    temp=temp->next;
   }
}

