#include<stdio.h>
#include<conio.h>
int main() {
	int inum1;
	printf("enter age to check you are eligible to play");
	scanf_s("%d", &inum1);
	if (inum1 <8) {
	printf("age is under 8 eligilbe");
		
	}
	else if(inum1<11){
    printf("age is under 11 eligilbe");

	}
	else if (inum1 <14) {
	printf("age is under 14 eligilbe");
	}
	else if (inum1 < 17) {
		printf("age is under 17 eligilbe");
	}
	else {
		printf("age is not eligible to play");
	}
	_getch();
	return 0;
}