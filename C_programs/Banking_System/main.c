#include "Header.h"

int main() {
	int choi;
	cust cus;
	int con=0;
	printf("Welcome to co-operative bank\n");
	cus.transac.incr = 0;
	// i am taking choi as a char beacause if i take choi as a integer and enter any alphabet as a choi then the loop runs infinite times
	do{
		printf("\n\nEnter following choice you want to perform \n1.Withdraw\n2.Deposit\n3.Check Balance\n4.Create Account\n5.Mini Statement\n6.Exit\n");
		//try structure inside structure for statements.
		scanf_s("%d", &choi);
		switch (choi) {
		case 1:
			withdraw(&cus);
			
			break;
		case 2:
			deposit(&cus);
			
			break;
		case 3:
			checkbalance(&cus);
			
			break;

		case 4:
			createacc(&cus);
			break;
		case 5:
			ministats(&cus);
			break;
		case 6:
			con = 1;
			break;
		
		default:
			printf("You have entered wrong choice");
			break;
		}
		

	} while (con!=1);
}