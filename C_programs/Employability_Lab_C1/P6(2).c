#include<stdio.h>
#include<conio.h>
int main() {
	int inum, idig, itemp = 1;
	printf("Enter a no and Digit respectively");
	scanf_s("%d%d", &inum, &idig);
	if (inum < 0 || idig<0) {
		printf("invalid input");
	}
	else {
		for (int i = 1;i < idig;i++) {
			itemp = itemp * inum;
		} 
		printf("%d", itemp);
	}
	_getch();
	return 0;
}
