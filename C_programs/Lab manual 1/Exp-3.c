#include<stdio.h>
#include<conio.h>
int main() {
 int ival;
 printf("Enter any Number: ");
 scanf_s("%d", &ival);
 ival < 0 ?(ival=ival*(-1)) : ival;
 printf("Absolute value is %d", ival);
	_getch();
	return 0;
}