#include<stdio.h>
#include <cstring>
int main(){
	FILE *fp;
	fp=fopen("f2.txt","w");
	char str[100];
	printf("enter a string : ");
	gets(str);
	for(int i=0;i<strlen(str);i++){
		fputc(str[i],fp);
	}	fclose(fp);
		
	
	printf("file is created");
}
