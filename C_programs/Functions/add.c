#include "Header.h"
void add() {// Defining "add" function
	int inum1, inum2, res;
	printf("Enter two numbers want to add: ");
	scanf_s("%d%d", &inum1, &inum2);
	res = inum1 + inum2;
	printf("Addition is %d", res);
}