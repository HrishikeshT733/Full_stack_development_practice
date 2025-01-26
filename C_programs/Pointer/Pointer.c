#include<stdio.h>
#include<conio.h>
int main() {
	int x = 5;
	int *ptr;
	ptr = &x;
	printf("x=%d\naddr of x=%d\n", x, &x);
	printf("ptr=%d\naddr of ptr =%d\n*ptr=%d", ptr, &ptr, *ptr);
	_getch();
	return 0;
}
