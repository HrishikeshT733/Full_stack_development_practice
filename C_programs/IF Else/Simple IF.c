#include<stdio.h>
#include<conio.h>
int main() {
	float aggr;
	printf("Enter ur marks: ");
	scanf_s("%f", &aggr);
	if (aggr >= 60) {
		printf("u r eligible");
	}else {
		printf("u r not eligible");
		}
	_getch();
	return 0;
}