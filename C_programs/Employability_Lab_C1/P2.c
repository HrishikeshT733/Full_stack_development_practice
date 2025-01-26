#include<stdio.h>
#include<conio.h>
int main() {
	int iage;
	printf("Enter age of a user :");
	scanf_s("%d", &iage);
	if (iage < 18) {
		printf("No licence");
	}
	else {
		printf("Issue license");
	}
	_getch();
	return 0;
}
