#include<stdio.h>
#include<conio.h>
int main() {
	int isum = 0,inum=0,iupper,ilower;
	printf("Enter Upper and lower limit to find sum of even number between :");
	scanf_s("%d%d", &ilower, &iupper);
	inum=ilower;

	while (ilower<=iupper) {
		if (ilower % 2 == 0) {
			isum += ilower;
		}
		ilower++;
	}
	printf("Sum from %d to %d even number is %d",inum,iupper, isum);
	_getch();
	return 0;
}
