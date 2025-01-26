#include "Header.h"
void selectionsort(int arrr[], int n) {
	int i, j, temp;
	
	for (i = 0;i < n - 1;i++) {
		int small = i;
		for (j = i + 1;j < n;j++) {
			if (arrr[small] > arrr[j]) {
				small = j;
			}
		}
		if (i != small) {
			temp = arrr[i];
			arrr[i] = arrr[small];
			arrr[small] = temp;
		}
		
	}
}