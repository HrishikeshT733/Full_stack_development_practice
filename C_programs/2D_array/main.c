#include "Header.h"
int main() {
	int arr[ROW][COL],tempp[COL][ROW];
	accept(arr);
	printf("Before transpose:\n");
	display(arr);
	printf("\nAfter transpose:\n");
	transpose(arr, tempp);
	display(tempp);
	_getch();
	return 0;
}