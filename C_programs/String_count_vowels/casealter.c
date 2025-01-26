#include "Header.h"
void casealter(char* ptr) {
	int i = 0, len = 0, j = 0;
	
	while (*(ptr + i) != '\0') { // to get length of string
		len++;
		i++;
	}
	for (int i = 0;i < len;i++){
		if (*(ptr+i) >= 65 && *(ptr + i) <= 90)//range of ascii value of Uppercase of alphabets
		{
			*(ptr + i) = *(ptr + i) + 32;
			printf("%c", *(ptr + i));
		}
		else if (*(ptr + i) >= 97 && *(ptr + i) <= 122)//range of ascii value of Lowecase of alphabets
		{
			*(ptr + i) = *(ptr + i) - 32;
			printf("%c", *(ptr + i));
		}
		else if (*(ptr + i) ==' '){//to print space
			printf("%c", *(ptr + i));
			j++;
		}
		
	
	}
	printf("\nNo of spaces in string is %d", j);

}