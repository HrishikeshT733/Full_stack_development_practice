#include<stdio.h>
#include<conio.h>//header file  included for getch()
int main()
{
	int inum1;
	float ires;
	const float pie = 3.14;
	printf("Enter radius of circle: ");
	scanf_s("%d", &inum1);
	ires = pie * inum1 * inum1;
	printf("Result is:%f", ires);
	_getch();
	return 0;

}