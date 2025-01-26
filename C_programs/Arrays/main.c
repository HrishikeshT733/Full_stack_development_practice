#include "Header.h"
int main() {

	int arr[SIZE], i,sum=0,avg;
	printf("Enter %d subject marks ", SIZE);
	for (i = 0;i < SIZE;i++) {
		scanf("%d", &arr[i]);
	}
	printf("\narray elements are:");
	for (i = 0;i < SIZE;i++) {
		printf("\t%d", arr[i]);
	}
	for (i = 0;i < SIZE;i++) {
		sum += arr[i];
	}
	avg = sum / SIZE;
	printf("\naverage is %d", avg);
	_getch();
	return 0;
}
