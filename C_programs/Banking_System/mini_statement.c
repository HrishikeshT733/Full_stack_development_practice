#include "Header.h"
void ministats(cust* ms) {
	int tempacc;
	printf("Enter your account number: \n");
	scanf_s("%d", &tempacc);
	if (tempacc==ms->accno) {
		printf("Customer name :%s\n", ms->name);
		printf("--------------------------------------------------\n");
		printf("Transaction Type---------Amount---------Balance\n");
		printf("--------------------------------------------------\n\n");
		for (int i = 0;i < ms->transac.incr;i++) {
			if (ms->transac.type[i] == 'C') {
		printf("Credited with(+)_________%d____________%d\n",ms->transac.stats[i], ms->transac.currBal[i]);
			}
			else {
		printf("Debited with(-)__________%d____________%d\n", ms->transac.stats[i], ms->transac.currBal[i]);
			}
		}
		printf("\n--------------------------------------------------\n");
		printf("\nBalance in your account is %d", ms->transac.bal);
	}
	else {
		printf("\nEntered wrong account no !!!");
	}
}