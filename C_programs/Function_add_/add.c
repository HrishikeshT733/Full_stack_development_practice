#include "Header.h"
int add() {
	int inum1, inum2;
	printf("Enter two numbers : ");
	scanf_s("%d%d", &inum1, &inum2);
	return inum1 + inum2;
}