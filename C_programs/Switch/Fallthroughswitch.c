#include<stdio.h>
#include<conio.h>
int main() {
	char ch;
	printf("Enter a char");
	scanf_s("%c", &ch);
	switch (ch) {
	    case'a':
	    case'e':
		case'i':
		case'o':
		case'u':
		case'A':
		case'E':
		case'I':
		case'O':
		case'U':
			printf("Its an vowel");
				break;
		default:
			printf("Its not an vowel");
	}
	_getch();
	return 0;
}