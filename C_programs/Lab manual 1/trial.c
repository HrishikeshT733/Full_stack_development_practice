#include<stdio.h>
#include<conio.h>
#define SIZE 5
int main() {
	int a[3] = { 20,30,40 };
	int b[3];
	b = a;
	printf("%d", b[0]);
	_getch();
	return 0;
}