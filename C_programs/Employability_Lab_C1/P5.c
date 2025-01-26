#include<stdio.h>
#include<conio.h>
int main() {
	int inum1, ikey,irem,icnt=0;
	printf("Enter a number and key digit respectively:");
	scanf_s("%d%d", &inum1, &ikey);
	while (inum1!= 0) {
		irem = inum1 % 10;
		inum1 = inum1 / 10;
		if (irem == ikey) 
		{
			icnt++;
		}
	}
	printf("%d", icnt);
	_getch();
	return 0;
}
