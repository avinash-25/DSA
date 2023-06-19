

#include <stdio.h>

struct stud {
	int rno;
	float marks;
	int name[10];
};
int main()
{
	struct stud s1;
	printf("enter the rollno : ");
	scanf("%d",&s1.rno);
	printf("enter name : ");
	scanf("%s",&s1.name);
	printf("enter marks : ");
	scanf("%f",&s1.marks);
	printf("\n rollno is %d",s1.rno);
	printf("\n name is %s",s1.name);
	printf("\n marks is %f",s1.marks);


	
}
