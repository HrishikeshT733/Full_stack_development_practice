#include"Header.h"
int main() {
	enum COLOR bgcolor, fgcolor = red,tmp=BLACK;
	bgcolor = CYAN;
	printf("\n\t\t%d %d %d\n\t\t", fgcolor, bgcolor,tmp);
	_getch();
	return 0;
}