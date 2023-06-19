

#include <stdio.h>

struct stud {
	int rno;
	float marks;
	int name[10];
};
int main()
{
	struct stud s[3];
	int n;
	printf("enter the no of students : ");
	scanf("%d",&n);
	for(int i=0;i<n;i++)
	{
	
	printf("enter the rollno : ");
	scanf("%d",&s[i].rno);
	printf("enter name : ");
	scanf("%s",&s[i].name);
	printf("enter marks : ");
	scanf("%f",&s[i].marks);
}
	for(int i=0;i<n;i++)
{
	printf("\n rollno is %d",s[i].rno);
	printf("\n name is %s",s[i].name);
	printf("\n marks is %f",s[i].marks);
	
}
}
