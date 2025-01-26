#include<stdio.h>
#include<conio.h>
int main() {
	char cnum1;
	printf("Enter char or number");
	scanf_s("%c", &cnum1);
	if (cnum1>=65 && cnum1 <=90) { //for capital letters
		printf("its an alphabet");
	}
	else if (cnum1 >= 97 && cnum1 <= 122) {//for small letters
		printf("its an alphabet");
	}
	else if(cnum1 >= 48 && cnum1 <= 57) {//for numbers
		printf("its a number or special character");
	}
	_getch();
	return 0;
}