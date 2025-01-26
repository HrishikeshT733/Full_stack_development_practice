#include "Header.h"
int fibo(int r) {
	int p;
	int n = 1;
	int x=0;
	if (r <=100&&r>0) {
		p = fibo(x) + fibo(n);
		x = n;
		n = p;
		printf("%d", p);
		r = r - 1;
	}
	else {
		return 0;
	}
}