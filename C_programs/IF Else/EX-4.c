#include<stdio.h>
#include<conio.h>
int main() {
	int iage;
	char cgen;
	printf("Enter ur gender and age: ");
	scanf_s("%c", &cgen);
	scanf_s("%d", &iage);
	if (iage >= 60) {
		if (cgen =='f') {
			printf("9.75 Interest rate");
		}
		else {
			printf("9.5 Interest rate");
		}
	}
	else {
		printf("8.0 Interest rate");
	}
	_getch();
	return 0;
}