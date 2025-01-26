#include "Header.h"
void withdraw(cust* w) {
	int tempacc;
	int wamount;
	char ch;
	printf("Enter your account number:\n");
	scanf_s("%d", &tempacc);
	if (tempacc == w->accno) {
		printf("\nEnter withdraw amount: ");
		scanf_s("%d", &wamount);
		if (wamount>w->transac.bal) {
			printf("Insufficient balance");

		}
		else {
			printf("%d rs withdraw successfully", wamount);
			w->transac.bal = w->transac.bal - wamount;
			printf("\nBalance in your account is %d rs", w->transac.bal);
			
			w->transac.stats[w->transac.incr] = wamount;
			w->transac.type[w->transac.incr] = 'D';
			w->transac.currBal[w->transac.incr] = w->transac.bal;
			w->transac.incr = w->transac.incr + 1;
		}

	}
	else {
		printf("You have entered wrong account number");
	}

 }