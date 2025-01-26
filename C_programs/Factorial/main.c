#include "header.h"
int main() {
	int in;
	printf("Enter number you want to find factorial of ");
	scanf_s("%d", &in);
	fact(in);
	 _getch();
	return 0;
}