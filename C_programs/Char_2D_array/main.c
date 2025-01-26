#include "Header.h"
int main() {
	char arr[SIZE][20];
	printf("Enter names: \n");
	accept(arr, SIZE);
	printf("Names are : \n");
	display(arr, SIZE);
	_getch();
	return 0;
}