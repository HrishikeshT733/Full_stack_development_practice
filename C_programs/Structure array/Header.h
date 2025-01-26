#include<stdio.h>
#include<conio.h>
#include<string.h>
#define SIZE 3
typedef struct {

	int rollno;
	char name[10];
	int sub1;
	int sub2;
	int sub3;
	char div;
	float per;
}stud;
void accept(stud* temp);
void display(stud* temp);