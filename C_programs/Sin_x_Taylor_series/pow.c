#include "Header.h"
float pow(float n, int p) {
	float r = 1;
	for (int i = 0;i < p;i++) {
		r =(float)(r*n);
	}
	return r;
}