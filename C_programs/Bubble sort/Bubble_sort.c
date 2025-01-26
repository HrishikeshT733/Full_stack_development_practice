#include "Header.h"
void bubblesort(int arrr[],int n) {

	int i = 1,j, temp;
	int passes, comparisons;
	passes = n - 1;
	for (i = 1;i <= passes;i++) {
		comparisons = n-i;
		for (j = 0;j < comparisons;j++) {
			if (arrr[j] > arrr[j + 1]) {
				temp = arrr[j];
				arrr[j] = arrr[j + 1];
				arrr[j + 1] = temp;

			}
		}
	}
}