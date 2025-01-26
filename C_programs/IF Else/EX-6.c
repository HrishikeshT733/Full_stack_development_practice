#include<stdio.h>
#include<conio.h>
int main() {
	int inum1;
	printf("Enter any number ");
	scanf_s("%d", &inum1);
	if (inum1 > 1 && inum1 < 100) {
		printf("number is in range");
    }
	else {
		printf("number is not in range");
	}
	_getch();
	return 0;
}