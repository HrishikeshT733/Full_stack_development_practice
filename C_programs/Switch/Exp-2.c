#include<stdio.h>
#include<conio.h>
int main() {
	int inum1;
	printf("Enter a age ");
	scanf_s("%d", &inum1);
	switch (inum1) {
		case 5:
		case 6:
		case 7:
			printf("Under 8");
		break;
		case 9:
		case 10:
		case 11:
			printf("Under 12");
		break;
		case 12:
		case 13:
		case 14:
			printf("Under 15");
		break;
	default:
		printf("Not eligible to play");

	}
	_getch();
	return 0;
}