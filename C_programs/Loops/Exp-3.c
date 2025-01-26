#include<stdio.h>
#include<conio.h>
int main() {
	int inum1, sum=0, r,irev=0,in=0;
	printf("Enter any number : ");
	scanf_s("%d", &inum1);
	while (inum1!=0) {
		r = inum1 % 10;
		sum += r;////i.e sum = sum + r;
		irev = irev*10 + r;// for printing reverse of that number
		inum1 = inum1 / 10;
		in++; // for counting no of digits
		
	}
	printf("sum of digits of number is %d and no. of digits is %d and reverse of that number is %d", sum,in,irev);


	_getch();
	return 0;
}