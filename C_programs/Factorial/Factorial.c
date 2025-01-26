#include "Header.h"
void fact(int num) {
	int res=1;
	for (int i = num;i>=1;i--) {
		res = res * i;	
	}
	printf("Factorial of %d is %d",num,res);
}