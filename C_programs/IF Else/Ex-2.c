#include<stdio.h>
#include<conio.h>
int main() {
	int inum1, inum2;
	printf("Enter ur both numbers: ");
	scanf_s("%d%d", &inum1,&inum2);
	if (inum1 >inum2) {
		printf("first number is greater than second");
	}
	else {
		printf("second number is greater than first");
	}
	_getch();
	return 0;
}