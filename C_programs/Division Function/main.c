#include "Header.h"
int main() {

	int num, den, quo, rem;
	printf("Enter num and deno: ");
	scanf_s("%d%d", &num, &den);
	div(num, den, &quo, &rem);
	printf("After division \nQuotient=%d, Remainder=%d", quo,rem);
	_getch();
	return 0;
}