#include "Header.h"
int main() {
	int ans;
	int corr=0;
	int inco = 0;
	
	printf("Answer following question\n");
	printf("1.3+4=?\n");
	scanf_s("%d", &ans);
	if (ans == 7) {
		corr++;
	}
	else {
		inco++;
	}
	printf("2.3*4=?\n");
	scanf_s("%d", &ans);
	if (ans == 12) {
		corr++;
	}
	else {
		inco++;
	}
	printf("3.4-3=?\n");
	scanf_s("%d", &ans);
	if (ans == 1) {
		corr++;
	}
	else {
		inco++;
	}
	printf("4.3/3=?\n");
	scanf_s("%d", &ans);
	if (ans == 1) {
		corr++;
	}
	else {
		inco++;
	}
	printf("5.9 modulus 2=?\n");
	scanf_s("%d", &ans);
	if (ans == 1) {
		corr++;
	}
	else {
		inco++;
	}

	printf("correct answer-%d\nIncorrect answer-%d", corr, inco);
	_getch();
}