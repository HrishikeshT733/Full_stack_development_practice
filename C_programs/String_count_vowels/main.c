#include "Header.h"
int main() {
	char arr[SIZE],ch;
	accept(arr);
printf("No of vowels in string is %d\n",count(arr));
printf("After Altering case of string: ");
casealter(arr);
printf("\nEnter character you want to find how much time its occurs: ");
scanf(" %c", &ch);
printf("%d", occurence(arr,ch));
_getch();
return 0;
}