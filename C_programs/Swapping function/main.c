#include "Header.h"
int main() {
	int num3, num4;
	printf("Enter two variable ");
	scanf_s("%d%d", &num3, &num4);
	swap(num3,num4);
	printf("\n");
	swap2(num3, num4);
	_getch();
	return 0;
}