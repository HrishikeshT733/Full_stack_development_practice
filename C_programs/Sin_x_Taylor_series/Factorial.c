#include "Header.h"
int facto(int num1) {
	int fact = 1;
	for (int i = num1;i >= 1;i--) {
		fact = fact * i;
	}
	return fact;
}