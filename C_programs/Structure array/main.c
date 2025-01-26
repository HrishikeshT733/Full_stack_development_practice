#include "Header.h"
int main() {
	stud st[SIZE];
//	for (int i=0;i<SIZE;i++){
//		printf("Student %d: \n", i+1); //student 1 is declared in header file
//	printf("Enter your roll no: ");
//	scanf("%d", &s[i].rollno);
//	printf("\nEnter your name: ");
//	ch = getchar();//to fflush input pipe
//	gets(s[i].name);
//	printf("\nEnter sub1 mark: ");
//	scanf("%d", &s[i].sub1);
//	printf("\nEnter sub2 mark: ");
//	scanf("%d", &s[i].sub2);
//	printf("\nEnter sub 3 mark: ");
//	scanf("%d", &s[i].sub3);
//	printf("\nEnter your grade: ");
//	ch = getchar();//to fflush input pipe
//	scanf("%c", &s[i].div);
// 	   }
//printf("\nName\trollno\tsub1\tsub2\tsub3\tGrade\tper\n");
// 	  for (int i=0;i<SIZE;i++) {
//	s[i].per = ((float)((s[i].sub1 + s[i].sub2 + s[i].sub3) * 100) / 300);
//}

	for (int i = 0;i < SIZE;i++) {
		printf("Student %d : \n",i+1);
		accept(&st[i]);
	}
	printf("\nName\trollno\tsub1\tsub2\tsub3\tGrade\tper\n");
	for (int i = 0;i < SIZE;i++) {
		display(&st[i]);
	}
	_getch();
	return 0;
}