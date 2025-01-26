#include "Header.h"
void swap(int *ptr1,int *ptr2) {
	int temp;
	temp = *ptr1;
	*ptr1 = *ptr2;
	*ptr2 = temp;
	printf("\n in function\n");
	printf("num1=%d\tnum2=%d\n", *ptr1, *ptr2);
}