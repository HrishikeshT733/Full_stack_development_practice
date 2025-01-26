#include "Header.h"
void accept(char** pNmm,int n) {
	char temp[50];
	for (int i = 0;i < n;i++) {
		gets(temp);
		(*(pNmm+i)) = (char*)malloc((strlen(temp)+1) * sizeof(char));//+1 means to accomodate '/0' 
		if (pNmm == NULL) { //if dynamic memory allocation fails 
			printf("Insufficient memory...");
			_getch();
			exit(0);
		}
		strcpy((*(pNmm+i)), temp);

	}
	//void accept(char* pNm, int n) {      //method 2 we just need outer for loop in main.c for ptr[i] to accept one by one array
	//	char temp[50];

	//	gets(temp);
	//	pNm= (char*)malloc((15) * sizeof(char));//+1 means to accomodate '/0' 
	//	if (pNm == NULL) { //if dynamic memory allocation fails 
	//		printf("Insufficient memory...");
	//		_getch();
	//		exit(0);
	//	}
	//	strcpy(pNm, temp);

	//}



}