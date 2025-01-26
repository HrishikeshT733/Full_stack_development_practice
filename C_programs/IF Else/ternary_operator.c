#include<stdio.h>
#include<conio.h>
int main() {
	int inum1, inum2,max;
	printf("Enter two numbers");
	scanf_s("%d%d", &inum1, &inum2);
	max = inum1 > inum2 ? inum1 : inum2;
	printf("max is %d", max);
	_getch();
	return 0;
}