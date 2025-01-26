#include<stdio.h>
#include<conio.h>
int main() {
	int ibasic, isamount;
	float icom;
	printf("Enter basic salary and total sales");
	scanf_s("%d%d", &ibasic, &isamount);
	if (isamount >= 5000 && isamount <= 7500) {
		icom = (float)isamount * 3 / 100;
		printf("Net salary and commission earned respectively are: %.0f\t%.4f", icom+ibasic, icom);
	}
	else if (isamount >= 7501 && isamount <= 10500) {
		icom = (float)isamount * 8 / 100;
		printf("Net salary and commission earned respectively are: %.0f\t%.4f", icom + ibasic, icom);
	}
	else if (isamount >= 10501 && isamount <= 15000) {
		icom = (float)isamount * 11 / 100;
		printf("Net salary and commission earned respectively are: %.0f\t%.4f", icom + ibasic, icom);
	}
	else if (isamount >= 15001) {
		icom = (float)isamount * 15 / 100;
		printf("Net salary and commission earned respectively are: %.0f\t%.4f", icom + ibasic, icom);
	}
	_getch();
	return 0;
}