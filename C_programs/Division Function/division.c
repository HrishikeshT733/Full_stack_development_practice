#include "Header.h"
void div(int num, int den, int* quo, int* rem) {
	*quo = num / den;
	*rem = num % den;
}