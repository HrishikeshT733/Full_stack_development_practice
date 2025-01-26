#include "Header.h"
int main() {

	char s1[SIZE],s2[SIZE],s3[SIZE];
	int len;
	printf("Enter first string : ");
	gets(s1);
	printf("Enter 3rd string: ");
	gets(s3);
	len = strlen(s1);
	printf("Length of first string is %d", len);
	strcpy(s2,s1);
	printf("\nAfter copying s1 to s2\n");
	puts(s2);
	strcat(s1, s2);
	printf("\nAfter concatenation:\n ");
	puts(s1);
	

	int temp = strcmp(s1, s3); //return 1,0,-1
	if (temp == 0)
		printf("\nEqual\n");
	else if (temp == 1)
		printf("\nfirst is greater: \n");
	else if (temp == -1)
		printf("\nSecond is greater\n");


	_strrev(s1);
	puts(s1);

	_getch();
	return 0;
}