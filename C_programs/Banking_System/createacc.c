#include "Header.h"
void createacc(cust* cr) {
	char ch;
	
	printf("Enter your name \n");
	ch = getchar();
	gets(cr->name);
	cr->accno = rand()%99;
	cr->transac.bal = 0;
	printf("Your account created successfully!!!\n");
	printf("Your account no is %d", cr->accno);

 }