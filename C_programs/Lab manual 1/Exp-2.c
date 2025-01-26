#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int main() {
	int idd, imm, iyyyy,ily;//ly-leap year,inly-not leap yea
	printf("Enter date in format dd/mm/yyyy: ");
	scanf_s("%d%d%d", &idd, &imm, &iyyyy);
	printf("Given date is: %d/%d/%d\n", idd, imm, iyyyy);
	iyyyy % 100 ? (iyyyy % 4 ? (ily = 1) : (ily = 0 )): (iyyyy % 400 ? (ily = 1) : (ily = 0));
	//ily==0 means leap year and ily==1 means not a leap year
	switch (imm) {
	case 2:
		switch (ily)
		{
		case 0://means leap year
			printf("February has 29 days");
			break;
		case 1://means not leap year
			printf("February has 28 days");
			break;
		}
	break;
	case 1:
		printf("January has 31 days");
	break;
	case 3:
		printf("March has 31 days");
	break;
	case 4:
		printf("April has 30 days");
	break;
	case 6:
		printf("June has 30 days");
	break;
	case 7:
		printf("July has 31 days");
	break;
	case 8:
		printf("August has 31 days");
	break;
	case 9:
		printf("September has 30 days");
	break;
	case 10:
		printf("October has 31 days");
	break;
	case 11:
		printf("November has 30 days");
	break;
	case 12:
		printf("December has 31 days");
	break;
	default:
		printf("Invalid date format ");
	}
	_getch();
	return 0;
}