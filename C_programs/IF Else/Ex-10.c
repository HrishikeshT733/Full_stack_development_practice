#include<stdio.h>
#include<conio.h>
int main() {
	int s1, s2, s3;
	float total,per;
	printf("Enter marks of 3 subjects out off 100 each subject");
	scanf_s("%d%d%d", &s1, &s2, &s3);
	total = s1 + s2 + s3;
	per = (float)(total/300* 100);
	if (per >=75 ) {
		printf("Grade A");
	}else if (per>=60 ) {
		printf("Grade B");
	}else if (per>=40) {
		printf("Grade C");
	}
	else {
		printf("Grade F");
	}
	_getch();
	return 0;
}