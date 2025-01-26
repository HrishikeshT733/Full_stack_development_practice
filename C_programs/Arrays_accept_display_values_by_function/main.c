#include "Header.h"
int main() {
	int arr[SIZE];
	printf("Enter values in an array: ");
	accept(arr,SIZE);
	printf("Elements in an array  are : ");
	display(arr,SIZE);
	_getch();
	return 0;
}
