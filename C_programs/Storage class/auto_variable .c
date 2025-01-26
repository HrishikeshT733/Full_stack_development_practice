#include "Header.h"
void show();

int main() {
	auto int num1 = 10;
	for (int i = 1;i < 4;i++) {
		auto int num1 = 20;
		printf("%d in loop\n", num1);
	}
	show();
	printf("\n%d in main outside loop",num1);
	_getch();
	return 0;
	
}
void show() {
	auto int num1 = 30;
	printf("\n%d in function", num1);
}
