#include<stdio.h>
#include<conio.h>//header file  included for getch()
int main()
{
	int inum1, inum2, inum3;
	float ires1;
	printf("Enter Three subject marks : ");
	scanf_s("%d%d%d", &inum1, &inum2,&inum3);
	ires1 = (inum1 + inum2 + inum3) / 3;
	printf("Quotient and Remainder respectively are: %f", ires1);
	_getch();
	return 0;

}