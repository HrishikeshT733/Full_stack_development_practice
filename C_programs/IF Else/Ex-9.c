#include<stdio.h>
#include<conio.h>
int main() {
	char ch;
	printf("Enter any alphabet");
	scanf_s("%c", &ch);
	if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		printf("Its an vowel");
	}
	else if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
		printf("Its an vowel");
	}
	else {
		printf("Its an consonant");
	}
	_getch();
	return 0;
}