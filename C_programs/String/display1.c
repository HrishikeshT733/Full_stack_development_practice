#include"Header.h"
void display1(char* ptr, int s) {
	printf("Name is :");
	for (int i = 0;i < s;i++) {
		printf("%c", *(ptr + i));
	}

}