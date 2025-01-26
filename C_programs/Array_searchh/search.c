#include "Header.h"
int search(int ar[], int size, int se, int* pr) {
	int i;
	for (i = 0;i < size;i++) {
		if (se == ar[i]) {
			break;
		}
	}
	*pr =i;
}