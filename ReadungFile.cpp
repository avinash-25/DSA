#include<stdio.h>
#include <cstring>
int main(){
	FILE *fp;
	char ch;
	fp=fopen("f2.txt","r");
	ch=fgetc(fp);
    while(!feof)
    {
	printf("%c",ch);
	ch=fgetc(fp)
	}	
		printf("file is created");
}
