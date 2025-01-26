#include "Header.h"
void display(int arrr[][COL]) {//method1
	for (int i = 0;i < ROW;i++) {
		printf("\ndata for customers %d :", i + 1);
		for (int j = 0;j < COL;j++) {
			printf("%d ", arrr[i][j]);
		}
		printf("\n");
	}
}
void displayptr(int (*arrr)[COL]) {//method2
	for (int i = 0;i < ROW;i++) {
		printf("\ndata for customers %d :", i + 1);
		for (int j = 0;j < COL;j++) {
			printf("%d\t", *(*(arrr + i) + j));
		}
	}
}
