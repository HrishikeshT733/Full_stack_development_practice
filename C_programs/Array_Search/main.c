#include "Header.h"
int main() {
	int arr[SIZE],sear,index=0;
	
	printf("Enter %d numbers ", SIZE);
	for (int i = 0;i < SIZE;i++) {
		scanf_s("%d", &arr[i]);
	}
	printf("Enter number to be search: ");
	scanf_s("%d", &sear);
	search(arr,SIZE,sear,&index);
    printf("array found at position %d",index+1);
	_getch();
	return 0;
}