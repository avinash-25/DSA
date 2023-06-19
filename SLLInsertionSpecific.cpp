
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
   while(choice==1)
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
   int pos; int i=1;
    printf("\nEnter the position  : ");
           scanf("%d",&pos);

     new_node=(struct node*) malloc(sizeof(struct node));
       printf("\nenter data : ");
       scanf("%d",&new_node->data);
       new_node->next=NULL;
       if(start==NULL)
       {
           start=new_node;
           temp=new_node;
       }
       else
       {
       	 temp=start;
       	
         while (i<pos-1)                         
           {
			   temp=temp->next;
             i++;
       }
           new_node->next=temp->next;
           temp->next=new_node;
 }
       
       printf("insertion at position %d",pos);                        //inserting at the end 
        temp=start;
   while (temp!=NULL)
   {
    printf("\nData is %d",temp->data);
    temp=temp->next;
   }
}

