#include "Header.h"
void checkbalance(cust* c) {
	int tempacc;
	printf("Enter your account number:\n");
	scanf_s("%d", &tempacc);
	if (tempacc == c->accno) {
		printf("\nBalance in your account is %d",c->transac.bal);
	}
	else {
		printf("You have entered wrong account number");
	}

}