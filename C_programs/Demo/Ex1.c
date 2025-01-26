#include<stdio.h>
#include<conio.h>//header file  included for getch()
int main()
{
	int inum1, inum2, ires1,ires2;
	printf("Enter Numerator and Denominator : ");
	scanf_s("%d%d", &inum1,&inum2);
	ires1 = inum1/inum2;
	ires2 = inum1 % inum2;
	printf("Quotient and Remainder respectively are: %d %d", ires1,ires2);
	_getch();
	return 0;

}