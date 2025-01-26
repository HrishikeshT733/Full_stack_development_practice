#include "Header.h"
int transpose(int arrr[][COL], int temp[][COL]) {
	for (int i = 0;i < ROW;i++) {
		for (int j = 0;j < COL;j++) {
			temp[j][i] = arrr[i][j];
		}
	}

}