#include<stdio.h>
#include<conio.h>
int main() {
	int inum1, inum2, inum3,max;
	printf("Enter three numbers");
	scanf_s("%d%d%d", &inum1, &inum2,&inum3);
	max = inum1 > inum2 ? (inum1>inum3?inum1:inum3) : (inum2>inum3?inum2:inum3);
	printf("max is %d", max);
	_getch();
	return 0;
}