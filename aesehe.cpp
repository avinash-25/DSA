#include<stdio.h>
#include<stdlib.h>
struct stud {
	int rno;
	int name[10];
	float marks;
};
int main(){
	struct stud s[3];
	int n;
	printf("enter the n o of students");
	scanf("%d",&n);
	for(int i =0;i<n;i++)
	{
		printf("enter rno");
		scanf("%d",&s[i].rno);
		printf("enter name");
				scanf("%s",&s[i].name);

		printf("enetr marsk");
				scanf("%f",&s[i].marks);

	}
	for(int i =0;i<n;i++)
	{
		printf("name is %s",s[i].name);	
		printf("name is %d",s[i].rno);
		printf("name is %f",s[i].marks);
		
}
}

