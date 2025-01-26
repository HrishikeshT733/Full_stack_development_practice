#include<stdio.h>
#include<conio.h>
int main() {
	int iage;
	printf("Enter ur age: ");
	scanf_s("%d", &iage);
	if (iage >= 18) {
		printf("u r eligible for voting");
	}
	else {
		printf("u r not eligible for voting");
	}
	_getch();
	return 0;
}