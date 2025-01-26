#include "Header.h"
int main() {
	int inum, res;
	printf("Enter a number ");
	scanf_s("%d", &inum);
	printf("%d", fact(inum));
	_getch();
	return 0;
}