#include "Header.h"
char* accept(char* pNm) {
	char temp[15];
	printf("\n\nEnter a string: ");
	gets(temp);
	pNm = (char*)malloc(strlen(temp) + 1);
	strcpy(pNm, temp);
	return pNm;

}