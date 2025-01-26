#include<stdio.h>
#include<conio.h>
int main() {
	int isum=0,inum=1;
	while(inum <= 20) {
		if (inum % 2 == 0) {
			isum += inum;
		}
		inum++;
	}
	printf("Sum from 1 to 20 even number is %d", isum);
	_getch();
	return 0;
}
