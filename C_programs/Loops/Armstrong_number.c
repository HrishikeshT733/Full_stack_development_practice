#include<stdio.h>
#include<conio.h>
int main() {
	int inum1, irem, iarm = 0, itemp;
	printf("Enter any number: ");
	scanf_s("%d", &inum1);
	itemp = inum1;
	while (inum1 != 0) {
		irem = inum1 % 10;
		iarm = iarm + (irem * irem * irem);
		inum1 = inum1 / 10;
		
		}
	if (iarm == itemp) {
		printf("Number is armstrong number ");
	}
	else {
		printf("Number is not armstrong number ");
	}
	_getch();
	return 0;
}
