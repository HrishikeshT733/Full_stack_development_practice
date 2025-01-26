#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int main() {
	int nstud, * ptr, mstud;
	float sum = 0;
	float avg;
	printf("Enter no of students: ");
	scanf("%d", &nstud);
	ptr = (int*)malloc(nstud * sizeof(int));
	//ptr=(int*)calloc(nstud,sizeof(int));  //same as malloc 
	if (ptr == NULL) { //if dynamic memory allocation fails 
		printf("Insufficient memory...");
		_getch();
		exit(0);
	}
	printf("Enter marks of %d students", nstud);
	for (int i = 0;i < nstud;i++) {
		scanf("%d", &ptr[i]);
		//scanf("%d",ptr+i); method 2
		sum = sum + ptr[i];
		//sum=sum+*(ptr+i);

	}
	avg = sum / nstud;
	printf("Average is : %f", avg);
	printf("\nmarks of %d students is: ", nstud);
	for (int i = 0;i < nstud;i++) {
		printf("%d\n", ptr[i]);
		//scanf("%d",ptr+i); method 2

	}
	printf("Enter extra number of students: ");
	scanf("%d", &mstud);
	ptr = realloc(ptr, (nstud + mstud) * sizeof(int)); //we can also change name of 'ptr' variable example-'atr=realloc(...)' but keep name same as declaring new variable accomodate new memory
	if (ptr == NULL) { //if dynamic memory allocation fails 
		printf("Insufficient memory...");
		_getch();
		exit(0);
	}
	printf("\nEnter marks of  extra %d students: ", mstud);
	for (int i = nstud;i < mstud + nstud;i++) {
		scanf("%d", &ptr[i]);
	}
	printf("\nmarks of  %d students are :", (mstud + nstud));
	for (int i = 0;i < mstud + nstud;i++) {
		printf("%d\n", ptr[i]);
	}
	free(ptr); //to free allocated dynamic memory which is created in heap 
	_getch();
	return 0;
}