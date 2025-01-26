#include<stdio.h>
#include<conio.h>
#include<string.h>
#define SIZE 3
typedef struct {

	int bookId;
	char Title[10];
	int price;

}book;
void accept(book* temp);
void display(book* temp);