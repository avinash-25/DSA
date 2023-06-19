#include<stdio.h>
#include<stdlib.h>
struct node{
		int data;
		struct node *next;
	};
int main()
{
	
	
	struct node *temp,*start = NULL,*newnode;
	int num=1,var,flag;
	

		while(num)
	{
		newnode = (struct node*)malloc(sizeof(struct node *));
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
	
		printf("\nPress 1 to continue: ");
        scanf("%d",&num);
}
     printf("Enter data to find :- ");
     scanf("%d",&var);
     temp = start;
     
     
     while(temp != NULL)
     { 
       if(temp->data == var){
         flag=1;
        //break;
    }

         temp =  temp->next; 
	 
}
	 
	 if(flag==1)
	  printf("Element found");
	 else
	  printf("Element not found");
	
}

