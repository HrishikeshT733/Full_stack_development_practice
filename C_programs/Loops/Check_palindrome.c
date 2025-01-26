#include<stdio.h>
#include<conio.h>
int main() {
	int inum1, r, irev = 0,inum2;
	printf("Enter any number : ");
	scanf_s("%d", &inum1);
	inum2 = inum1;
	while (inum1 != 0) {
		r = inum1 % 10;
		irev = irev * 10 + r;// for printing reverse of that number
		inum1 = inum1 / 10;

	}
	if (irev == inum2) {
		printf("Number is palindrome");

	}
	else {
		printf("Number is not palindrome");
	}
	
	_getch();
	return 0;
}