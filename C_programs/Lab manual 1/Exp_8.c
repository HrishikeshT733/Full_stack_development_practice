#include<stdio.h>
#include<conio.h>
int main() {
	int inum;
	printf("Enter number of rows :");
	scanf_s("%d", &inum);
	for (int i = 1;i <= inum;i++) {
	for (int k = inum;k >= i;k--) {
		printf(" ");
	}
		for (int j = i;j >=1;j--) {
			printf("%d", j);
		}
		for (int j = 1;j <= i;j++) {
			printf("%d", j);
		}
		
		printf("\n");
	}
	_getch();
	return 0;
}
