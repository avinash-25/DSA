#include <stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node *next;
    struct node *prev;

    
};

int main()
{
   int choice=1,pos, i=1;
    struct node *new_node;
       struct node *start=NULL;
       struct node *tail;
       
   
      
       struct node *temp;
   while(choice)
   {
      
       new_node=(struct node*) malloc(sizeof(struct node));
       printf("enter data : ");
       scanf("%d",&new_node->data);
        new_node->prev=NULL;      
       new_node->next=NULL;
       if(start==NULL)
       {
         start=new_node;                           //creation of node
           temp=new_node;
       }
       else
       {
           temp->next=new_node;
           new_node->prev=temp;
           temp=new_node;
       }
   
      printf("do you want to add new node : ");
      scanf("%d",&choice);
   }
   printf("At which position data has to be deleted : ");
   scanf("%d",&pos);
  
   temp=start;
  
   while(i<pos)
   {
   	temp=temp->next;
   	i++;
   }
   
   
   temp->prev->next=temp->next;
    temp->next->prev=temp->prev;
   free(temp);
   
   printf("\nData after Deletion at position : %d",pos);
    temp=start;
   while (temp!=NULL)
   {
    printf("\nData is %d",temp->data);
    temp=temp->next;
   }
}
