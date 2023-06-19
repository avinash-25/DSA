//to tell the size of file
#include<stdio.h>
#include <cstring>
int main(){
	FILE *fp;
	long int c;
	fp=fopen("f1.txt","w");
    c=ftell(fp);
    printf(%d,c);
		
	
	printf("file is created");
}
