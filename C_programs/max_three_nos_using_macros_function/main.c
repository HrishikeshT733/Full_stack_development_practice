#include "Header.h"
int main() {
	/*int inum1, inum2, inum3, max;
	printf("Enter three numbers : ");
	scanf_s("%d%d%d", &inum1, &inum2, &inum3);
	max = MAX3NOS(inum1, inum2, inum3);
	printf("maximum of three nos is %d", max);*/
	char ch;
	printf("Enter a character: "); //ALPHABET(ch) is returning '1' if TRUE and '0' if FALSE
	scanf_s(" %c", &ch);
	if (ALPHABET(ch)) {
		printf("'%c' is an alphabet.\n", ch);
	}
	else {
		printf("'%c' is not an alphabet.\n", ch);
	}
	printf("%d", );

}a