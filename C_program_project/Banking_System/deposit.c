#include "Header.h"
void deposit(cust* d) {
	int tempacc;
	int damount;
	int dtemp;
	char ch;
	printf("Enter your account number:\n");
	scanf_s("%d", &tempacc);
	if (tempacc == d->accno) {
		printf("\nEnter deposit amount: ");
		scanf_s("%d", &damount);
		d->transac.bal = d->transac.bal + damount;
		printf("%d rs deposited successfully", damount);
		printf("\nBalance in your account is %d rs", d->transac.bal);

		d->transac.stats[d->transac.incr] = damount;
		d->transac.type[d->transac.incr] ='C';
		d->transac.currBal[d->transac.incr] = d->transac.bal;
		d->transac.incr = d->transac.incr + 1;
	}
	else {
		printf("You have entered wrong account number");
	}

}