#include "Header.h"
int main() {
	struct student s2 = {20,"harish",50,40,60,'B'};//intialized in main
	char ch;
	printf("Student 1: \n"); //student 1 is declared in header file
	printf("Enter your roll no: ");
	scanf("%d", &s1.rollno);
	printf("\nEnter your name: ");
	ch = getchar();//to fflush input pipe
	gets(s1.name);
	printf("\nEnter sub1 mark: ");
	scanf("%d", &s1.sub1);
	printf("\nEnter sub2 mark: ");
	scanf("%d", &s1.sub2);
	printf("\nEnter sub 3 mark: ");
	scanf("%d", &s1.sub3);
	printf("\nEnter your grade: ");
	ch = getchar();//to fflush input pipe
	scanf("%c", &s1.div);

	s1.per = ((float)((s1.sub1 + s1.sub2 + s1.sub3)*100)/300);
	s2.per = ((float)((s2.sub1 + s2.sub2 + s2.sub3) * 100) / 300);
	printf("\nName\trollno\tsub1\tsub2\tsub3\tGrade\tper\n");
	printf("%s\t%d\t%d\t%d\t%d\t%c\t%f\n",s1.name,s1.rollno,s1.sub1,s1.sub2,s1.sub3,s1.div,s1.per);
	printf("%s\t%d\t%d\t%d\t%d\t%c\t%f\n", s2.name, s2.rollno, s2.sub1, s2.sub2, s2.sub3, s2.div,s2.per);

	_getch();
	return 0;
}