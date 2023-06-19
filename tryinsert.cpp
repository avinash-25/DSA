#include<stdio.h>
#include<stdlib.h>
int main()
{ 
 struct node{
 	int data,var;
 	struct node *next;
 };
 
 struct node *next,*newnode,*temp,*start = NULL,*x,*prev;
 int ch,y,val,flag=0;
 do{
 	newnode = (struct node *)malloc(sizeof(struct node));
 	printf("Enter data :- ");
 	scanf("%d",&newnode->data);
 	newnode->next = NULL;
 	
 	if(start == NULL)
 	{ 
 	 start = newnode;
 	 temp = start;
	 }
	 else
	 { 
	  temp->next = newnode;
	  temp = newnode;
	 }
	 printf("\nPress [1/0] : ");
	 scanf("%d",&ch);
 }while(ch==1);
 
  temp = start;
  printf("\nData before sort : - ");
	 while(temp != NULL)
	 { 
	  printf(" %d ",temp->data);
	  temp = temp->next;
	 }
	 
	 temp = start;
	 while(temp != NULL)
	 { 
	  x = temp->next;
	   while(x != NULL)
	   {
	   if(temp->data>x->data)
	   {
	   	y = temp->data;
	   	temp->data=x->data;
	   	x->data=y;
	   }
	   x=x->next;
	   }
	   temp=temp->next;
	 }
	printf("\ndata after Sort :- ");
	temp = start;
	while(temp != NULL)
	 { 
	  printf(" %d ",temp->data);
	  temp = temp->next;
	 } 
	 
	newnode = (struct node *)malloc(sizeof(struct node));
 	printf("\n\nEnter data to insert :- ");
 	scanf("%d",&val);
 	newnode->data = val;
 	newnode->next = NULL;
 	
 	temp = start;
 	while(temp != NULL)
 	{ 
 	  if(start->data> val)
	    { 	  	
	   	 newnode->next = start;
	   	 start = newnode;
	   	 flag=1;
	   	 break;
	    }
       else if(temp->data > val)
 	    { 
	 	 newnode->next = temp;
	 	 prev->next = newnode;
	 	 flag=1;
 	   break;
	    }
	     prev = temp;
	     temp = temp->next;
	     
	 }
	 
	 
	 if(flag==0)
	  {
	  	while(temp->next != NULL)
		 { 
		  temp = temp->next;
		 }
		 temp->next = newnode;
	  }
	 
	printf("\ndata after insert :- ");
	temp = start;
	while(temp != NULL)
	 { 
	  printf(" %d ",temp->data);
	  temp = temp->next;
	 }
 	
	 
	  
	
}
