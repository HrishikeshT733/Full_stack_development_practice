#include"Header.h"
int main() {
	book bk[SIZE];
	for (int i = 0;i < SIZE;i++) {
		printf("Book : %d \n", i + 1);
		accept(&bk[i]);
	}
	printf("\nBookId\tTitle\tPrice\n");
	for (int i = 0;i < SIZE;i++) {
		display(&bk[i]);
	}
	_getch();
	return 0;

}