#include<stdio.h> //Program to print even numbers from 2 to 20
#include<conio.h>
int main()
{
	int i = 2;
	while (i <= 20) {
		printf("%d\t", i);
		i = i + 2;
	}
	_getch();
	return 0;
}