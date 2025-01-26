#include "Header.h"
int main() {
	int degree,n;
	float radian,res = 0; ;
	
	printf("Enter degree of  sin(angle) and number of series term(n): ");
	scanf_s("%d%d", &degree,&n);
	radian = (float)(degree * 3.14 / 180);
	for (int i = 0;i <= n;i++) {
		res=res + (pow(-1, i) * ((pow(radian,(2 * i) + 1)) / facto((2 * i) + 1))); //sinx taylor formula

	}
	//res =(float)(radian - (pow(radian, 3) / facto(3)) + (pow(radian, 5) / facto(5)) - (pow(radian, 7) / facto(7)) + (pow(radian, 9) / facto(9)));
	printf("Approx value of sin(%d) is : %f",degree,res);
}