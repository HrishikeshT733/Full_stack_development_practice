#include "Header.h"
int main() {
	int dd, mm, yy;
	
		printf("Enter date in dd mm yy :");
		scanf_s("%d%d%d", &dd, &mm, &yy);
		if (dd <= 31 && mm < 13) {
		getdate(&dd, &mm, &yy);
		printf("date is %.2d/%.2d/%.2d", dd, mm, yy);
	}
	else { 
		printf("Invalid date format");
	}
}