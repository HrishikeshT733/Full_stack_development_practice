#include "Header.h"
void display(int mrks[], int s) {
	//void display(int mrk[], int s) { (other method to perform same task)
	for (int i = 0;i < s;i++) {
		//printf("\t%d", mrk[i]);
		printf("\t%d", *(mrks + i));//here we are adding "i" bacause we don't want to change "mrks" address so we are keeping it same
	}
}