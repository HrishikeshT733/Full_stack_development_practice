#include "Header.h"
void Alter(char* ptr, int s) {

	int i=0,len=0,j=0;
	char mrk[SIZE];
	//while (*(ptr + i) != '\0') {//to get length
	//	len++;
	//	i++;
	//}
	for (i = 0;i < SIZE;i++){
		
		mrk[i] = *ptr;
		  if (mrk[i] != '\0') {
			   
			  // printf("%c", mrk[i]);
			   ptr= ptr+ 1;
			  
		  }
	}
	while(mrk[j]!='\0'){
		printf("%c", mrk[j]);
		j = j + 2;
  }
}