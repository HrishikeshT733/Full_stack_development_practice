#include "Header.h"
void sort(char ** pnmm,int n) {
	char temp[50];
	printf("\nNames after sorting is :\n");

	for (int i = 0;i<n-1;i++) {
		for (int j =0;j < n-i-1;j++) {
			if (strcmp(pnmm[j], pnmm[j + 1]) == 1) {
				
				strcpy(temp, pnmm[j]);
				(*(pnmm + j)) = (char*)realloc(*(pnmm+j), (strlen(pnmm[j+1]) + 1) * sizeof(char));
				strcpy(pnmm[j], pnmm[j + 1]);
			
				(*(pnmm + j+1)) = (char*)realloc(*(pnmm+j+1), (strlen(pnmm[j]) + 1) * sizeof(char));
				strcpy(pnmm[j + 1], temp);
			}
		}
		
	}
	
}