#include<stdio.h>
#include<conio.h>
int main() {
	int choice, qty;
	float total;
	printf("Menu\tPrice\n1.Tea\t10\n7.Cofee\t20\n22.juice30\n");
	printf("Enter your choice");
	scanf_s("%d", &choice);
	switch (choice) {
	case 1:
		printf("\nEnter your qty");
		scanf_s("%d", &qty);
		total = 10 * qty;
		printf("Total bill is %f", total);
		break;
	case 7:
		printf("\nEnter your qty");
		scanf_s("%d", &qty);
		total = 20 * qty;
		printf("Total bill is %f", total);
		break;
	case 22:
		printf("\nEnter your qty");
		scanf_s("%d", &qty);
		total = 30 * qty;
		printf("Total bill is %f", total);
		break;
	default:
		printf("wrong choice");
		break;
	}
	
	_getch();
	return 0;
}