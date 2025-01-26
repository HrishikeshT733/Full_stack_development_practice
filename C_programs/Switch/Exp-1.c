#include<stdio.h>
#include<conio.h>
int main() {
	int inum1, inum2, choice;
	float res;
	printf("Enter two numbers\t");
	scanf_s("%d%d", &inum1, &inum2);
	printf("Enter operation you want to perform\n1.Add\n2.Sub\n3.div\n4.mul\n");
	printf("Enter your choice\t");
	scanf_s("%d", &choice);
	switch (choice) {
	case 1:
		res = inum1 + inum2;
		printf("Addition is %.0f", res);
		break;
	case 2:
		res = inum1 - inum2;
		printf("substraction is %.0f", res);
		break;
	case 3:
		res = (float)inum1 / inum2;
		printf("Division is %f", res);
		break;
	case 4:
		res = inum1 * inum2;
		printf("Multiplication is %.0f", res);
		break;
	default:
		printf("wrong operation choice");


	}
	_getch();
	return 0;
}