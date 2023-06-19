#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node *left;
	struct node *right;
};
struct node *insert()
{
	int x;
	struct node *newnode,*root=NULL;
	newnode=(struct node*)malloc(sizeof(struct node));
	printf("\nenter node data and if not press -1 : ");
	scanf("%d",&x);
	if(x==-1)
	{return 0;}
	newnode->data=x;
	newnode->left=NULL;
	newnode->right=NULL;
	printf("\nenter left child for %d ",x);
	
	newnode->left=insert();
	printf("\nenter right child for %d",x);
	
	newnode->right=insert();
    return newnode;
}
	
int main()
{
	struct node *root=NULL;
	root =insert();
}

