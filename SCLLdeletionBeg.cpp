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
	struct node *tail=NULL;
		struct node *temp;

	while(choice==1)
   {
       new_node=(struct node*) malloc(sizeof(struct node));
       printf("enter data : ");
       scanf("%d",&new_node->data);     
       new_node->next=NULL;
       
       if(tail==NULL)
       {
         tail=new_node;                           //creation of node
         new_node->next=tail;
       }
       else
       {
       		new_node->next=tail->next;
       		tail->next=new_node;
                
            tail=new_node;
       }
   
      printf("do you want to add new node : ");
      scanf("%d",&choice);
   }
  printf("\nData before Deletion : ");
   temp=tail->next;
    
   while (temp->next!=tail->next)
   {
    printf("\nData is :  %d",temp->data);                                //traversinga nd printing 
    temp=temp->next;
   }
   printf("\nData is %d",temp->data);  
   
       temp=tail->next;
       tail->next=temp->next;
       free(temp);
       
      printf("\nData after deletion : ");
   temp=tail->next;
    
   while (temp->next!=tail->next)
   {
    printf("\nData is %d",temp->data);                                //traversinga nd printing 
    temp=temp->next;
   }
   printf("\nData is %d",temp->data); 
   
}
