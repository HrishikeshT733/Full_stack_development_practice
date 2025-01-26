#include<stdio.h>
#include<conio.h>
int main() {
	int iu, ic,it=21;
	while (it != 1) {
		printf("\nChose your number");
		scanf_s("%d", &iu);
		ic = 5 - iu;
		printf("Computer chose %d", ic);
		it = it - 5;
	}
	printf("\nYou lose because only %d matchsticks left", it);
	_getch();
	return 0;
}
