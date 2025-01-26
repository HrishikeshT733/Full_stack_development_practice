#include"Header.h"
void accept1(char* ptr, int s){
	printf("Enter name");
	for (int i = 0;i < s;i++){
		scanf("%c", ptr + i);
	}

}