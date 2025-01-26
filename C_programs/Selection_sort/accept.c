#include "Header.h"
void accept(int mrks[], int s) {
	//void accept(int mrk[], int s) {  (other method to perform same task)
	for (int i = 0;i < s;i++) {
		//scanf_s("%d", &mrk[i]);
		scanf_s("%d", mrks + i);
	}
}