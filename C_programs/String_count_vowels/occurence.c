#include "Header.h"
int occurence(char* ptr, char a) {
	int i = 0,j=0,len=0;
	while (*(ptr + i) != '\0') { // to get length of string
		len++;
		i++;
	}
	for (i = 0;i < len;i++) {
		if (*(ptr + i) == a) {
			j++;
		}
	}
	return j;
}