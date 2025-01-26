#include "Header.h"
int main() {
	int arr[SIZE], temp;
	printf("Enter numbers in an array:  ");
	for (int i = 0;i < SIZE;i++) {
		scanf_s("%d", &arr[i]);
	}
	for (int i = 0;i < SIZE/2;i++) {//here we are doing "SIZE/2" because in each iteration they are swapping two numbers so for swapping total number need to be divisible by 2
		temp = arr[i]; //if we put "i<SIZE" it will reverse array when half iteration is done then it will again reverse array in next half iteration which is same as original array
		arr[i] = arr[SIZE - i-1];///here we are doing"arr[SIZE - i-1]" because then it will exceeds array index
		arr[SIZE - i-1] = temp;
	}

	printf("\nReverse array elements are:");
	for (int i = 0;i < SIZE;i++) {
		printf("\t%d", arr[i]);
	}
	_getch();
	return 0;
}