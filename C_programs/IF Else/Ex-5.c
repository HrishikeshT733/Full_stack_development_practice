#include<stdio.h>
#include<conio.h>
int main() {
	int inum1, inum2, inum3;
	printf("Enter any three numbers ");
	scanf_s("%d%d%d", &inum1,&inum2,&inum3);
	if (inum1>inum2) {
		if (inum1>inum3) {
			printf("greater is %d",inum1);
		}
		else {
			printf("greater is %d",inum3);
		}
	}
	else {
		if (inum2 > inum3) {
			printf("greater is %d", inum2);
		}
		
			printf("greater is %d", inum3);
		
	}
	_getch();
	return 0;
}