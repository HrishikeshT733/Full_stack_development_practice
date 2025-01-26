#include<stdio.h>
#include<conio.h>
int main() {
	int ichoice,inum1,ifact=1,isq;
	printf("Enter a number :");
	scanf_s("%d", &inum1);
	printf("Enter code no from below Operations to perform on number:\n1.Find Factorial\n2.Find square\n3.Exit\nEnter your choice: ");
	scanf_s("%d", &ichoice);
		switch (ichoice) {
	case 1:
		for (int i = 1;i <= inum1;i++) {
			ifact = ifact * i;
		}
		printf("Factorial is %d",ifact);
		break;
	case 2:
		isq = inum1 * inum1;
		printf("Square is %d", isq);
		break;
	case 3:
		exit();
		break;
	default:
		printf("Wrong choice entered");

	}
	_getch();
	return 0;
}