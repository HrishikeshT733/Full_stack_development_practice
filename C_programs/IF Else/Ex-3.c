#include<stdio.h>
#include<conio.h>
int main() {
	int inum1;
	printf("Enter any number: ");
	scanf_s("%d", &inum1);
	//int rem = inum1 % 2;
	if (inum1%2 > 0) { //we can either use inum1%2 !=0
		printf("Number is odd");
	}
	else {
		printf("Number is even");
	}
	_getch();
	return 0;
}