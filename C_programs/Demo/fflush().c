#include<stdio.h>
#include<conio.h>//header file  included for getch()
int main()
{
	int inum1, inum2; ////Program without fflush(); function,  take input as "12345"
	printf("Enter first number");
	scanf_s("%2d", &inum1);
	printf("Enter second number");
	scanf_s(" %d", &inum2);
	printf("Both numbers are: %d %d", inum1, inum2);
	
	


	int inum3, inum4; ////Program with fflush(); function , take input as "12345" , currently in this version fflush() function is not working
	printf("Enter first number");
	scanf_s("%2d", &inum3);
	fflush(stdin);
	printf("Enter second number");
	scanf_s("%d", &inum4);
	printf("Both numbers are: %d %d", inum3, inum4);
	_getch();
	return 0;
}