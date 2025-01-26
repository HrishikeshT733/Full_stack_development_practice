#include "Header.h"
int count(char* ptr) {
	int i = 0, len = 0, j =0;
	while (*(ptr + i) != '\0'){
		len++;
		i++;
	}
	for(int i=0;i<len;i++){
		if (*(ptr + i) == 'a'|| *(ptr + i) == 'e'|| *(ptr + i) == 'i' || *(ptr + i) == 'o' || *(ptr + i) == 'u' || *(ptr + i) == 'A' || *(ptr + i) == 'E' || *(ptr + i) == 'I' || *(ptr + i) == 'O' || *(ptr + i) == 'U') {
			j++;
		}
		
		
	}
	return j;
}