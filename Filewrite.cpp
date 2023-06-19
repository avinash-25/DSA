#include<stdio.h>
#include <cstring>
int main(){
	FILE *fp;
	fp=fopen("f1.txt","w");
	char str[]="Hello Prachiiiiii";
	for(int i=0;i<strlen(str);i++){
		fputc(str[i],fp);
	}	fclose(fp);
		
	
	printf("file is created");
}
