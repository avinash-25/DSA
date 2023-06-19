#include<stdio.h>
struct stud
{
	int rno;
	int a[10];
	float marks;
	
};
int main()
{
	struct stud s1;
	struct stud *ptr;
	ptr=&s1;
	printf("enter rno : ");
	scanf("%d",&ptr->rno);
	printf("enter name : ");
	scanf("%s",&ptr->a);
	printf("enter marks : ");
	scanf("%f",&ptr->marks);
	printf("\nrno is %d",ptr->rno);
	printf("\nname is %s",ptr->a);
	printf("\nmarks is %f",ptr->marks);
	
}
