#include "Header.h"
int main() {
	int arr[SIZE], i,max;
	printf("Enter %d numbers ", SIZE);
	for (i = 0;i < SIZE;i++) {
		scanf_s("%d", &arr[i]);
	}
	max = arr[0];
	for (i = 1;i < SIZE;i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		
	
	printf("Maximun is %d\n", max);
	printf("size of array is: %d bytes", sizeof(arr));
	_getch();
	return 0;
}