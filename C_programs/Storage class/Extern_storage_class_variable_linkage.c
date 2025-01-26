#include "Header.h"
int num = 10;
void show();
void display();

int main() {
	printf("%d", num);
	num += 2;
	show();
	display();
	
	_getch();
	return 0;
}
void show() {
	extern int num; //default intialize to "0"
	printf("%d", num);
	num += 5;
	
}