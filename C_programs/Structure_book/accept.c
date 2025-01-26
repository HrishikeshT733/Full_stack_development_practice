#include "Header.h"
void accept(book* s) {
	char ch;
	printf("Enter your Employee ID: ");
	scanf("%d", &s->bookId);
	printf("\nEnter book title: ");
	ch = getchar();//to fflush input pipe
	gets(s->Title);
	printf("\nEnter book price");
	scanf("%d", &s->price);
	
}