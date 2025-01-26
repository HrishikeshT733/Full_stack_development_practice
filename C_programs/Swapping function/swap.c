#include "Header.h"
void swap(int num1 ,int num2) {
	
	num1 = num1 + num2;
	num2 = num1 - num2;
	num1 = num1-num2;
	printf("num1=%d,num2=%d", num1, num2);

}