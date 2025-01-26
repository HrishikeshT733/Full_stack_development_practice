#include "Header.h"
int main() {
	int arr[SIZE];
	printf("array elements are:");
	accept(arr, SIZE);
	printf("Before sorting array is :");
	display(arr, SIZE);
	selectionsort(arr, SIZE);
	printf("\nAfter sorting array using selection sort  is: ");
	display(arr, SIZE);
	_getch();
	return 0;
}