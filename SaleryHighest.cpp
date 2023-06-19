

#include <stdio.h>

struct stud {
	int rno;
	float salary;
	int name[10];
};
int main()
{
	struct stud s[5];
	int n;
	printf("enter the no of students : ");
	scanf("%d",&n);
	for(int i=0;i<n;i++)
	{
	
	printf("enter the rollno : ");
	scanf("%d",&s[i].rno);
	printf("enter name : ");
	scanf("%s",&s[i].name);
	printf("enter salary : ");
	scanf("%f",&s[i].salary);
}


	for(int i=0;i<n;i++)
{
	printf("\n rollno is %d",s[i].rno);
	printf("\n name is %s",s[i].name);
	printf("\n salary is %f",s[i].salary);
	
}
    float max=s[0].salary;int i;
	for(i=0;i<n;i++)
{
	
	if(s[i].salary>max)
	{
	max=s[i].salary;
	}
}
printf("\n Salery is highest that is %f ",max);


}
