#include<stdio.h>
#include<conio.h>//header file  included for getch()
int main()
{
	int inum1, inum2, inum3;
	float ires1;
	printf("Enter P,n,r values : ");
	scanf_s("%d%d%d", &inum1, &inum2,&inum3);
	ires1 = (float)(inum1 * inum2 * inum3) / 100;
	printf("Simple interest is:  %f", ires1);
	_getch();
	return 0;

}