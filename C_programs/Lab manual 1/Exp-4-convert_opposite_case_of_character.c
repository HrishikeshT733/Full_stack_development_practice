#include<stdio.h>
#include<conio.h>
int main() {
	char ch;
	printf("Enter any character: ");
	scanf_s("%c", &ch);
	if (ch >= 65 && ch <= 90)//range of ascii value of Uppercase of alphabets
	{
		ch = ch + 32;
		printf("Given alphabet opposite case is: %c", ch);
	}
	else if (ch >= 97 && ch <= 122)//range of ascii value of Lowecase of alphabets
	{
		ch = ch - 32;
		printf("Given alphabet opposite case is: %c", ch);
	}
	else {
		printf("Invalid input this is not an alphabet");
	}
	_getch();
	return 0;
}