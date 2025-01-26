#include<stdio.h>
#include<conio.h>
int main() {
	int inum;
	for (int i = 1;i <= 3;i++) {
		for (int j = 1;j <= 3;j++) {
			for (int k = 1;k <= 3;k++) {
				if (i != j && i != k && k != j) {
					inum = i * 100 + j * 10 + k;
					printf("%d\n", inum);
				}
		  }
		}
	}

	_getch();
	return 0;
}
