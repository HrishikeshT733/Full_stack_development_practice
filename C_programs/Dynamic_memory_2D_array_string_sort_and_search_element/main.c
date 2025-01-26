#include "Header.h"
//problem in clearing Free ptr[i];
int main() {
	char** ptr;
	int nstud,k=0;
	char name[50], ch;
	
	printf("Enter No of students:\n");
	scanf("%d", &nstud);
	pNm = (char**)malloc((nstud)*sizeof(char*));
	if (pNm == NULL) { //if dynamic memory allocation fails 
		printf("Insufficient memory...");
		_getch();
		exit(0);
	}
	printf("\nEnter %d students names :\n",nstud);
	while ((ch = getchar()) != '\n');
	//for (int i = 0;i < nstud;i++) {   //loop for method 2 written in accept.c
		
		//ptr=ptr[i];
		
	//}

	accept(pNm, nstud);
	printf("\nBefore sorting :\n");
	for (int i = 0;i < nstud;i++) {
		
		puts(pNm[i]);
	}
	
	 sort(pNm, nstud); 
	for (int i = 0;i < nstud;i++) {

		puts(pNm[i]);
	}
	printf("\nEnter name you want to search: ");
	gets(name);
	for (int i = 0;i <nstud;i++) {
		
		k= k+ search(pNm[i], name);
	}
	if (k > 0) {
		printf("Name Found %d times", k);
	}
	else {
		printf("Name not found");
	}

	for (int i = 0;i < nstud;i++) {


		free(pNm[i]);
	}
	
	free(pNm);
	_getch();
	return 0;
}