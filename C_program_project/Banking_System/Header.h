#include<stdio.h>
#include<conio.h>
#include<string.h>
#define SIZE 100
typedef struct {
	char name[SIZE];
	int accno;
	struct transac{
		int bal;
		int stats[SIZE];
		char type[SIZE];
		int currBal[SIZE];
		int incr;
     }transac;
	
	
}cust;


void withdraw(cust* temp);
void deposit(cust* temp);
void createacc(cust* temp);
void checkbalance(cust* temp);
void ministats(cust* temp);


