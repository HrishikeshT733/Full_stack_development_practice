#include "Header.h"
void show();
int main() {
	show();
	show();
	show();
	show();
	_getch();
	return 0;
}
void show() {
	static int cnt; //deafault intialize to "0"
	printf("%d", cnt);
	cnt++;
}