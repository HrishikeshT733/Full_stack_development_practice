#include<stdio.h>
#include<conio.h>
int main() {
	int inum1, inum2, max;
	printf("Enter Two nos: ");
	scanf_s("%d%d", &inum1, &inum2);
		if (inum1 > inum2) {
			max = inum1;
		}
		else {
			max = inum2;
		}
	printf("Maximum of two nos is %d", max);
	_getch();
	return 0;
}
