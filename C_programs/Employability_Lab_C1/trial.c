#include<stdio.h>
#include<conio.h>
int main() {
	int num1 = 4;
	int fact = 1;
	for (int i = num1;i >= 1;i--) {
		fact = fact * i ;
	}
	printf("%d\n%d", fact,num1);
}