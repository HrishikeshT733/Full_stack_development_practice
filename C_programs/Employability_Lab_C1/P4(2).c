#include<stdio.h>
#include<conio.h>
int main() {
	int inum1, inum2;
	printf("Enter Two nos: ");
	scanf_s("%d%d", &inum1, &inum2);
	inum1>inum2? printf("Maximum of two nos is %d",inum1):printf("Maximum of two nos is %d",inum2);
	_getch();
	return 0;
}
