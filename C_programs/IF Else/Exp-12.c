#include<stdio.h>
#include<conio.h>
int main() {
	int inum1;
	printf("Enter any number");
	scanf_s("%d", &inum1);
	inum1 % 2 ? printf("No is odd") : printf("No is even");
	_getch();
	return 0;
}