#include<stdio.h>
#include<conio.h>
int main() {
	int inum, irem,isum=0,icnt=0,itemp;
	printf("Enter a 4 digit number only ,for a car");
	scanf_s("%d", &inum);
	itemp = inum;
	while (inum != 0) {
		irem = inum % 10;
		isum = isum + irem;
		inum = inum / 10;
		icnt++;

	}
if (icnt==4 && itemp>0){
		if (isum % 3 == 0 && isum % 5 == 0) {
			printf("No is lucky" );
		}
		else {
			printf("No is Unlucky");
		}
	}
	else {
		printf("invalid input");
	}
	_getch();
	return 0;
}
