#include<stdio.h>
#include<conio.h>
int main() {
	int inum1;
	printf("Enter year");
	scanf_s("%d", &inum1);
	inum1%100 ?(inum1%4 ?printf("Not Leap Year"): printf("Leap Year")): (inum1%400?printf("Not Leap year"):printf(" Leap Year"));
	_getch();
	return 0;
}