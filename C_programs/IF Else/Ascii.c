#include<stdio.h>
#include<conio.h>
int main() {
	char ch;
	printf("Enter any character");
	scanf_s("%c", &ch);
	printf("%c \t%d", ch, ch);
	_getch();
	return 0;
}