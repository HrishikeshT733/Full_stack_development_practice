#include<stdio.h>
#include<conio.h>
int main() 
{
	int i, num;
	printf("Enter number you want to print table of : ");
	scanf_s("%d", &num);
    for (i = 1;i <= 10;i++) {
		printf("%d*%d\t%d\n",num,i,num*i);
	}
	_getch();
	return 0;
}