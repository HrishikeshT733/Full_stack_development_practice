#include "Header.h"
int main() {
	int num1, num2;
	printf("Enter two no : ");
	scanf_s("%d%d", &num1, &num2);
	printf("\nbefore swapping\n");
	printf("num1=%d\tnum2=%d", num1, num2);
	swap(&num1, &num2);
	printf("\nafter swapping in main\n");
	printf("num1=%d\tnum2=%d", num1, num2);
	_getch();
	return 0;
}