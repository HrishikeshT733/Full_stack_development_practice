#include "Header.h"
void accept(int arrr[][COL]) {//method1
	for (int i = 0;i < ROW;i++) {
		printf("Enter data for customers %d ", i + 1);
		for (int j = 0;j < COL;j++) {
			scanf("%d", &arrr[i][j]);
		}
	}
}
void acceptptr(int (*arrr)[COL]) {//method2
	for (int i = 0;i < ROW;i++) {
		printf("Enter data for customers %d ", i + 1);
		for (int j = 0;j < COL;j++) {
			scanf("%d", *(arrr+i)+j);
		}
	}
}