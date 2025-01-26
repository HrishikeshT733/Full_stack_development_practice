#include "Header.h"
int main() {
	char* str;
	str = (char*)(malloc(sizeof(char)));
	printf("enter a sentence \n");
    gets(str);
	int len = 0;
	for (int i = 0;i < strlen(str);i++) {
		if (str[i] == 32) {
			len++;
		}
	}
	printf("No of words in a sentence is %d", strlen(str) - len);
	free(str);
	
}