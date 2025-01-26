#include "Header.h"
int main() {
	int num1, num2;
	printf("Enter two numbers and find max between them : ");
	scanf_s("%d%d", &num1, &num2);

	int max = findmax(num1, num2);
	printf("Maximum of two number is %d", max);
}