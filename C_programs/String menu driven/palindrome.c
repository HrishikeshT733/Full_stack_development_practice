#include "Header.h"
void palindrome(char ptr[]) {
	char temp[SIZE];
	strcpy(temp,ptr);
	if(strcmp(temp,_strrev(ptr))==0){
		printf("string is palindrome");
	}
	else {
		printf("string is not palindrome");
	}
}