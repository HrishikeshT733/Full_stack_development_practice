#include<stdio.h>
#include<conio.h>
int main() {
	int ilow,iupp,icnt=0;
	printf("Enter lower and upper limit :");
	scanf_s("%d%d", &ilow, &iupp);
	for (int i =ilow+3;i < iupp;i=i+3) {
		
			printf("%d", i);
		
	}
	_getch();
	return 0;
}
