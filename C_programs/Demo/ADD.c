#include<stdio.h>
#include<conio.h>//header file  included for getch()
int main()
{
	int inum1, inum2, ires;
	printf("Enter first number: ");
	scanf_s("%d", &inum1);
	printf("Enter second number: ");
	scanf_s("%d", &inum2);
	ires = inum1 + inum2;
	printf("Result is:%d", ires);
	_getch();
	return 0;
	
}