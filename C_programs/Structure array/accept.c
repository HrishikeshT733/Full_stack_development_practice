#include "Header.h"
void accept(stud* s) {
	char ch;
	
	
		printf("Enter your roll no: ");
		scanf("%d", &s->rollno);
		printf("\nEnter your name: ");
		ch = getchar();//to fflush input pipe
		gets(s->name);
		printf("\nEnter sub1 mark: ");
		scanf("%d", &s->sub1);
		printf("\nEnter sub2 mark: ");
		scanf("%d", &s->sub2);
		printf("\nEnter sub 3 mark: ");
		scanf("%d", &s->sub3);
		printf("\nEnter your grade: ");
		ch = getchar();//to fflush input pipe
		scanf("%c", &s->div);

		s->per = ((float)((s->sub1 + s->sub2 + s->sub3) * 100) / 300);
	}

